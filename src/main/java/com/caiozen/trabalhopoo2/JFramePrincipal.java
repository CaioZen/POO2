/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.caiozen.trabalhopoo2;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author 2023122760123
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        iconMenu = new javax.swing.JMenu();
        sairItem = new javax.swing.JMenuItem();
        usuarioMenu = new javax.swing.JMenu();
        novoUsuarioItem = new javax.swing.JMenuItem();
        listaUsuarioItem = new javax.swing.JMenuItem();
        partidasMenu = new javax.swing.JMenu();
        novaPartidaItem = new javax.swing.JMenuItem();
        listaPartidasItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D20 Matchmaker v1.0");

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("D20 Matchmaker");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(jLabel1)
                .addContainerGap(581, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        iconMenu.setText("Icon");

        sairItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        sairItem.setText("Sair");
        iconMenu.add(sairItem);

        menuPrincipal.add(iconMenu);

        usuarioMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Usuario.png"))); // NOI18N
        usuarioMenu.setMnemonic('u');
        usuarioMenu.setText("Usuário");

        novoUsuarioItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/NovoUsuario.png"))); // NOI18N
        novoUsuarioItem.setMnemonic('n');
        novoUsuarioItem.setText("Novo Usuário");
        novoUsuarioItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        novoUsuarioItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        novoUsuarioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioItemActionPerformed(evt);
            }
        });
        usuarioMenu.add(novoUsuarioItem);

        listaUsuarioItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lista.png"))); // NOI18N
        listaUsuarioItem.setMnemonic('l');
        listaUsuarioItem.setText("Listar Usuários");
        listaUsuarioItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        listaUsuarioItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        listaUsuarioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUsuarioItemActionPerformed(evt);
            }
        });
        usuarioMenu.add(listaUsuarioItem);

        menuPrincipal.add(usuarioMenu);

        partidasMenu.setMnemonic('p');
        partidasMenu.setText("Partidas");

        novaPartidaItem.setMnemonic('n');
        novaPartidaItem.setText("Nova Partida");
        novaPartidaItem.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        novaPartidaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaPartidaItemActionPerformed(evt);
            }
        });
        partidasMenu.add(novaPartidaItem);

        listaPartidasItem.setMnemonic('l');
        listaPartidasItem.setText("Listar Partidas");
        listaPartidasItem.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        listaPartidasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPartidasItemActionPerformed(evt);
            }
        });
        partidasMenu.add(listaPartidasItem);

        menuPrincipal.add(partidasMenu);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 665, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoUsuarioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioItemActionPerformed
        JDialogNovoUsuario jDialogNovoUsuario = new JDialogNovoUsuario(this, true);
        jDialogNovoUsuario.setVisible(true);
    }//GEN-LAST:event_novoUsuarioItemActionPerformed

    private void listaUsuarioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsuarioItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaUsuarioItemActionPerformed

    private void novaPartidaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaPartidaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novaPartidaItemActionPerformed

    private void listaPartidasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPartidasItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPartidasItemActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu iconMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listaPartidasItem;
    private javax.swing.JMenuItem listaUsuarioItem;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem novaPartidaItem;
    private javax.swing.JMenuItem novoUsuarioItem;
    private javax.swing.JMenu partidasMenu;
    private javax.swing.JMenuItem sairItem;
    private javax.swing.JMenu usuarioMenu;
    // End of variables declaration//GEN-END:variables
}
