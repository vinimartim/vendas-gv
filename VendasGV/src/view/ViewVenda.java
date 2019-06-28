package view;

import controller.ControllerClientes;
import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerSection;
import controller.ControllerUsuarios;
import controller.ControllerVendas;
import controller.ControllerVendasClientes;
import controller.ControllerVendasProdutos;
import java.awt.Color;
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
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelSection;

import model.ModelVendas;
import model.ModelVendasClientes;
import model.ModelVendasProdutos;
import util.Datas;

public class ViewVenda extends javax.swing.JFrame {

    String salvarAlterar = "salvar";
    
    ControllerUsuarios controllerUsuarios = new ControllerUsuarios();
    
    // SECTION
    ControllerSection controllerSection = new ControllerSection();
    ModelSection modelSection;
    ArrayList<ModelSection> listaModelSection = new ArrayList<>();
    
    // CLIENTE
    ControllerClientes controllerClientes = new ControllerClientes();
    ModelClientes modelClientes = new ModelClientes();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();

    // PRODUTO
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();

    // VENDAS-CLIENTES
    ArrayList<ModelVendasClientes> listaModelVendasClientes = new ArrayList<>();
    ControllerVendasClientes controllerVendasClientes = new ControllerVendasClientes();

    // VENDAS-PRODUTOS   
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();

    // VENDAS
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();

    // VENDAS-PRODUTOS-VENDAS
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();

    // Usado na conversão de datas para o padrão americano
    Datas datas = new Datas();
    
    String nomeUsuario;
    int IdUsuario;

    public ViewVenda() {
        initComponents();
        listarClientes();
        listarProdutos();
        setLocationRelativeTo(null);
        carregarVendas();
        inicializarCodigosCliente();
        inicilizarCodigoProduto(); 

        // Desabilita o botão Salvar
        jbSalvar.setEnabled(false);
        jbSalvar.setForeground(Color.GRAY);

        // Seta os campos de desconto e valor com 0
        jtfDesconto.setText("0");
        jtfValorTotal.setText("0");
        
        habilitarCampos(false);
        
        // Seta o ícone da aplicação
        URL url = this.getClass().getResource("/imagens/marca/appicon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpPainel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfCodVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCarrinho = new javax.swing.JTable();
        jtfValorTotal = new javax.swing.JTextField();
        jtfDesconto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbProduto = new componentes.UJComboBox();
        jcbCliente = new componentes.UJComboBox();
        jPanel3 = new javax.swing.JPanel();
        jbRemover = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbAdicionar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtfNomeUsuario = new javax.swing.JTextField();
        jtfCodUsuario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setResizable(false);

        jtpPainel.setBackground(new java.awt.Color(251, 245, 95));
        jtpPainel.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(251, 245, 95));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setText("Código do cliente");

        jtfCodCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodClienteFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setText("Cliente");

        jtfCodVenda.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel3.setText("Código da venda");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel4.setText("Código do produto");

        jtfCodProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodProdutoFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setText("Produto");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setText("Quantidade");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel7.setText("Carrinho");

        jtCarrinho.getTableHeader().setFont(new java.awt.Font("Consolas", 0, 14));
        jtCarrinho.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód Prod", "Nome produto", "Quantidade", "Valor unitário", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
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
        jtCarrinho.setSelectionBackground(new java.awt.Color(251, 245, 95));
        jtCarrinho.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jtCarrinho);

        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });
        jtfDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDescontoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel12.setText("Desconto");

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel13.setText("Valor total");

        jLabel8.setText("R$");

        jLabel9.setText("%");

        jcbProduto.setAutocompletar(true);
        jcbProduto.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jcbProduto.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbProdutoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jcbCliente.setAutocompletar(true);
        jcbCliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jcbCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        jbRemover.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbRemover.setForeground(new java.awt.Color(251, 245, 95));
        jbRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/delete.png"))); // NOI18N
        jbRemover.setText("REMOVER");
        jbRemover.setBorder(null);
        jbRemover.setBorderPainted(false);
        jbRemover.setContentAreaFilled(false);
        jbRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRemoverMouseExited(evt);
            }
        });
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbNovo.setForeground(new java.awt.Color(251, 245, 95));
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/plus.png"))); // NOI18N
        jbNovo.setText("NOVO");
        jbNovo.setBorder(null);
        jbNovo.setBorderPainted(false);
        jbNovo.setContentAreaFilled(false);
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

        jbCancelar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbCancelar.setForeground(new java.awt.Color(251, 245, 95));
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/close.png"))); // NOI18N
        jbCancelar.setText("CANCELAR");
        jbCancelar.setBorder(null);
        jbCancelar.setBorderPainted(false);
        jbCancelar.setContentAreaFilled(false);
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

        jbSalvar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/save.png"))); // NOI18N
        jbSalvar.setText("SALVAR");
        jbSalvar.setBorder(null);
        jbSalvar.setBorderPainted(false);
        jbSalvar.setContentAreaFilled(false);
        jbSalvar.setEnabled(false);
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

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 245, 95));
        jLabel10.setText("|");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 245, 95));
        jLabel11.setText("|");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jbAdicionar.setBackground(new java.awt.Color(251, 245, 95));
        jbAdicionar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbAdicionar.setForeground(new java.awt.Color(251, 245, 95));
        jbAdicionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/plus.png"))); // NOI18N
        jbAdicionar.setText("ADICIONAR");
        jbAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAdicionarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAdicionarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel17.setText("Código do vendedor");

        jtfNomeUsuario.setEditable(false);
        jtfNomeUsuario.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtfNomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNomeUsuarioFocusLost(evt);
            }
        });

        jtfCodUsuario.setEditable(false);
        jtfCodUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodUsuarioFocusLost(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel18.setText("Nome do vendedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfCodProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jcbProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfCodCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(407, 407, 407))
                                    .addComponent(jcbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfCodVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jtfQuantidade))
                                .addComponent(jLabel6))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(521, 521, 521)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfCodUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfCodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jtpPainel.addTab("Cadastro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(251, 245, 95));

        jLabel14.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel14.setText("Pesquisa");

        jtfPesquisar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyTyped(evt);
            }
        });

        jtVendas.getTableHeader().setFont(new java.awt.Font("Consolas", 0, 14));
        jtVendas.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
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
        jtVendas.setSelectionBackground(new java.awt.Color(251, 245, 95));
        jtVendas.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jtVendas);
        if (jtVendas.getColumnModel().getColumnCount() > 0) {
            jtVendas.getColumnModel().getColumn(0).setMinWidth(50);
            jtVendas.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtVendas.getColumnModel().getColumn(0).setMaxWidth(50);
            jtVendas.getColumnModel().getColumn(2).setMinWidth(80);
            jtVendas.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtVendas.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jLabel16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel16.setText("Vendas");

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(251, 245, 95));
        jLabel15.setText("|");

        jbExcluir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbExcluir.setForeground(new java.awt.Color(251, 245, 95));
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/delete.png"))); // NOI18N
        jbExcluir.setText("EXCLUIR");
        jbExcluir.setBorder(null);
        jbExcluir.setBorderPainted(false);
        jbExcluir.setContentAreaFilled(false);
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

        jbAlterar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jbAlterar.setForeground(new java.awt.Color(251, 245, 95));
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ícones/edit.png"))); // NOI18N
        jbAlterar.setText("ALTERAR");
        jbAlterar.setBorder(null);
        jbAlterar.setBorderPainted(false);
        jbAlterar.setContentAreaFilled(false);
        jbAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbAlterarMouseExited(evt);
            }
        });
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jbAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfPesquisar)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel16)
                .addGap(11, 11, 11)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtpPainel.addTab("Lista de vendas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPainel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodClienteFocusLost
        // Seta o cliente correspodente quando insere o código
        modelClientes = controllerClientes.getClienteController(Integer.parseInt(jtfCodCliente.getText()));
        jcbCliente.setSelectedItem(modelClientes.getClienteNome());
    }//GEN-LAST:event_jtfCodClienteFocusLost

    private void jtfCodProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodProdutoFocusLost
        // Seta o produto correspondente quando perde o foco
        modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(jtfCodProduto.getText()));
        jcbProduto.setSelectedItem(modelProdutos.getProdNome());
    }//GEN-LAST:event_jtfCodProdutoFocusLost

    private void jbAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAdicionarMouseClicked
        // Checa se quantidade é vazia
        if (jtfQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            modelProdutos = controllerProdutos.getProdutoController(Integer.parseInt(jtfCodProduto.getText()));

            // Adicionar linha na tabela
            DefaultTableModel modelo = (DefaultTableModel) jtCarrinho.getModel();
            int cont = 0;
            double quantidade = 0.0;
            quantidade = Double.parseDouble(jtfQuantidade.getText());
            for (int i = 0; i < cont; i++) {
                modelo.setNumRows(0);
            }

            // Adicionar nas colunas
            modelo.addRow(new Object[]{
                modelProdutos.getProdId(),
                modelProdutos.getProdNome(),
                jtfQuantidade.getText(),
                modelProdutos.getProdPreco(),
                quantidade * modelProdutos.getProdPreco()
            });
            somarValorTotal();
        }
    }//GEN-LAST:event_jbAdicionarMouseClicked

    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        // Checa se desconto é menor que 100 e chama a função que calcula o valor total sobre o desconto
        if(Integer.parseInt(jtfDesconto.getText()) > 100) {
            System.out.println(jtfDesconto.getText());
            System.out.println(modelVendas.getVendaDesconto());
            JOptionPane.showMessageDialog(this, "O desconto não pode ser maior que 100%", "Erro", JOptionPane.ERROR_MESSAGE);
            jtfDesconto.setText("0");
        } else {
            somarValorTotal();
        }
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jcbProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbProdutoPopupMenuWillBecomeInvisible
        // Iniciar código correspondente ao primeiro cliente
        if (jcbProduto.isPopupVisible()) {
            inicilizarCodigoProduto();
        }
    }//GEN-LAST:event_jcbProdutoPopupMenuWillBecomeInvisible

    private void jcbClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbClientePopupMenuWillBecomeInvisible
        // Iniciar código correspondente ao primeiro produto
        if (jcbCliente.isPopupVisible()) {
            inicializarCodigosCliente();
        }
    }//GEN-LAST:event_jcbClientePopupMenuWillBecomeInvisible

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        int codigoVenda = 0;
        int codigoProduto = 0;
        
        // Cria uma nova lista
        listaModelVendasProdutos = new ArrayList<>();

        // Seta o cliente no objeto com o valor do text field
        modelVendas.setCliente(Integer.parseInt(jtfCodCliente.getText()));
        
        // Transforma o padrão da data para o padrão americano 
        try {
            modelVendas.setVendaData(datas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
        }

        // Seta os valores da venda
        modelVendas.setVendaValorLiquido(Double.parseDouble(jtfValorTotal.getText()));
        modelVendas.setVendaValorBruto(Double.parseDouble(jtfValorTotal.getText()) + calcularDesconto());
        modelVendas.setVendaDesconto(calcularDesconto());

        // Seta o código da venda caso não seja vazio
        if (!jtfCodVenda.getText().equals("")) {
            modelVendas.setVendaId(Integer.parseInt(jtfCodVenda.getText()));
        }

        // Seta o código do cliente
        modelVendas.setCliente(Integer.parseInt(jtfCodCliente.getText()));
        
        // Seta o código do usuário (funcionário logado)
        modelVendas.setUsuario(Integer.parseInt(jtfCodUsuario.getText()));
        
        // Checa a variável de controle SalvarAlterar
        if (salvarAlterar.equals("salvar")) {
            // Salvar a venda no bd
            codigoVenda = controllerVendas.salvarVendasController(modelVendas);

            // Checa se salvou
            if (codigoVenda > 0) {
                int cont = jtCarrinho.getRowCount();

                for (int i = 0; i < cont; i++) {
                    codigoProduto = (int) jtCarrinho.getValueAt(i, 0);
                    modelProdutos = new ModelProdutos();

                    // Seta no objeto Vendas-Produtos
                    modelVendasProdutos = new ModelVendasProdutos();
                    modelVendasProdutos.setProduto(codigoProduto);
                    modelVendasProdutos.setVenda(codigoVenda);
                    modelVendasProdutos.setVenProValor((double) jtCarrinho.getValueAt(i, 3));
                    modelVendasProdutos.setVenProQtd(Integer.parseInt(jtCarrinho.getValueAt(i, 2).toString()));

                    // Refatorar estoque
                    modelProdutos.setProdId(codigoProduto);
                    modelProdutos.setProdEstoque(
                            controllerProdutos.getProdutoController(codigoProduto).getProdEstoque()
                            - Integer.parseInt(jtCarrinho.getValueAt(i, 2).toString()));

                    listaModelVendasProdutos.add(modelVendasProdutos);
                    listaModelProdutos.add(modelProdutos);
                }

                // Salva os produtos a partir de uma lista
                if (modelProdutos.getProdEstoque() <= 0) {
                    JOptionPane.showMessageDialog(this, "Não há estoque suficiente", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
                        // Alterar o estoque de produtos
                        controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos);
                        JOptionPane.showMessageDialog(this, "Venda registrada!", "Pronto", JOptionPane.WARNING_MESSAGE);
                        carregarVendas();
                        limparCampos();
                        habilitarCampos(false);
                        jbSalvar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Não foi possível registrar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível salvar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // BEGIN
            // Retorna para o estoque e exclui os produtos da venda (não exclui a venda)
            int linha = jtVendas.getSelectedRow();
            codigoVenda = (int) jtVendas.getValueAt(linha, 0);

            listaModelProdutos = new ArrayList<>();
            listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);

            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setProdId(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdId());

                // Adiciona ao estoque a quantidade do produto que voltou do cancelamento da venda
                modelProdutos.setProdEstoque(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdEstoque()
                        + listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQtd());

                listaModelProdutos.add(modelProdutos);
            }

            if (controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos)) {
                if (controllerVendasProdutos.excluirVendasProdutosController(codigoVenda)) {
                    //JOptionPane.showMessageDialog(this, "Venda excluída com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                    carregarVendas();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível excluir a vendas", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir a venda", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            // END

            // Atualiza as vendas
            if(controllerVendas.atualizarVendasController(modelVendas)) {
                //JOptionPane.showMessageDialog(this, "Venda alterada com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível alterar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            // Retorna os produtos para o carrinho
            int cont = jtCarrinho.getRowCount();

            for (int i = 0; i < cont; i++) {
                codigoProduto = (int) jtCarrinho.getValueAt(i, 0);
                modelProdutos = new ModelProdutos();

                // A partir daqui os procedimentos são os mesmos para salvar
                // Seta no objeto Vendas-Produtos
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setProduto(codigoProduto);
                modelVendasProdutos.setVenda(codigoVenda);
                modelVendasProdutos.setVenProValor((double) jtCarrinho.getValueAt(i, 3));
                modelVendasProdutos.setVenProQtd(Integer.parseInt(jtCarrinho.getValueAt(i, 2).toString()));

                // Refatorar estoque
                modelProdutos.setProdId(codigoProduto);
                modelProdutos.setProdEstoque(
                        controllerProdutos.getProdutoController(codigoProduto).getProdEstoque()
                        - Integer.parseInt(jtCarrinho.getValueAt(i, 2).toString()));

                listaModelVendasProdutos.add(modelVendasProdutos);
                listaModelProdutos.add(modelProdutos);
            }
            
            // Salvar os produtos da venda
            if(controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
                JOptionPane.showMessageDialog(this, "Venda alterada com sucesso!", "Pronto!", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
                limparCampos();
                habilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível registrar a venda", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        // Remove um produto do carrinho
        int linha = jtCarrinho.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtCarrinho.getModel();
        modelo.removeRow(linha);
        somarValorTotal();
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        salvarAlterar = "salvar";
        jbSalvar.setEnabled(true);
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
        limparCampos();
        setaUsuario();
        habilitarCampos(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Exclui uma venda
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha, 0);

        listaModelProdutos = new ArrayList<>();
        listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);

        for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
            modelProdutos = new ModelProdutos();
            modelProdutos.setProdId(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdId());

            // Adiciona ao estoque a quantidade do produto que voltou do cancelamento da venda
            modelProdutos.setProdEstoque(listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdEstoque()
                + listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQtd());

            listaModelProdutos.add(modelProdutos);
        }

        if (controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos)) {
            controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
            if (controllerVendas.excluirVendasController(codigoVenda)) {
                JOptionPane.showMessageDialog(this, "Venda excluída com sucesso", "Pronto!", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível excluir a vendas", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível excluir a vendas", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed

        salvarAlterar = "alterar";
        
        // Seta o usuário logado no formulário
        setaUsuario();

        // Habilita o botão Salvar
        jbSalvar.setEnabled(true);
        jbSalvar.setForeground(new java.awt.Color(251, 245, 95));
        habilitarCampos(true);
        System.out.println(jtVendas.getSelectedRow());

        if(jtVendas.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int linha = jtVendas.getSelectedRow();
            int codigoVenda = (int) jtVendas.getValueAt(linha, 0);

            listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosController(codigoVenda);

            DefaultTableModel modelo = (DefaultTableModel) jtCarrinho.getModel();
            modelo.setNumRows(0);
            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                jtfCodVenda.setText(String.valueOf(listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenda()));
                modelo.addRow(new Object[]{
                    listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdId(),
                    listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProdNome(),
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQtd(),
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor(),
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQtd()
                    * listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor()
                });
            }
            jtpPainel.setSelectedIndex(0);
            somarValorTotal();
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAdicionarMouseEntered
        jbAdicionar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbAdicionarMouseEntered

    private void jbAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAdicionarMouseExited
        jbAdicionar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbAdicionarMouseExited

    private void jbSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseEntered
        jbSalvar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbSalvarMouseEntered

    private void jbSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalvarMouseExited
        jbSalvar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbSalvarMouseExited

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

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jbRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRemoverMouseEntered
        jbRemover.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbRemoverMouseEntered

    private void jbRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRemoverMouseExited
        jbRemover.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbRemoverMouseExited

    private void jbExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseEntered
        jbExcluir.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbExcluirMouseEntered

    private void jbExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseExited
        jbExcluir.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbExcluirMouseExited

    private void jbAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseEntered
        jbAlterar.setFont(new java.awt.Font("Consolas", 0, 14));
    }//GEN-LAST:event_jbAlterarMouseEntered

    private void jbAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAlterarMouseExited
        jbAlterar.setFont(new java.awt.Font("Consolas", 0, 12));
    }//GEN-LAST:event_jbAlterarMouseExited

    private void jtfPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyTyped
        DefaultTableModel modelo = (DefaultTableModel) this.jtVendas.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtVendas.setRowSorter(classificador);
        String texto = jtfPesquisar.getText().toUpperCase();;
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }//GEN-LAST:event_jtfPesquisarKeyTyped

    private void jtfNomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNomeUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeUsuarioFocusLost

    private void jtfCodUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodUsuarioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodUsuarioFocusLost

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
        habilitarCampos(false);
        jbSalvar.setEnabled(false);
        jbSalvar.setForeground(Color.GRAY);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescontoKeyTyped
        try {} catch(Exception e) {}
    }//GEN-LAST:event_jtfDescontoKeyTyped

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
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVenda().setVisible(true);
            }
        });
    }

    /**
     * Lista todos os clientes no combobox
     */
    private void listarClientes() {
        listaModelClientes = controllerClientes.getListaClientesController();
        jcbCliente.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++) {
            jcbCliente.addItem(listaModelClientes.get(i).getClienteNome());
        }
    }

    /**
     * Lista todos os produtos no combobox
     */
    private void listarProdutos() {
        listaModelProdutos = controllerProdutos.getListaProdutosController();
        jcbProduto.removeAllItems();
        for (int i = 0; i < listaModelProdutos.size(); i++) {
            jcbProduto.addItem(listaModelProdutos.get(i).getProdNome());
        }
    }

    /**
     * Carrega vendas na tabela
     */
    private void carregarVendas() {
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        listaModelVendasClientes = controllerVendasClientes.getListaVendasClienteController();
        int cont = listaModelVendasClientes.size();
        modelo.setNumRows(0);
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVendasClientes.get(i).getModelVendas().getVendaId(),
                listaModelVendasClientes.get(i).getModelClientes().getClienteNome(),
                listaModelVendasClientes.get(i).getModelVendas().getVendaData()
            });
        }
    }

    /**
     * Soma os valores totais de cada produto e mostra o valor total da venda
     */
    private void somarValorTotal() {
        double valor;
        double soma = 0;

        // Contador recebe a quantidade de linhas
        int contador = jtCarrinho.getRowCount();

        for (int i = 0; i < contador; i++) {
            valor = (double) jtCarrinho.getValueAt(i, 4);
            soma = soma + valor;
        }
        System.out.println(soma);
        jtfValorTotal.setText(String.valueOf(soma));
        aplicarDesconto();
    }

    /**
     * Faz o calculo do valor total com o desconto
     */
    private void aplicarDesconto() {
        jtfValorTotal.setText(
                String.valueOf(Double.parseDouble(jtfValorTotal.getText()) - calcularDesconto()));
    }

    /**
     * Calcula o desconto
     * @return 
     */
    private double calcularDesconto() {
        return (Double.parseDouble(jtfDesconto.getText()) / 100) * Double.parseDouble(jtfValorTotal.getText());
    }

    /** 
     * Inicializa código do cliente da combo box
     */
    private void inicializarCodigosCliente() {
        modelClientes = controllerClientes.getClienteController(jcbCliente.getSelectedItem().toString());
        jtfCodCliente.setText(String.valueOf(modelClientes.getClienteId()));
    }

    /** 
     * Inicializa código do produto da combo box
     */
    private void inicilizarCodigoProduto() {
        modelProdutos = controllerProdutos.getProdutoController(jcbProduto.getSelectedItem().toString());
        jtfCodProduto.setText(String.valueOf(modelProdutos.getProdId()));
    }

    /**
     * Limpa os campos
     */
    private void limparCampos() {
        jtfQuantidade.setText("");
        jtfQuantidade.setText("0");
        jtfValorTotal.setText("0");

        DefaultTableModel modelo = (DefaultTableModel) jtCarrinho.getModel();
        modelo.setNumRows(0);
    }
    
    /**
     * Seta os dados do usuário logado no formulário
     */
    private void setaUsuario() {
        jtfNomeUsuario.setText(nomeUsuario);
        jtfCodUsuario.setText(String.valueOf(IdUsuario));
    }

    /**
     * Habilita ou desabilta os campos
     * @param condicao 
     */
    private void habilitarCampos(boolean condicao) {
        jtfCodCliente.setEnabled(condicao);
        jtfCodProduto.setEnabled(condicao);
        jtfCodVenda.setEnabled(condicao);
        jtfDesconto.setEnabled(condicao);
        jtfNomeUsuario.setEnabled(condicao);
        jtfQuantidade.setEnabled(condicao);
        jtfValorTotal.setEnabled(condicao);
        jcbCliente.setEnabled(condicao);
        jcbProduto.setEnabled(condicao);
        jtfCodUsuario.setEnabled(condicao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jbAdicionar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbSalvar;
    private componentes.UJComboBox jcbCliente;
    private componentes.UJComboBox jcbProduto;
    private javax.swing.JTable jtCarrinho;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfCodCliente;
    private javax.swing.JTextField jtfCodProduto;
    private javax.swing.JTextField jtfCodUsuario;
    private javax.swing.JTextField jtfCodVenda;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfNomeUsuario;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorTotal;
    private javax.swing.JTabbedPane jtpPainel;
    // End of variables declaration//GEN-END:variables
  
}
