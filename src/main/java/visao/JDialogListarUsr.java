/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visao;

import controlador.GerenciadorInterfaceGrafica;
import controlador.TableModelUsuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Caio
 */
public class JDialogListarUsr extends javax.swing.JDialog {

    private TableModelUsuario tableModelUsuario;
    private TableRowSorter<TableModelUsuario> sorter;

    public JDialogListarUsr(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnSelecionar.setVisible(false);
        tableModelUsuario = new TableModelUsuario();
        tabelaUsr.setModel(tableModelUsuario);
        sorter = new TableRowSorter<>(tableModelUsuario);
        tabelaUsr.setRowSorter(sorter);
        textFieldPesquisar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                filtrarTabelaUsr(textFieldPesquisar.getText());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTabela = new javax.swing.JPopupMenu();
        menuItemEditar = new javax.swing.JMenuItem();
        menuItemExcluir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemDesc = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsr = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        labelPesquisar = new javax.swing.JLabel();
        textFieldPesquisar = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();

        menuItemEditar.setText("Editar");
        menuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditarActionPerformed(evt);
            }
        });
        menuTabela.add(menuItemEditar);

        menuItemExcluir.setText("Excluir");
        menuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExcluirActionPerformed(evt);
            }
        });
        menuTabela.add(menuItemExcluir);
        menuTabela.add(jSeparator1);

        menuItemDesc.setText("Abrir Descrição Detalhada");
        menuTabela.add(menuItemDesc);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Usuários"));
        jPanel1.setToolTipText("");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela"));

        tabelaUsr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Celular", "E-mail", "UF", "Cidade", "CEP", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsr.setComponentPopupMenu(menuTabela);
        jScrollPane1.setViewportView(tabelaUsr);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remove.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        labelPesquisar.setText("Pesquisar por nome:");

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(labelPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnAdd)
                                .addGap(25, 25, 25)
                                .addComponent(btnSelecionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemover)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisar)
                    .addComponent(textFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        GerenciadorInterfaceGrafica.getInstancia().abrirJanelaCadUsuario();
        dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //ATUALIZA A TABELA
        tableModelUsuario = new TableModelUsuario();
        tabelaUsr.setModel(tableModelUsuario);
        if (GerenciadorInterfaceGrafica.getInstancia().isEditar()) {
            btnSelecionar.setVisible(true);
            btnAdd.setVisible(false);
            btnRemover.setVisible(false);
        } else {
            btnSelecionar.setVisible(false);
            btnAdd.setVisible(true);
            btnRemover.setVisible(true);
        }
        GerenciadorInterfaceGrafica.getInstancia().setEditar(false);
    }//GEN-LAST:event_formComponentShown

    private void menuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarActionPerformed
        //EDITAR AINDA NÃO FUNCIONA SE O USUARIO RESOLVER CANCELAR A EDIÇÃO
        int linha = tabelaUsr.getSelectedRow();
        GerenciadorInterfaceGrafica.getInstancia().setUsrSelec(linha);
        GerenciadorInterfaceGrafica.getInstancia().setEditar(true);
        GerenciadorInterfaceGrafica.getInstancia().abrirJanelaCadUsuario();
        tableModelUsuario.remover(linha); //ESSA LINHA SAIRÁ DAQUI NO FUTURO, NÃO CONSEGUI PENSAR EM OUTRA SOLUÇÃO
        GerenciadorInterfaceGrafica.getInstancia().removerUsuario(GerenciadorInterfaceGrafica.getInstancia().getUsrSelec()); //ESSA TAMBÉM
        dispose();
    }//GEN-LAST:event_menuItemEditarActionPerformed

    private void menuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExcluirActionPerformed
        int linha = tabelaUsr.getSelectedRow();
        if (linha >= 0) {
            GerenciadorInterfaceGrafica.getInstancia().setUsrSelec(linha);
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o usuário?",
                    "Excluir usuário", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                tableModelUsuario.remover(linha);
                GerenciadorInterfaceGrafica.getInstancia().removerUsuario(GerenciadorInterfaceGrafica.getInstancia().getUsrSelec());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha válida", "Error ao excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuItemExcluirActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnSelecionarActionPerformed
    private void filtrarTabelaUsr(String pesquisa) {
        String texto = pesquisa.trim();
        if (texto.isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 0));
            tabelaUsr.setRowSorter(sorter);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JMenuItem menuItemDesc;
    private javax.swing.JMenuItem menuItemEditar;
    private javax.swing.JMenuItem menuItemExcluir;
    private javax.swing.JPopupMenu menuTabela;
    private javax.swing.JTable tabelaUsr;
    private javax.swing.JTextField textFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
