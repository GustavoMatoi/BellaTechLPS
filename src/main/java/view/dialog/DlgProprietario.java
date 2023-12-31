/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;
import Model.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
/**
 *
 * @author gutei
 */
public class DlgProprietario extends javax.swing.JDialog {

    /**
     * Creates new form DlgSecretaria
     */
    public DlgProprietario(java.awt.Frame parent, boolean modal) {
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

        pnlFundo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnVisualizarHistorico = new javax.swing.JButton();
        btnVisualizarAgenda = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnVisualizarLucros = new javax.swing.JButton();
        btnPagarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(255, 228, 228));
        pnlFundo.setForeground(new java.awt.Color(255, 228, 228));

        lblLogo.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 121, 165));
        lblLogo.setText("BellaTech  ©2023");

        btnVisualizarHistorico.setBackground(new java.awt.Color(255, 121, 165));
        btnVisualizarHistorico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVisualizarHistorico.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarHistorico.setText("VISUALIZAR HISTÓRICO DE FEEDBACK");
        btnVisualizarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarHistoricoActionPerformed(evt);
            }
        });

        btnVisualizarAgenda.setBackground(new java.awt.Color(255, 121, 165));
        btnVisualizarAgenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVisualizarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarAgenda.setText("VISUALIZAR AGENDA DE CONSULTAS");
        btnVisualizarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarAgendaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo.setText("SELECIONE UMA AÇÃO PARA PROSSEGUIR");

        btnCadastrarUsuario.setBackground(new java.awt.Color(255, 121, 165));
        btnCadastrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarUsuario.setText("CADASTRAR USUÁRIO");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnVisualizarLucros.setBackground(new java.awt.Color(255, 121, 165));
        btnVisualizarLucros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVisualizarLucros.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarLucros.setText("VISUALIZAR LUCROS");
        btnVisualizarLucros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarLucrosActionPerformed(evt);
            }
        });

        btnPagarFuncionario.setBackground(new java.awt.Color(255, 121, 165));
        btnPagarFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnPagarFuncionario.setText("PAGAR FUNCIONÁRIO");
        btnPagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnVisualizarHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVisualizarAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVisualizarLucros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPagarFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(61, 61, 61)
                .addComponent(btnPagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualizarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarLucros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarAgendaActionPerformed
        DlgVisualizarAgendaDeConsultas telaAgenda = new DlgVisualizarAgendaDeConsultas(new JFrame(), true, "proprietario");
        telaAgenda.setVisible(true);
    }//GEN-LAST:event_btnVisualizarAgendaActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        DlgCadastrarUsuario telaCadastroUsuario = new DlgCadastrarUsuario(new JFrame(), true);
        telaCadastroUsuario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnVisualizarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarHistoricoActionPerformed
        DlgHistoricoFeedback telaHistoricoProcedimentos = new DlgHistoricoFeedback(new JFrame(), true);
        telaHistoricoProcedimentos.setVisible(true);
    }//GEN-LAST:event_btnVisualizarHistoricoActionPerformed

    private void btnVisualizarLucrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarLucrosActionPerformed
        DlgVisualizarLucros telaVisualizarLucros = new DlgVisualizarLucros(new JFrame(), true);
        telaVisualizarLucros.setVisible(true);
    }//GEN-LAST:event_btnVisualizarLucrosActionPerformed

    private void btnPagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarFuncionarioActionPerformed
        DlgPagarFuncionario telaPagarFuncionario = new DlgPagarFuncionario(new JFrame(), true);
        telaPagarFuncionario.setVisible(true);
    }//GEN-LAST:event_btnPagarFuncionarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnPagarFuncionario;
    private javax.swing.JButton btnVisualizarAgenda;
    private javax.swing.JButton btnVisualizarHistorico;
    private javax.swing.JButton btnVisualizarLucros;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFundo;
    // End of variables declaration//GEN-END:variables
}
