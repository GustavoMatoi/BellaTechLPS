/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import Model.Usuario;
import controller.MedicoController;
import controller.SecretariaController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class DlgCadastrarUsuario extends javax.swing.JDialog {

    SecretariaController sc;
    MedicoController mc;
    private String cargo;
    public DlgCadastrarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        sc = new SecretariaController();
        mc = new MedicoController();
        this.adicionarMascaraNosCampos();
        this.cargo = "";
    }

    public void adicionarMascaraNosCampos(){
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            MaskFormatter mascaraDataNascimento = new MaskFormatter("##/##/####");
            MaskFormatter mascaraTelefone = new MaskFormatter("(##)####-####");
            mascaraCPF.install(fEdtCpf);
            mascaraDataNascimento.install(fEdtDataNascimento);
            mascaraTelefone.install(fEdtTelefone);
        } catch (ParseException e){
            Logger.getLogger(DlgCadastroPaciente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlBackground = new javax.swing.JPanel();
        edtNomeUsuario = new javax.swing.JTextField();
        edtLogin = new javax.swing.JTextField();
        edtSenha = new javax.swing.JTextField();
        lblDadosPessoais = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblDadosParaContato = new javax.swing.JLabel();
        lblContato = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblDataNascimento = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        fEdtCpf = new javax.swing.JFormattedTextField();
        fEdtDataNascimento = new javax.swing.JFormattedTextField();
        fEdtTelefone = new javax.swing.JFormattedTextField();
        RbtnSecretaria = new javax.swing.JRadioButton();
        RbtnMedico = new javax.swing.JRadioButton();
        lblCpf1 = new javax.swing.JLabel();
        edtSalario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 228, 228));

        lblDadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDadosPessoais.setForeground(new java.awt.Color(255, 121, 165));
        lblDadosPessoais.setText("DADOS PESSOAIS");

        lblNomeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 121, 165));
        lblNomeUsuario.setText("NOME DO USUÁRIO:");

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 121, 165));
        lblCpf.setText("CPF:");

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 121, 165));
        lblLogin.setText("LOGIN:");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 121, 165));
        lblSenha.setText("SENHA:");

        lblDadosParaContato.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDadosParaContato.setForeground(new java.awt.Color(255, 121, 165));
        lblDadosParaContato.setText("DADOS PARA CONTATO");

        lblContato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContato.setForeground(new java.awt.Color(255, 121, 165));
        lblContato.setText("NÚMERO DE TELEFONE:");

        btnSalvar.setBackground(new java.awt.Color(255, 121, 165));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblLogo.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 121, 165));
        lblLogo.setText("BellaTech  ©2023");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo.setText("CADASTRO DE USUÁRIO");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 121, 165));
        btnCancelar.setText("CANCELAR");

        lblDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(255, 121, 165));
        lblDataNascimento.setText("DATA DE NASCIMENTO:");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 121, 165));
        lblCargo.setText("CARGO:");

        RbtnSecretaria.setText("Secretária");
        RbtnSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnSecretariaActionPerformed(evt);
            }
        });

        RbtnMedico.setText("Médico");
        RbtnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnMedicoActionPerformed(evt);
            }
        });

        lblCpf1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCpf1.setForeground(new java.awt.Color(255, 121, 165));
        lblCpf1.setText("SALÁRIO:");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(229, 229, 229))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(RbtnSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(RbtnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(lblCargo)
                            .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha)
                            .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDadosPessoais)
                            .addComponent(lblDataNascimento)
                            .addComponent(edtSenha)
                            .addComponent(edtLogin)
                            .addComponent(edtNomeUsuario)
                            .addComponent(fEdtCpf))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblLogo)
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDadosParaContato)
                            .addComponent(lblContato)
                            .addComponent(lblCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edtSalario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fEdtTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(lblDadosPessoais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNomeUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fEdtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblTitulo)
                                .addGap(29, 29, 29)
                                .addComponent(lblDadosParaContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblContato, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fEdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblCpf1)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbtnSecretaria)
                    .addComponent(RbtnMedico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       if(cargo.equals("medico")){
            System.out.println(edtNomeUsuario.getText());
            float salario = (float) 999.99;
            mc.cadastrarMedico(0, edtNomeUsuario.getText(), fEdtCpf.getText(), edtLogin.getText(), edtSenha.getText(), fEdtDataNascimento.getText(), fEdtTelefone.getText(), "medico", Float.parseFloat(edtSalario.getText()));
            JOptionPane.showMessageDialog(null, "Médico cadastrado com sucesso");
            this.dispose();
       } else  if (cargo.equals("secretaria")){
            sc.cadastrarSecretaria(0, edtNomeUsuario.getText(), fEdtCpf.getText(), edtLogin.getText(), edtSenha.getText(), fEdtDataNascimento.getText(), fEdtTelefone.getText(),"secretaria", Float.parseFloat(edtSalario.getText()));
            JOptionPane.showMessageDialog(null, "Secretária cadastrada com sucesso!");
            this.dispose();
       } else {
            JOptionPane.showMessageDialog(null, "Selecione um cargo antes de prosseguir.");

       }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void RbtnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnMedicoActionPerformed
        this.cargo = "medico";
    }//GEN-LAST:event_RbtnMedicoActionPerformed

    private void RbtnSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnSecretariaActionPerformed
        this.cargo = "secretaria";
    }//GEN-LAST:event_RbtnSecretariaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnMedico;
    private javax.swing.JRadioButton RbtnSecretaria;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtNomeUsuario;
    private javax.swing.JTextField edtSalario;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JFormattedTextField fEdtCpf;
    private javax.swing.JFormattedTextField fEdtDataNascimento;
    private javax.swing.JFormattedTextField fEdtTelefone;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpf1;
    private javax.swing.JLabel lblDadosParaContato;
    private javax.swing.JLabel lblDadosPessoais;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
