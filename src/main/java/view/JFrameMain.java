/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.Medico;
import Model.Secretaria;
import Model.Usuario;
import controller.MedicoController;
import controller.UsuarioController;
import javax.swing.JOptionPane;
import view.dialog.DlgMedico;
import view.dialog.DlgProprietario;
import view.dialog.DlgSecretaria;

/**
 *
 * @author gutei
 */
public class JFrameMain extends javax.swing.JFrame {

    public JFrameMain() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        edtLogin = new javax.swing.JTextField();
        edtSenha = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 236, 236));

        lblTitulo.setFont(new java.awt.Font("Monotype Corsiva", 2, 80)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo.setText("BellaTech");

        lblSubtitulo.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblSubtitulo.setText("Sistema de Clínica Estética");

        btnLogin.setBackground(new java.awt.Color(255, 121, 165));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("ENTRAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        edtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtLoginActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 121, 165));
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 121, 165));
        lblSenha.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSubtitulo)
                        .addGap(274, 274, 274))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogin))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblSubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btnLogin)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(edtSenha.getText().isEmpty() || edtLogin.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos de login não preenchidos.");
        } else {
            if(edtSenha.getText().equals("admin") && edtLogin.getText().equals("admin")){
                DlgProprietario telaProprietario = new DlgProprietario(this, true);
                telaProprietario.setVisible(true);
            } else {
                UsuarioController uc = new UsuarioController();        
                Usuario usuarioLogado = uc.buscarLoginUsuario(edtLogin.getText());
                System.out.println(usuarioLogado.getCargo());
                if(usuarioLogado.getCargo().equals("inexistente")){
                    JOptionPane.showMessageDialog(null, "Usuário inexistente na base de dados.");
                } else {
                    if(usuarioLogado.getCargo().equals("medico")){
                        Medico medicoLogado = (Medico) usuarioLogado;
                        if (edtSenha.getText().equals(medicoLogado.getSenha())) {
                            JOptionPane.showMessageDialog(null, "Boas vindas, " + medicoLogado.getNome());
                            DlgMedico telaMedico = new DlgMedico(this, true);
                            telaMedico.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Senha inválida");
                        }
                    } else {
                        Secretaria secretariaLogada = (Secretaria) usuarioLogado;
                        if (edtSenha.getText().equals(secretariaLogada.getSenha())) {
                            JOptionPane.showMessageDialog(null, "Boas vindas, " + secretariaLogada.getNome());
                            DlgSecretaria telaSecretaria = new DlgSecretaria(this, true);
                            telaSecretaria.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Senha inválida");
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void edtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtLoginActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
