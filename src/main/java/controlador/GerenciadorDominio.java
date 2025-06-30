package controlador;

import dao.ConexaoHibernate;
import dao.DaoGenerico;
import dao.HistoriaDAO;
import dao.PartidaDAO;
import dao.PersonagemDAO;
import dao.PersonagensHistoriaDAO;
import dao.UsuarioDAO;
import dominio.Alinhamento;
import dominio.Antecedente;
import dominio.Classe;
import dominio.Historia;
import dominio.HistoriaStatus;
import dominio.Partida;
import dominio.Personagem;
import dominio.PersonagensHistoria;
import dominio.Raca;
import dominio.SubRaca;
import dominio.Usuario;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.Icon;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class GerenciadorDominio {

    private Usuario usuarioSelecionado;
    private DaoGenerico dao;
    private UsuarioDAO usrDao;
    private PartidaDAO parDao;
    private PersonagensHistoriaDAO phDao;
    private PersonagemDAO perDao;
    private HistoriaDAO hisDao;

    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();
        dao = new DaoGenerico();
        usrDao = new UsuarioDAO();
        parDao = new PartidaDAO();
        phDao = new PersonagensHistoriaDAO();
        perDao = new PersonagemDAO();
        hisDao = new HistoriaDAO();
    }

    public List listar(Class classe) throws HibernateException {
        return dao.listar(classe);
    }

    public void excluir(Object objeto) throws HibernateException {
        dao.excluir(objeto);
    }

    public Usuario inserirUsuario(String nome, String celular, String email, String cep, String cidade, String uf,
            int numeroCasa, String rua, String bairro, String referencia, Icon foto) throws HibernateException {

        Usuario user = new Usuario(nome, celular, email, cep, cidade, uf, numeroCasa, rua, bairro, referencia, IconToBytes(foto));
        dao.inserir(user);
        return user;
    }

    public Usuario alterarUsuario(Usuario user, String nome, String celular, String email, String cep,
            String cidade, String uf, int numeroCasaI, String rua, String bairro, String referencia, Icon foto) throws HibernateException {

        user.setNome(nome);
        user.setCelular(celular);
        user.setEmail(email);
        user.setCep(cep);
        user.setCidade(cidade);
        user.setUf(uf);
        user.setNumeroCasa(numeroCasaI);
        user.setRua(rua);
        user.setBairro(bairro);
        user.setReferencia(referencia);
        user.setFoto(IconToBytes(foto));

        usrDao.alterar(user);
        return user;

    }

    public Personagem inserirPersonagem(Usuario mestre, String nome, int nivel, Classe classe, SubRaca subRaca, Antecedente ante, Alinhamento ali, Icon foto) {
        Personagem personagem = new Personagem(mestre, nome, nivel, classe, subRaca, ante, ali, IconToBytes(foto));
        dao.inserir(personagem);
        return personagem;
    }

    public PersonagensHistoria inserirPersonagensHistoria(Historia historia, Personagem personagem) {
        PersonagensHistoria ph = new PersonagensHistoria(historia, personagem);
        dao.inserir(ph);
        return ph;
    }

    public Historia inserirHistoria(String nome, String descricao, Usuario mestre) {
        Historia historia = new Historia(nome, descricao, HistoriaStatus.EM_ANDAMENTO, mestre);
        dao.inserir(historia);
        return historia;
    }

    public Historia alterarHistoria(Historia historia, String nome, String descricao, Usuario mestre, HistoriaStatus status) {
        historia.setNome(nome);
        historia.setDescricao(descricao);
        historia.setMestre(mestre);
        historia.setStatus(status);

        hisDao.alterar(historia);
        return historia;
    }

    public Historia carregarListaPersonagens(Historia his) {
        return hisDao.carregarListaPersonagens(his);
    }

    public Partida inserirPartida(int numero, String local, Date data, String descricao, Historia historia, List<PersonagensHistoria> listaPersonagens) {
        Partida partida = new Partida(numero, local, data, descricao, historia, listaPersonagens);
        dao.inserir(partida);
        return partida;
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;

    }

    public List<SubRaca> listarSubRacas(Raca raca) {
        Session session = null;
        List<SubRaca> lista = null;
        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            String hql = "from SubRaca where idRaca = :idRaca";
            Query<SubRaca> query = session.createQuery(hql, SubRaca.class);
            query.setParameter("idRaca", raca.getIdRaca());

            lista = query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return lista;
    }

    public List<Personagem> listarPersonagens(Usuario usuario) {
        Session session = null;
        List<Personagem> lista = null;
        try {
            session = ConexaoHibernate.getSessionFactory().openSession();
            String hql = "from Personagem where idUsr = :idUsr ";
            Query<Personagem> query = session.createQuery(hql, Personagem.class);
            query.setParameter("idUsr", usuario.getIdUsr());

            lista = query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return lista;

    }

    public List<Usuario> pesquisarUsuario(String pesq) {
        return usrDao.pesquisar(pesq);
    }

    public Long contarPartidas(int idHis) {
        return parDao.contarPartidasPorIdHis(idHis);
    }

    public List<PersonagensHistoria> pesquisarPersonagensHistoria(int idHis) {
        return phDao.pesquisar(idHis);
    }

    public List<Personagem> listarDisponiveis() {
        return perDao.listarDisponiveis();
    }

    public static byte[] IconToBytes(Icon icon) {
        if (icon == null) {
            return null;
        }
        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        icon.paintIcon(null, g2d, 0, 0);
        g2d.dispose();

        byte[] bFile = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            ImageOutputStream ios = ImageIO.createImageOutputStream(baos);
            try {
                ImageIO.write(img, "png", ios);
                // Set a flag to indicate that the write was successful
            } finally {
                ios.close();
            }
            bFile = baos.toByteArray();
        } catch (IOException ex) {
            bFile = null;
            System.out.println(ex);
        } finally {
            return bFile;
        }
    }
}
