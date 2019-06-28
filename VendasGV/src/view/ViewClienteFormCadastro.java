package view;

import controller.ControllerClientes;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelClientes;

public class ViewClienteFormCadastro extends javax.swing.JFrame {

    ModelClientes modelClientes = new ModelClientes();
    ControllerClientes controllerClientes = new ControllerClientes();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();
    
    // Variável que controla se é um alteração em um registro ou uma nova inserção de um registro
    String salvarAlterar = "alterar";

    public ViewClienteFormCadastro() {
        // Seta o ícone da aplicação
        URL url = this.getClass().getResource("/imagens/marca/appicon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        
        initComponents();
        setLocationRelativeTo(null);
        habilitarCampos(false);
        
        // O programa deve começar com o botão "Salvar" desativado
        // O botão deve ser ativado quando necessária uma inserção ou alteração
        jbSalvar.setEnabled(false);
        jbSalvar.setForeground(Color.GRAY);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfIdCliente = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtfCpf = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbListaClientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(251, 245, 95));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Código");

        jtfIdCliente.setBackground(new java.awt.Color(240, 240, 240));
        jtfIdCliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtfIdCliente.setEnabled(false);
        jtfIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdClienteActionPerformed(evt);
            }
        });

        jtfNome.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("E-mail");

        jtfEmail.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Telefone");

        jtfTelefone.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jtfEndereco.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Endereço");

        jtfBairro.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jtfCidade.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jcbEstado.getEditor().getEditorComponent().setBackground(Color.YELLOW);
        jcbEstado.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UF", "MG", "RJ", "SP" }));
        jcbEstado.setBorder(null);
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("Bairro");

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setText("Cidade");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setText("UF");

        jLabel15.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel15.setText("CPF");

        try {
            jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCpf.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel12.setText("Formulário de cadastro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(0, 235, Short.MAX_VALUE))
                            .addComponent(jtfCpf)))
                    .addComponent(jtfEndereco)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtfTelefone)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jtfBairro))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
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

        jbListaClientes.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbListaClientes.setForeground(new java.awt.Color(251, 245, 95));
        jbListaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/lista.png"))); // NOI18N
        jbListaClientes.setText("LISTA DE CLIENTES");
        jbListaClientes.setBorder(null);
        jbListaClientes.setContentAreaFilled(false);
        jbListaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbListaClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbListaClientesMouseExited(evt);
            }
        });
        jbListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListaClientesActionPerformed(evt);
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
                .addComponent(jbListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jbListaClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdClienteActionPerformed
        // Apagar
        
    }//GEN-LAST:event_jtfIdClienteActionPerformed

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        // Apagar
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // Checa se os campos obrigatórios foram preenchidos
        if(jtfNome.getText().equals("") || jtfCpf.getText().equals("") || jtfEmail.getText().equals("") || jtfEndereco.getText().equals("") || jtfBairro.getText().equals("") || jtfCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Pega o ue foi escrito nos text fields e joga para o objeto Cliente
        modelClientes = new ModelClientes();
        modelClientes.setClienteNome(this.jtfNome.getText().toUpperCase());
        modelClientes.setClienteCpf(this.jtfCpf.getText().replaceAll("\\.", "").replaceAll("\\-", ""));
        modelClientes.setClienteEmail(this.jtfEmail.getText().toUpperCase());
        modelClientes.setClienteTelefone(this.jtfTelefone.getText());
        modelClientes.setClienteEndereco(this.jtfEndereco.getText().toUpperCase());
        modelClientes.setClienteBairro(this.jtfBairro.getText().toUpperCase());
        modelClientes.setClienteCidade(this.jtfCidade.getText().toUpperCase());
        modelClientes.setClienteEstado(this.jcbEstado.getSelectedItem().toString());

        // Le a variável de controle salvarAlterar 
        switch (salvarAlterar) {
            case "salvar":
                if (controllerClientes.salvarClienteController(modelClientes) > 0) {
                    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                    limparCampos();
                    habilitarCampos(false);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível cadastrar o cliente", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            case "alterar":
                modelClientes.setClienteId(Integer.parseInt(this.jtfIdCliente.getText()));
                if (controllerClientes.alterarClienteController(modelClientes)) {
                    JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                    limparCampos();
                    habilitarCampos(false);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível alterar o cliente", "Erro", JOptionPane.ERROR_MESSAGE);
                }  

                break;
            default:
                JOptionPane.showMessageDialog(this, "Nada selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // O botão de novo habilita os campos, caso desabilitados, e os limpa para uma nova inserção 
        salvarAlterar = "salvar";
        habilitarCampos(true);
        limparCampos();
        
        // Também é responsável por habilitar o botão Salvar
        jbSalvar.setEnabled(true);
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListaClientesActionPerformed
        // Fecha a janela atual e abre a lista de Clientes
        this.dispose();
        new ViewClienteFormListaClientes().setVisible(true);
    }//GEN-LAST:event_jbListaClientesActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // O botão cancelar limpa e desabilita os campos
        limparCampos();
        habilitarCampos(false);
        
        // Também é responsável por desativar o botão Salvar
        jbSalvar.setEnabled(false);
        jbSalvar.setForeground(Color.GRAY);
    }//GEN-LAST:event_jbCancelarActionPerformed

    /*
        Métodos de alteração visual nos botões (hover)
    */
    private void jbListaClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListaClientesMouseEntered
        jbListaClientes.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbListaClientesMouseEntered

    private void jbListaClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListaClientesMouseExited
        jbListaClientes.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbListaClientesMouseExited

    private void jbCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseEntered
        jbCancelar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbCancelarMouseEntered

    private void jbCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseExited
        jbCancelar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbCancelarMouseExited

    private void jbNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseEntered
        jbNovo.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbNovoMouseEntered

    private void jbNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNovoMouseExited
        jbNovo.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbNovoMouseExited

    private void jbSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseEntered
        jbSalvar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbSalvarMouseEntered

    private void jbSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseExited
        jbSalvar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbSalvarMouseExited

    /**
     * Habilita ou desabilta os campos do formulário
     *
     * @param condicao
     */
    protected void habilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfCpf.setEnabled(condicao);
        jtfEmail.setEnabled(condicao);
        jtfTelefone.setEnabled(condicao);
        jtfEndereco.setEnabled(condicao);
        jtfBairro.setEnabled(condicao);
        jtfCidade.setEnabled(condicao);
        jcbEstado.setEnabled(condicao);
   
    }
    
    /**
     * Preenche os campos com os dados do objeto cliente
     * @param pModelClientes 
     */
    public void setCampos(ModelClientes pModelClientes) {
        jtfIdCliente.setText(String.valueOf(pModelClientes.getClienteId()));
        jtfNome.setText(pModelClientes.getClienteNome());
        jtfCpf.setText(pModelClientes.getClienteCpf());
        jtfEmail.setText(pModelClientes.getClienteEmail());
        jtfTelefone.setText(pModelClientes.getClienteTelefone());
        jtfEndereco.setText(pModelClientes.getClienteEndereco());
        jtfBairro.setText(pModelClientes.getClienteBairro());
        jtfCidade.setText(pModelClientes.getClienteCidade());
        jcbEstado.setSelectedItem(pModelClientes.getClienteEstado());
    }
    
    /**
     * Limpa campos do formulário
     */
    private void limparCampos() {
        jtfNome.setText("");
        jtfCpf.setText("");
        jtfEmail.setText("");
        jtfTelefone.setText("");
        jtfEndereco.setText("");
        jtfBairro.setText("");
        jtfCidade.setText("");
        jcbEstado.setSelectedItem("UF");
    }
    
    /**
     * Habilita o botão Salvar
     */
    protected void habilitarBotaoSalvar() {
        jbSalvar.setEnabled(true);
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
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
            java.util.logging.Logger.getLogger(ViewClienteFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClienteFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClienteFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClienteFormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClienteFormCadastro().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JButton jbListaClientes;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JFormattedTextField jtfCpf;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfIdCliente;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables

}
