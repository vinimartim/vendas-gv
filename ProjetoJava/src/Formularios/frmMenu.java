/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

import Usuarios.ListaUsuarios;

/**
 *
 * @author Vinicius
 */
public class frmMenu extends javax.swing.JFrame {

    /** Creates new form frmMenu */
    public frmMenu() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        mnDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivo = new javax.swing.JMenu();
        mnarquivosClientes = new javax.swing.JMenuItem();
        mnarquivosProdutos = new javax.swing.JMenuItem();
        mnarquivosUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnarquivosEditarSenha = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        mnmovimentacao = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnajuda = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIstema de Vendas");

        mnDesktop.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout mnDesktopLayout = new javax.swing.GroupLayout(mnDesktop);
        mnDesktop.setLayout(mnDesktopLayout);
        mnDesktopLayout.setHorizontalGroup(
            mnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        mnDesktopLayout.setVerticalGroup(
            mnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        mnarquivo.setText("Arquivos");

        mnarquivosClientes.setText("Clientes");
        mnarquivosClientes.setMinimumSize(new java.awt.Dimension(16, 16));
        mnarquivosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosClientesActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivosClientes);

        mnarquivosProdutos.setText("Produtos");
        mnarquivo.add(mnarquivosProdutos);

        mnarquivosUsuarios.setText("Usuários");
        mnarquivosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosUsuariosActionPerformed(evt);
            }
        });
        mnarquivo.add(mnarquivosUsuarios);
        mnarquivo.add(jSeparator1);

        mnarquivosEditarSenha.setText("Editar senha");
        mnarquivo.add(mnarquivosEditarSenha);

        jMenuItem6.setText("Editar usuário");
        mnarquivo.add(jMenuItem6);
        mnarquivo.add(jSeparator2);

        jMenuItem7.setText("Sair");
        mnarquivo.add(jMenuItem7);

        jMenuBar1.add(mnarquivo);

        mnmovimentacao.setText("Movimentação");

        jMenuItem8.setText("Vendas");
        mnmovimentacao.add(jMenuItem8);

        jMenuItem9.setText("Relatórios");
        mnmovimentacao.add(jMenuItem9);

        jMenuBar1.add(mnmovimentacao);

        mnajuda.setText("Ajuda");

        jMenuItem10.setText("Sobre");
        mnajuda.add(jMenuItem10);

        jMenuItem11.setText("Ajuda");
        mnajuda.add(jMenuItem11);

        jMenuBar1.add(mnajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnarquivosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnarquivosClientesActionPerformed

    private void mnarquivosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosUsuariosActionPerformed
        // Arquivos -> Usuários
        ListaUsuarios listausuarios = new ListaUsuarios();
        mnDesktop.add(listausuarios);
        listausuarios.show();
    }//GEN-LAST:event_mnarquivosUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JDesktopPane mnDesktop;
    private javax.swing.JMenu mnajuda;
    private javax.swing.JMenu mnarquivo;
    private javax.swing.JMenuItem mnarquivosClientes;
    private javax.swing.JMenuItem mnarquivosEditarSenha;
    private javax.swing.JMenuItem mnarquivosProdutos;
    private javax.swing.JMenuItem mnarquivosUsuarios;
    private javax.swing.JMenu mnmovimentacao;
    // End of variables declaration//GEN-END:variables

}
