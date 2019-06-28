package view;

import controller.ControllerUsuarios;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelUsuarios;

public class ViewUsuarioFormCadastro extends javax.swing.JFrame {

    ControllerUsuarios controllerUsuarios = new ControllerUsuarios();
    ModelUsuarios modelUsuarios = new ModelUsuarios();
    ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<>();
    String salvarAlterar = "alterar";


    public ViewUsuarioFormCadastro() {
        initComponents();
        setLocationRelativeTo(null);
        habilitarCampos(false);
        
        // O programa deve começar com o botão "Salvar" desativado
        // O botão deve ser ativado quando necessária uma inserção ou alteração
        jbSalvar.setEnabled(false);
        jbSalvar.setForeground(Color.GRAY);
        
        // Seta o ícone daaplicação
        URL url = this.getClass().getResource("/imagens/marca/appicon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfUsuarioId = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jtfConfSenha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbListaUsuarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(251, 245, 95));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel4.setText("Cadastro de usuário");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Código");

        jtfUsuarioId.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtfUsuarioId.setEnabled(false);

        jtfNome.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtfNome.setSelectedTextColor(new java.awt.Color(0, 120, 215));
        jtfNome.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jtfEmail.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Senha");

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("Repetir senha");

        jtfSenha.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jtfConfSenha.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEmail)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 279, Short.MAX_VALUE))
                                    .addComponent(jtfSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(141, 141, 141))
                                    .addComponent(jtfConfSenha)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtfNome)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jbSalvar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/save.png"))); // NOI18N
        jbSalvar.setText("SALVAR");
        jbSalvar.setBorder(null);
        jbSalvar.setContentAreaFilled(false);
        jbSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSalvarMouseExited(evt);
            }
        });
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbNovo.setForeground(new java.awt.Color(251, 245, 95));
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/plus.png"))); // NOI18N
        jbNovo.setText("NOVO");
        jbNovo.setBorder(null);
        jbNovo.setContentAreaFilled(false);
        jbNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbNovoMouseExited(evt);
            }
        });
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(251, 245, 95));
        jLabel1.setText("|");

        jbListaUsuarios.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbListaUsuarios.setForeground(new java.awt.Color(251, 245, 95));
        jbListaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/lista.png"))); // NOI18N
        jbListaUsuarios.setText("LISTA DE USUÁRIOS");
        jbListaUsuarios.setBorder(null);
        jbListaUsuarios.setContentAreaFilled(false);
        jbListaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbListaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbListaUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbListaUsuariosMouseExited(evt);
            }
        });
        jbListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListaUsuariosActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(251, 245, 95));
        jLabel2.setText("|");

        jbCancelar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(251, 245, 95));
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/close.png"))); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.setBorder(null);
        jbCancelar.setContentAreaFilled(false);
        jbCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCancelarMouseExited(evt);
            }
        });
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jbListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jbListaUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseEntered
        jbSalvar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbSalvarMouseEntered

    private void jbSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseExited
        jbSalvar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbSalvarMouseExited

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        modelUsuarios.setUsuarioEmail(jtfEmail.getText().toUpperCase());
        modelUsuarios.setUsuarioNome(jtfNome.getText().toUpperCase());
        
        // Testa se os campos obrigatórios são vazios
        if(jtfNome.getText().equals("") || jtfEmail.getText().equals("") || jtfSenha.getPassword().equals("") || jtfConfSenha.getPassword().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Testa se as senhas conferem
        if (new String(jtfSenha.getPassword()).equals(new String(jtfConfSenha.getPassword()))) {
            modelUsuarios.setUsuarioSenha(new String(jtfSenha.getPassword()));

            if (salvarAlterar == "salvar") {
                if (controllerUsuarios.salvarUsuariosController(modelUsuarios) > 0) {
                    JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                    limparCampos();
                    habilitarCampos(false);

                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível cadastrar o usuário", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } else if (salvarAlterar == "alterar") {
                if (controllerUsuarios.atualizarUsuariosController(modelUsuarios)) {
                    JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                    limparCampos();
                    habilitarCampos(false);

                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível atualizar o usuário", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Nada selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
            } 
                       
        } else {
            JOptionPane.showMessageDialog(this, "As senhas não conferem!");
            jtfConfSenha.requestFocus();
            jtfConfSenha.setText("");
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseEntered
        jbNovo.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbNovoMouseEntered

    private void jbNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseExited
        jbNovo.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbNovoMouseExited

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitarCampos(true);
        jbSalvar.setEnabled(true);
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbListaUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListaUsuariosMouseEntered
        jbListaUsuarios.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbListaUsuariosMouseEntered

    private void jbListaUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListaUsuariosMouseExited
        jbListaUsuarios.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbListaUsuariosMouseExited

    private void jbListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListaUsuariosActionPerformed
        this.dispose();
        new ViewUsuarioFormListaUsuarios().setVisible(true);
    }//GEN-LAST:event_jbListaUsuariosActionPerformed

    private void jbCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseEntered
        jbCancelar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbCancelarMouseEntered

    private void jbCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseExited
        jbCancelar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbCancelarMouseExited

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
        jbSalvar.setEnabled(false);
        jbSalvar.setForeground(Color.GRAY);
    }//GEN-LAST:event_jbCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUsuarioFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarioFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarioFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuarioFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuarioFormCadastro().setVisible(true);
            }
        });
    }

    /**
     * Limpar formulário
     */
    private void limparCampos() {
        jtfUsuarioId.setText("");
        jtfNome.setText("");
        jtfEmail.setText("");
        jtfSenha.setText("");
        jtfConfSenha.setText("");
    }

    /**
     * Habilita ou desabilita os campos do formulário
     *
     * @param condicao
     */
    protected void habilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfEmail.setEnabled(condicao);
        jtfSenha.setEnabled(condicao);
        jtfConfSenha.setEnabled(condicao);
    }
    
    /**
     * Seta os campos na interface
     * @param pModelUsuarios 
     */
    void setCampos(ModelUsuarios pModelUsuarios) {
        jtfUsuarioId.setText(String.valueOf(pModelUsuarios.getUsuarioId()));
        jtfNome.setText(pModelUsuarios.getUsuarioNome());
        jtfEmail.setText(pModelUsuarios.getUsuarioEmail());
        jtfSenha.setText(pModelUsuarios.getUsuarioSenha());
    }
    
    /**
     * Habilitar botão Salvar
     */
    void habilitarBotaoSalvar() {
        jbSalvar.setEnabled(true);
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbListaUsuarios;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPasswordField jtfConfSenha;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuarioId;
    // End of variables declaration//GEN-END:variables

}
