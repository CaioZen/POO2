package controlador;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import visao.JDialogListarUsr;
import visao.JDialogNovoUsuario;
import visao.JFramePrincipal;

public class GerenciadorInterfaceGrafica {

    private static final GerenciadorInterfaceGrafica instancia = new GerenciadorInterfaceGrafica();

    private GerenciadorDominio gerDominio = null;
    
    private JFramePrincipal janelaPrincipal = null;
    private JDialogNovoUsuario janelaNovoUsuario = null;
    private JDialogListarUsr janelaListarUsr = null;

    public static GerenciadorInterfaceGrafica getInstancia() {
        return instancia;
    }

    private GerenciadorInterfaceGrafica() {
        gerDominio = new GerenciadorDominio();
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

    public void sair() {
        System.exit(0);
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
