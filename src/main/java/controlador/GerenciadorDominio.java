package controlador;

import dao.ListaUsuarios;
import dominio.Usuario;
import java.util.List;

public class GerenciadorDominio {

    private final ListaUsuarios usuarios;

    public GerenciadorDominio() {
        usuarios = new ListaUsuarios();
    }

    public List<Usuario> listarUsuarios() {
        return usuarios.listarUsrs();
    }

    public void addUsuarios(Usuario usr) {
        usuarios.addUsr(usr);
    }
}
