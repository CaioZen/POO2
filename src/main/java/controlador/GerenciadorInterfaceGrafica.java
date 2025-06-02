package controlador;

import com.formdev.flatlaf.FlatDarkLaf;
import dominio.Usuario;
import java.awt.Dialog;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.hibernate.HibernateException;
import visao.JDialogAlinhamentos;
import visao.JDialogAntecedentes;
import visao.JDialogBuscarHis;
import visao.JDialogClasses;
import visao.JDialogListarHis;
import visao.JDialogListarUsr;
import visao.JDialogNovaHistoria;
import visao.JDialogNovaPartida;
import visao.JDialogNovoPersonagem;
import visao.JDialogNovoUsuario;
import visao.JDialogRacas;
import visao.JFramePrincipal;

public class GerenciadorInterfaceGrafica {

    private static final GerenciadorInterfaceGrafica instancia = new GerenciadorInterfaceGrafica();

    private GerenciadorDominio gerDominio = null;

    private JFramePrincipal janelaPrincipal = null;
    private JDialogNovoUsuario janelaNovoUsuario = null;
    private JDialogListarUsr janelaListarUsr = null;
    private JDialogNovaHistoria janelaNovaHistoria = null;
    private JDialogListarHis janelaListarHis = null;
    private JDialogNovaPartida janelaNovaPartida = null;
    private JDialogBuscarHis janelaBuscarHis = null;
    private JDialogNovoPersonagem janelaNovoPersonagem = null;
    private JDialogClasses janelaClasses = null;
    private JDialogAntecedentes janelaAntecedentes = null;
    private JDialogAlinhamentos janelaAlinhamentos = null;
    private JDialogRacas janelaRacas = null;

    private boolean editar = false;

    public static GerenciadorInterfaceGrafica getInstancia() {
        return instancia;
    }

    private GerenciadorInterfaceGrafica() {
        gerDominio = new GerenciadorDominio();
    }

    public GerenciadorDominio getGerDominio() {
        return gerDominio;
    }

    public JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

    public void abrirJanelaPrincipal() {
        if (janelaPrincipal == null) {
            janelaPrincipal = new JFramePrincipal();
        }
        janelaPrincipal.setVisible(true);
    }

    public void abrirJanelaCadUsuario() {
        janelaNovoUsuario = (JDialogNovoUsuario) abrirJanela(janelaPrincipal, janelaNovoUsuario, JDialogNovoUsuario.class);
    }

    public void abrirListarUsr() {
        janelaListarUsr = (JDialogListarUsr) abrirJanela(janelaPrincipal, janelaListarUsr, JDialogListarUsr.class);
    }

    public void abrirCadHistoria() {
        janelaNovaHistoria = (JDialogNovaHistoria) abrirJanela(janelaPrincipal, janelaNovaHistoria, JDialogNovaHistoria.class);
    }

    public void abrirListarHis() {
        janelaListarHis = (JDialogListarHis) abrirJanela(janelaPrincipal, janelaListarHis, JDialogListarHis.class);
    }

    public void abirNovaPartida() {
        janelaNovaPartida = (JDialogNovaPartida) abrirJanela(janelaPrincipal, janelaNovaPartida, JDialogNovaPartida.class);
    }

    public void abrirBuscarHis() {
        janelaBuscarHis = (JDialogBuscarHis) abrirJanela(janelaPrincipal, janelaBuscarHis, JDialogBuscarHis.class);
    }

    public void abrirNovoPersonagem() {
        janelaNovoPersonagem = (JDialogNovoPersonagem) abrirJanela(janelaPrincipal, janelaNovoPersonagem, JDialogNovoPersonagem.class);
    }

    public void abrirClasses() {
        janelaClasses = (JDialogClasses) abrirJanela(janelaPrincipal, janelaClasses, JDialogClasses.class);
    }

    public void abrirAlinhamentos() {
        janelaAlinhamentos = (JDialogAlinhamentos) abrirJanela(janelaPrincipal, janelaAlinhamentos, JDialogAlinhamentos.class);
    }

    public void abrirAntecedentes() {
        janelaAntecedentes = (JDialogAntecedentes) abrirJanela(janelaPrincipal, janelaAntecedentes, JDialogAntecedentes.class);
    }

    public void abrirRacas() {
        janelaRacas = (JDialogRacas) abrirJanela(janelaPrincipal, janelaRacas, JDialogRacas.class);
    }

    public void sair() {
        System.exit(0);
    }

    public void carregarCombo(JComboBox combobox, Class classe) {
        try {
            List lista = gerDominio.listar(classe);
            combobox.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (HibernateException ex) {
            System.out.println("Deu errado");
        }
    }
    
    public void carregarLista(JList lista, Class classe) {
    try {
        List dados = gerDominio.listar(classe);
        DefaultListModel modeloLista = new DefaultListModel();
        
        for (Object obj : dados) {
            modeloLista.addElement(obj);
        }
        
        lista.setModel(modeloLista);
    } catch (HibernateException ex) {
        System.out.println("Deu errado");
    }
}

    public Usuario getUsrSelec() {
        return gerDominio.getUsuarioSelecionado();
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>
        //</editor-fold>
        GerenciadorInterfaceGrafica gerIG = GerenciadorInterfaceGrafica.getInstancia();
        gerIG.abrirJanelaPrincipal();
    }
}
