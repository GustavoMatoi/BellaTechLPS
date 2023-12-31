/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import Model.DAO.PagamentoDAO;
import Model.Pagamento;
import controller.PagamentoController;
import java.util.List;

/**
 *
 * @author gutei
 */
public class DlgVisualizarLucros extends javax.swing.JDialog {
    PagamentoDAO total;
    PagamentoController pagamentoController;
    double totalPagou;
    double totalRecebeu;
    double lucros;
    public DlgVisualizarLucros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pagamentoController = new PagamentoController();
        pagamentoController.atualizarTabela(grdPagamentos, "BellaTech");
        pagamentoController.atualizarTabela(grdRecebimentos, "n e o bellatech");
        total = new PagamentoDAO();
        total.findAllByPagamento("BellaTech");
        List<Pagamento> listaPagamentos = total.findAllByPagamento("BellaTech");
        List<Pagamento> listaPagamentos2 = total.findAllByPagamento("n e o bellatech");

        totalPagou = somarValores(listaPagamentos);
        totalRecebeu = somarValores(listaPagamentos2);
        lucros = totalPagou - totalRecebeu;
        lblLucroTotal.setText("R$ " + String.valueOf(lucros));
    }

 public double somarValores(List<Pagamento> listaPagamentos) {
    double soma = 0.0;
    
    for (Pagamento pagamento : listaPagamentos) {
        
        soma += pagamento.getValor();
    }

    return soma;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblLucroTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdPagamentos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdRecebimentos = new javax.swing.JTable();
        lblTitulo1 = new javax.swing.JLabel();
        lblLucro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 228, 228));

        lblLogo.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 121, 165));
        lblLogo.setText("BellaTech  ©2023");

        lblLucroTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLucroTotal.setText("R$00,00");

        grdPagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(grdPagamentos);

        grdRecebimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(grdRecebimentos);

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo1.setText("VENDAS E LUCROS");

        lblLucro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLucro.setForeground(new java.awt.Color(255, 121, 165));
        lblLucro.setText("LUCRO:");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblLogo))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLucro)
                .addGap(38, 38, 38)
                .addComponent(lblLucroTotal)
                .addGap(78, 78, 78))
            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(lblTitulo1)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLucroTotal)
                    .addComponent(lblLucro))
                .addGap(26, 26, 26)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(lblTitulo1)
                    .addContainerGap(549, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DlgVisualizarLucros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgVisualizarLucros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgVisualizarLucros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgVisualizarLucros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgVisualizarLucros dialog = new DlgVisualizarLucros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grdPagamentos;
    private javax.swing.JTable grdRecebimentos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLucro;
    private javax.swing.JLabel lblLucroTotal;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
