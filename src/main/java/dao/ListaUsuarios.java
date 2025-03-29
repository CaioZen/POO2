package dao;

import dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    //ESTA FUNÇÃO NO FUTURO SE TORNARÁ A FUNÇÃO USUARIODAO, COM AS ALTERAÇÕES NECESSARIAS CLARO;

    private List<Usuario> lista;

    public ListaUsuarios() {
        this.lista = new ArrayList<>();
    }

    public void addUsr(Usuario usr) {
        lista.add(usr);
    }

    public void removerUsr(Usuario usr) {
        lista.remove(usr);
    }

    public List<Usuario> listarUsrs() {
        return new ArrayList<>(lista);
    }

    public Usuario getUsrSelecionado(int linha) {
        return lista.get(linha);
    }
}
