package view;

import controller.ControllerClientes;
import controller.ControllerVendas;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelClientes;

public class ViewClienteFormListaClientes extends javax.swing.JFrame {
    ModelClientes modelClientes = new ModelClientes();
    ControllerClientes controllerClientes = new ControllerClientes();
    ControllerVendas controllerVendas = new ControllerVendas();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
    ViewClienteFormCadastro viewClienteFormCadastro;

    
    public ViewClienteFormListaClientes() {
        initComponents();
        setLocationRelativeTo(null);
        carregarClientes();
        
        // Seta o ícone da aplicação
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jtfPesquisar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbCadastroCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setIconImages(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(251, 245, 95));

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel12.setText("Lista de clientes");

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Pesquisar");

        jtClientes.getTableHeader().setFont(new java.awt.Font("Consolas", 0, 14));
        jtClientes.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.setSelectionBackground(new java.awt.Color(251, 245, 95));
        jtClientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtClientes.setShowGrid(false);
        jScrollPane1.setViewportView(jtClientes);

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

        jbCadastroCliente.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbCadastroCliente.setForeground(new java.awt.Color(251, 245, 95));
        jbCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/cad_cliente.png"))); // NOI18N
        jbCadastroCliente.setText("CADASTRO DE CLIENTE");
        jbCadastroCliente.setBorder(null);
        jbCadastroCliente.setContentAreaFilled(false);
        jbCadastroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCadastroClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCadastroClienteMouseExited(evt);
            }
        });
        jbCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jbCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addComponent(jtfPesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        try {
            viewClienteFormCadastro = new ViewClienteFormCadastro();
            
            // Pega a linha selecionada da tabela
            int linha = jtClientes.getSelectedRow();
            // Pega o código do cliente da primeira coluna + linha selecionada
            int codigoCliente = (int) jtClientes.getValueAt(linha, 0);

            // Recupera dados do banco a partir desse código
            modelClientes = controllerClientes.getClienteController(codigoCliente);
            
            // Fecha esta janela e abre a janela de cadastro com os dados setados no formulário
            this.dispose();
            viewClienteFormCadastro.habilitarBotaoSalvar();
            viewClienteFormCadastro.setVisible(true);
            viewClienteFormCadastro.habilitarCampos(true);
            viewClienteFormCadastro.setState(ViewClienteFormCadastro.NORMAL);
            
            // Função que preenche o formulário
            viewClienteFormCadastro.setCampos(modelClientes);

        } catch (Exception e) {
            // Caso nenhuma linha da tabela esteja selecionada
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        // Pega a linha selecionada da tabela
        int linha = jtClientes.getSelectedRow();
        // Pega o código do cliente da primeira coluna + linha selecionada
        int codigoCliente = (int) jtClientes.getValueAt(linha, 0);
        
        // Testa se o cliente está ligado a alguma venda e, se sim, não é possível excluí-lo
        if(controllerVendas.getVendaPorClienteIdController(codigoCliente)) {
            JOptionPane.showMessageDialog(this, "Não é possível exclui um cliente que está ligado a uma venda", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (controllerClientes.excluirClienteController(codigoCliente)) {
                JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                this.carregarClientes();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir o cliente", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroClienteActionPerformed
        new ViewClienteFormCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbCadastroClienteActionPerformed

    private void jbAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseEntered
        jbAlterar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbAlterarMouseEntered

    private void jbAlterarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseReleased
        // Apagar
    }//GEN-LAST:event_jbAlterarMouseReleased

    /*
        Métodos de alteração visual nos botões (hover)
    */
    private void jbAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseExited
        jbAlterar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbAlterarMouseExited

    private void jbExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseEntered
        jbExcluir.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbExcluirMouseEntered

    private void jbExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseExited
        jbExcluir.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbExcluirMouseExited

    private void jbCadastroClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastroClienteMouseEntered
        jbCadastroCliente.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbCadastroClienteMouseEntered

    private void jbCadastroClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadastroClienteMouseExited
        jbCadastroCliente.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbCadastroClienteMouseExited

    private void jtfPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesquisarFocusLost
       
    }//GEN-LAST:event_jtfPesquisarFocusLost

    /**
     * Pesquisa na tabela a medida que se digita 
     * @param evt 
     */
    private void jtfPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyTyped
        // Variável que recebe o modelo da tabela
        DefaultTableModel modelo = (DefaultTableModel) this.jtClientes.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        
        // Vai retornando as linhas com a classificação (digitação)
        this.jtClientes.setRowSorter(classificador);
        String texto = jtfPesquisar.getText().toUpperCase();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jtfPesquisarKeyTyped

    /**
     * Preencher a tabela com os produtos cadastrados no banco
     */
    private void carregarClientes() {
        listaModelClientes = controllerClientes.getListaClientesController();
        DefaultTableModel modelo = (DefaultTableModel) jtClientes.getModel();
        modelo.setNumRows(0);

        // Inserir na tabela
        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getClienteId(),
                listaModelClientes.get(i).getClienteNome(),
                listaModelClientes.get(i).getClienteCpf(),
                listaModelClientes.get(i).getClienteEmail(),
                listaModelClientes.get(i).getClienteTelefone()
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
            java.util.logging.Logger.getLogger(ViewClienteFormListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClienteFormListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClienteFormListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClienteFormListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClienteFormListaClientes().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCadastroCliente;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField jtfPesquisar;
    // End of variables declaration//GEN-END:variables

}
