package controlador;

import dao.ListaUsuarios;
import dominio.Usuario;
import java.util.List;

public class GerenciadorDominio {

    private final ListaUsuarios usuarios;
    private Usuario usuarioSelecionado;

    public GerenciadorDominio() {
        usuarios = new ListaUsuarios();
    }

    public List<Usuario> listarUsuarios() {
        return usuarios.listarUsrs();
    }

    public void addUsuarios(Usuario usr) {
        usuarios.addUsr(usr);
    }

    public void removerUsuarios(Usuario usr) {
        usuarios.removerUsr(usr);
    }

    public void setUsuarioSelecionado(int linha) {
        usuarioSelecionado = usuarios.getUsrSelecionado(linha);
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }
}
