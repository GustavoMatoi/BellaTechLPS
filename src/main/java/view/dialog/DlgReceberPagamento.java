/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

/**
 *
 * @author gutei
 */
public class DlgReceberPagamento extends javax.swing.JDialog {

    /**
     * Creates new form DlgReceberPagamento
     */
    public DlgReceberPagamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        pnlBackground = new javax.swing.JPanel();
        edtData = new javax.swing.JTextField();
        edtValor = new javax.swing.JTextField();
        edtCliente = new javax.swing.JTextField();
        lblMetodo = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnPix = new javax.swing.JRadioButton();
        btnDinheiro = new javax.swing.JRadioButton();
        btnCartao = new javax.swing.JRadioButton();
        lblComentarios = new javax.swing.JLabel();
        edtComentarios = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 228, 228));

        lblMetodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMetodo.setForeground(new java.awt.Color(255, 121, 165));
        lblMetodo.setText("MÉTODO DE PAGAMENTO:");

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 121, 165));
        lblData.setText("DATA:");

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblValor.setForeground(new java.awt.Color(255, 121, 165));
        lblValor.setText("VALOR:");

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 121, 165));
        lblCliente.setText("CLIENTE:");

        btnFinalizar.setBackground(new java.awt.Color(255, 121, 165));
        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("FINALIZAR");

        lblLogo.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 121, 165));
        lblLogo.setText("BellaTech  ©2023");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo.setText("RECEBER PAGAMENTO");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 121, 165));
        btnCancelar.setText("CANCELAR");

        btnPix.setBackground(new java.awt.Color(255, 228, 228));
        btnPix.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPix.setForeground(new java.awt.Color(255, 121, 165));
        btnPix.setText("PIX");
        btnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPixActionPerformed(evt);
            }
        });

        btnDinheiro.setBackground(new java.awt.Color(255, 228, 228));
        btnDinheiro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDinheiro.setForeground(new java.awt.Color(255, 121, 165));
        btnDinheiro.setText("DINHEIRO");

        btnCartao.setBackground(new java.awt.Color(255, 228, 228));
        btnCartao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCartao.setForeground(new java.awt.Color(255, 121, 165));
        btnCartao.setText("CARTÃO DE CRÉDITO");

        lblComentarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblComentarios.setForeground(new java.awt.Color(255, 121, 165));
        lblComentarios.setText("COMENTÁRIOS:");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblLogo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(edtData, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblData, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblComentarios, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edtComentarios, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edtCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                                        .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edtValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                                        .addComponent(lblValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                        .addComponent(btnPix, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblTitulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMetodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPix)
                    .addComponent(btnDinheiro)
                    .addComponent(btnCartao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addGap(5, 5, 5)
                .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnCancelar))
                .addGap(2, 2, 2)
                .addComponent(lblLogo))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPixActionPerformed

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
            java.util.logging.Logger.getLogger(DlgReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgReceberPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgReceberPagamento dialog = new DlgReceberPagamento(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnCartao;
    private javax.swing.JRadioButton btnDinheiro;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JRadioButton btnPix;
    private javax.swing.JTextField edtCliente;
    private javax.swing.JTextField edtComentarios;
    private javax.swing.JTextField edtData;
    private javax.swing.JTextField edtValor;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}