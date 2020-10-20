package view;

import controller.ControllerUsuarios;
import controller.ControllerVendasProdutos;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelUsuarios;

public class ViewUsuarioFormListaUsuarios extends javax.swing.JFrame {

    ViewUsuarioFormCadastro viewUsuarioFormCadastro = new ViewUsuarioFormCadastro();
    ControllerUsuarios controllerUsuarios = new ControllerUsuarios();
    ModelUsuarios modelUsuarios = new ModelUsuarios();
    ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<>();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();

    public ViewUsuarioFormListaUsuarios() {
        initComponents();
        carregarUsuarios();
        setLocationRelativeTo(null);

        // Seta o ícone da aplicação
        URL url = this.getClass().getResource("/imagens/marca/appicon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbCadastroUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");

        jPanel1.setBackground(new java.awt.Color(251, 245, 95));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setText("Lista de Usuários");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Pesquisa");

        jtfPesquisar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyTyped(evt);
            }
        });

        jtUsuarios.getTableHeader().setFont(new java.awt.Font("Consolas", 0, 14));
        jtUsuarios.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuarios.setSelectionBackground(new java.awt.Color(251, 245, 95));
        jtUsuarios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jtUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jbAlterar.setBackground(new java.awt.Color(255, 255, 255));
        jbAlterar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbAlterar.setForeground(new java.awt.Color(251, 245, 95));
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/edit.png"))); // NOI18N
        jbAlterar.setText("ALTERAR");
        jbAlterar.setBorder(null);
        jbAlterar.setContentAreaFilled(false);
        jbAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAlterarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbAlterarMouseReleased(evt);
            }
        });
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbExcluir.setForeground(new java.awt.Color(251, 245, 95));
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/delete.png"))); // NOI18N
        jbExcluir.setText("EXCLUIR");
        jbExcluir.setBorder(null);
        jbExcluir.setContentAreaFilled(false);
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbExcluirMouseExited(evt);
            }
        });
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(251, 245, 95));
        jLabel3.setText("|");

        jbCadastroUsuario.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbCadastroUsuario.setForeground(new java.awt.Color(251, 245, 95));
        jbCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/cad.png"))); // NOI18N
        jbCadastroUsuario.setText("CADASTRO DE USUÁRIOS");
        jbCadastroUsuario.setBorder(null);
        jbCadastroUsuario.setContentAreaFilled(false);
        jbCadastroUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCadastroUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCadastroUsuarioMouseExited(evt);
            }
        });
        jbCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseEntered
        jbAlterar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbAlterarMouseEntered

    private void jbAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseExited
        jbAlterar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbAlterarMouseExited

    private void jbAlterarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseReleased

    }//GEN-LAST:event_jbAlterarMouseReleased

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        try {
            viewUsuarioFormCadastro = new ViewUsuarioFormCadastro();
            
            // Pega a linha
            int linha = jtUsuarios.getSelectedRow();
            
            // Pega a coluna (códgio)
            int codigoUsuario = (int) jtUsuarios.getValueAt(linha, 0);

            // Recupera dados do banco a partir do código
            modelUsuarios = controllerUsuarios.getUsuariosController(codigoUsuario);

            // Fecha esta tela
            this.dispose();
            viewUsuarioFormCadastro.habilitarBotaoSalvar();
            viewUsuarioFormCadastro.setVisible(true);
            viewUsuarioFormCadastro.habilitarCampos(true);
            viewUsuarioFormCadastro.setState(ViewUsuarioFormCadastro.NORMAL);
            
            // Preenche os campos
            viewUsuarioFormCadastro.setCampos(modelUsuarios);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseEntered
        jbExcluir.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbExcluirMouseEntered

    private void jbExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseExited
        jbExcluir.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbExcluirMouseExited

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        // Pega a linha
        int linha = jtUsuarios.getSelectedRow();
        
        // Pega a coluna (códgio)
        int codigoUsuario = (int) jtUsuarios.getValueAt(linha, 0);

        // Exclui o usuário
        if (controllerUsuarios.excluirUsuariosController(codigoUsuario)) {
            JOptionPane.showMessageDialog(this, "Usuario excluído com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
            this.carregarUsuarios();
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível excluir o cliente", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCadastroUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastroUsuarioMouseEntered
        jbCadastroUsuario.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbCadastroUsuarioMouseEntered

    private void jbCadastroUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastroUsuarioMouseExited
        jbCadastroUsuario.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbCadastroUsuarioMouseExited

    private void jbCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroUsuarioActionPerformed
        new ViewUsuarioFormCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCadastroUsuarioActionPerformed

    private void jtfPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyTyped
        DefaultTableModel modelo = (DefaultTableModel) this.jtUsuarios.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtUsuarios.setRowSorter(classificador);
        String texto = jtfPesquisar.getText().toUpperCase();;
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jtfPesquisarKeyTyped

    /**
     * Carregar usuários na tabela
     */
    private void carregarUsuarios() {
        listaModelUsuarios = controllerUsuarios.getListaUsuariosController();
        DefaultTableModel modelo = (DefaultTableModel) jtUsuarios.getModel();
        modelo.setNumRows(0);

        int cont = listaModelUsuarios.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUsuarios.get(i).getUsuarioId(),
                listaModelUsuarios.get(i).getUsuarioNome(),
                listaModelUsuarios.get(i).getUsuarioEmail()
            });
        }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarioFormListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarioFormListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarioFormListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarioFormListaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuarioFormListaUsuarios().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastroUsuario;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTable jtUsuarios;
    private javax.swing.JTextField jtfPesquisar;
    // End of variables declaration//GEN-END:variables
}
