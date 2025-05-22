package controlador;

import dao.ConexaoHibernate;
import dominio.Usuario;
import java.util.List;

public class GerenciadorDominio {

    private Usuario usuarioSelecionado;

    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory().openSession();        
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }
}
