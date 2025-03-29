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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelPartida1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelMestre1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelData1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelPartida2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelMestre2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelData2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaNumeroPartidas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaNumeroHistorias = new javax.swing.JTable();
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
        setResizable(false);

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Próximas Partidas"));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelPartida1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelPartida1.setText("Partida 01");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Mestre:");

        labelMestre1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMestre1.setText("Caio");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Data:");
        jLabel7.setToolTipText("");

        labelData1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelData1.setText("00/00/0000");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Local:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Lorem Ipsum, Lorem Ipsum");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Historia:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Aventuras");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPartida1)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMestre1)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelData1)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPartida1)
                    .addComponent(jLabel6)
                    .addComponent(labelMestre1)
                    .addComponent(jLabel7)
                    .addComponent(labelData1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelPartida2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelPartida2.setText("Partida 02");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Mestre:");

        labelMestre2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelMestre2.setText("Victor Costa");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Data:");
        jLabel11.setToolTipText("");

        labelData2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelData2.setText("00/00/0000");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Local:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Lorem Ipsum, Lorem Ipsum");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Historia:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Jornadas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPartida2)
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMestre2)
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelData2)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPartida2)
                    .addComponent(jLabel10)
                    .addComponent(labelMestre2)
                    .addComponent(jLabel11)
                    .addComponent(labelData2)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(99, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Historias com mais Partidas"));

        tabelaNumeroPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Historia", "Numero de Partidas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaNumeroPartidas);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios com mais Historias"));

        tabelaNumeroHistorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Numero de Historias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaNumeroHistorias);

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
        listarHistoriasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarHistoriasItemActionPerformed(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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

    private void listarHistoriasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarHistoriasItemActionPerformed
        GerenciadorInterfaceGrafica.getInstancia().abrirListarHis();
    }//GEN-LAST:event_listarHistoriasItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alinhamentosItem;
    private javax.swing.JMenuItem antecedentesItem;
    private javax.swing.JMenu catalogoMenu;
    private javax.swing.JMenuItem classesItem;
    private javax.swing.JMenu historiaMenu;
    private javax.swing.JMenu iconMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelData1;
    private javax.swing.JLabel labelData2;
    private javax.swing.JLabel labelMestre1;
    private javax.swing.JLabel labelMestre2;
    private javax.swing.JLabel labelPartida1;
    private javax.swing.JLabel labelPartida2;
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
    private javax.swing.JTable tabelaNumeroHistorias;
    private javax.swing.JTable tabelaNumeroPartidas;
    private javax.swing.JMenu usuarioMenu;
    // End of variables declaration//GEN-END:variables
}
