package visao;

import controlador.GerenciadorInterfaceGrafica;

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
        historiaMenu = new javax.swing.JMenu();
        novaHistoriaItem = new javax.swing.JMenuItem();
        listarHistoriasItem = new javax.swing.JMenuItem();
        partidasMenu = new javax.swing.JMenu();
        novaPartidaItem = new javax.swing.JMenuItem();
        listaPartidasItem = new javax.swing.JMenuItem();
        catalogoMenu = new javax.swing.JMenu();
        classesItem = new javax.swing.JMenuItem();
        racasItem = new javax.swing.JMenuItem();
        antecedentesItem = new javax.swing.JMenuItem();
        alinhamentosItem = new javax.swing.JMenuItem();

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

        iconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        sairItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        sairItem.setText("Sair");
        sairItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairItemActionPerformed(evt);
            }
        });
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

        historiaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historia.png"))); // NOI18N
        historiaMenu.setText("Histórias");

        novaHistoriaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addLivro.png"))); // NOI18N
        novaHistoriaItem.setText("Nova História");
        novaHistoriaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaHistoriaItemActionPerformed(evt);
            }
        });
        historiaMenu.add(novaHistoriaItem);

        listarHistoriasItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listarHistorias.png"))); // NOI18N
        listarHistoriasItem.setText("Listar Historias");
        historiaMenu.add(listarHistoriasItem);

        menuPrincipal.add(historiaMenu);

        partidasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/partida.png"))); // NOI18N
        partidasMenu.setMnemonic('p');
        partidasMenu.setText("Partidas");

        novaPartidaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novaPartida.png"))); // NOI18N
        novaPartidaItem.setMnemonic('n');
        novaPartidaItem.setText("Nova Partida");
        novaPartidaItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        novaPartidaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaPartidaItemActionPerformed(evt);
            }
        });
        partidasMenu.add(novaPartidaItem);

        listaPartidasItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lista.png"))); // NOI18N
        listaPartidasItem.setMnemonic('l');
        listaPartidasItem.setText("Listar Partidas");
        listaPartidasItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        listaPartidasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPartidasItemActionPerformed(evt);
            }
        });
        partidasMenu.add(listaPartidasItem);

        menuPrincipal.add(partidasMenu);

        catalogoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/catalogo.png"))); // NOI18N
        catalogoMenu.setText("Catálogo");

        classesItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/classes.png"))); // NOI18N
        classesItem.setText("Classes");
        catalogoMenu.add(classesItem);

        racasItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raças.png"))); // NOI18N
        racasItem.setText("Raças");
        catalogoMenu.add(racasItem);

        antecedentesItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/antecedentes.png"))); // NOI18N
        antecedentesItem.setText("Antecedentes");
        catalogoMenu.add(antecedentesItem);

        alinhamentosItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alinhamentos.png"))); // NOI18N
        alinhamentosItem.setText("Alinhamentos");
        catalogoMenu.add(alinhamentosItem);

        menuPrincipal.add(catalogoMenu);

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
                .addGap(0, 671, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoUsuarioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioItemActionPerformed
        GerenciadorInterfaceGrafica.getInstancia().abrirJanelaCadUsuario();
    }//GEN-LAST:event_novoUsuarioItemActionPerformed

    private void listaUsuarioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsuarioItemActionPerformed
        GerenciadorInterfaceGrafica.getInstancia().abrirListarUsr();
    }//GEN-LAST:event_listaUsuarioItemActionPerformed

    private void novaPartidaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaPartidaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novaPartidaItemActionPerformed

    private void listaPartidasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPartidasItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaPartidasItemActionPerformed

    private void sairItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairItemActionPerformed
        GerenciadorInterfaceGrafica.getInstancia().sair();
    }//GEN-LAST:event_sairItemActionPerformed

    private void novaHistoriaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaHistoriaItemActionPerformed
        GerenciadorInterfaceGrafica.getInstancia().abrirCadHistoria();
    }//GEN-LAST:event_novaHistoriaItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alinhamentosItem;
    private javax.swing.JMenuItem antecedentesItem;
    private javax.swing.JMenu catalogoMenu;
    private javax.swing.JMenuItem classesItem;
    private javax.swing.JMenu historiaMenu;
    private javax.swing.JMenu iconMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listaPartidasItem;
    private javax.swing.JMenuItem listaUsuarioItem;
    private javax.swing.JMenuItem listarHistoriasItem;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem novaHistoriaItem;
    private javax.swing.JMenuItem novaPartidaItem;
    private javax.swing.JMenuItem novoUsuarioItem;
    private javax.swing.JMenu partidasMenu;
    private javax.swing.JMenuItem racasItem;
    private javax.swing.JMenuItem sairItem;
    private javax.swing.JMenu usuarioMenu;
    // End of variables declaration//GEN-END:variables
}
