package view;

import controller.ControllerProdutos;
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
import model.ModelProdutos;

public class ViewProdutoFormListaProdutos extends javax.swing.JFrame {

    ViewProdutoFormCadastro viewProdutoFormCadastro = new ViewProdutoFormCadastro();
    ModelProdutos modelProdutos = new ModelProdutos();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();

    public ViewProdutoFormListaProdutos() {
        initComponents();
        carregarProdutos();
        setLocationRelativeTo(null);
        
        // Seta ícone da aplicação
        URL url = this.getClass().getResource("/imagens/marca/appicon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbCadastroProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(251, 245, 95));

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel12.setText("Lista de produtos");

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar");

        jtfPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPesquisarFocusLost(evt);
            }
        });
        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyTyped(evt);
            }
        });

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

        jbCadastroProduto.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbCadastroProduto.setForeground(new java.awt.Color(251, 245, 95));
        jbCadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/cad_prod.png"))); // NOI18N
        jbCadastroProduto.setText("CADASTRO DE PRODUTO");
        jbCadastroProduto.setBorder(null);
        jbCadastroProduto.setContentAreaFilled(false);
        jbCadastroProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastroProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCadastroProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCadastroProdutoMouseExited(evt);
            }
        });
        jbCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jbCadastroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jtProdutos.getTableHeader().setFont(new java.awt.Font("Consolas", 0, 14));
        jtProdutos.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Preço", "Estoque"
            }
        ));
        jtProdutos.setSelectionBackground(new java.awt.Color(251, 245, 95));
        jtProdutos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jtProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfPesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesquisarFocusLost
       
    }//GEN-LAST:event_jtfPesquisarFocusLost

    private void jtfPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyTyped
        DefaultTableModel modelo = (DefaultTableModel) this.jtProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtProdutos.setRowSorter(classificador);
        String texto = jtfPesquisar.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jtfPesquisarKeyTyped

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
            //Instancia um novo formulário de cadastro
            viewProdutoFormCadastro = new ViewProdutoFormCadastro();
            
            // Linha da tabela
            int linha = jtProdutos.getSelectedRow();
            int codigoProduto = (int) jtProdutos.getValueAt(linha, 0);

            // Recupera dados do banco
            modelProdutos = controllerProdutos.getProdutoController(codigoProduto);

            this.dispose();
            viewProdutoFormCadastro.habilitarBotaoSalvar();
            viewProdutoFormCadastro.setVisible(true);
            viewProdutoFormCadastro.habilitarDesabilitarCampos(true);
            viewProdutoFormCadastro.setState(ViewProdutoFormCadastro.NORMAL);
            
            //Preenche os campos
            viewProdutoFormCadastro.setCampos(modelProdutos);

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

        int linha = jtProdutos.getSelectedRow();
        int codigoProduto = (int) jtProdutos.getValueAt(linha, 0);

        try {
            if (controllerVendasProdutos.getVendaPorProdutoController(codigoProduto)) {
                JOptionPane.showMessageDialog(this, "Não é possível excluir um produto que está ligado a uma venda", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                if (controllerProdutos.excluirProdutoController(codigoProduto)) {
                    JOptionPane.showMessageDialog(this, "Produto excluído com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                    carregarProdutos();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível excluir o produto", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCadastroProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastroProdutoMouseEntered
        jbCadastroProduto.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbCadastroProdutoMouseEntered

    private void jbCadastroProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastroProdutoMouseExited
        jbCadastroProduto.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbCadastroProdutoMouseExited

    private void jbCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroProdutoActionPerformed
        new ViewProdutoFormCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCadastroProdutoActionPerformed

    /**
     * Preencher a tabela com os produtos cadastrados no banco
     */
    private void carregarProdutos() {
        listaModelProdutos = controllerProdutos.getListaProdutosController();
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);

        // Inserir na tabela
        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getProdId(),
                listaModelProdutos.get(i).getProdNome(),
                "R$ " + listaModelProdutos.get(i).getProdPreco(),
                listaModelProdutos.get(i).getProdEstoque()
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
            java.util.logging.Logger.getLogger(ViewProdutoFormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoFormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoFormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoFormListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProdutoFormListaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastroProduto;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextField jtfPesquisar;
    // End of variables declaration//GEN-END:variables
}
