package controlador;

import dao.ConexaoHibernate;
import dao.DaoGenerico;
import dominio.Personagem;
import dominio.Raca;
import dominio.SubRaca;
import dominio.Usuario;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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

    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();
        dao = new DaoGenerico();
    }

    public List listar(Class classe) throws HibernateException {
        return dao.listar(classe);
    }

    public void excluir(Object objeto) throws HibernateException {
        dao.excluir(objeto);
    }

    public Usuario inserirUsuario(String nome, String celular, String email, String cep, String cidade, String uf,
            int numeroCasa, String rua, String bairro, String referencia, Icon foto) {

        Usuario user = new Usuario(nome, celular, email, cep, cidade, uf, numeroCasa, rua, bairro, referencia, IconToBytes(foto));
        dao.inserir(user);
        return user;
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
