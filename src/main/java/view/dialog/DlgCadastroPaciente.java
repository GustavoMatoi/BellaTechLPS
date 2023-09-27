/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import Model.Endereco;
import Model.Paciente;
import controller.EnderecoController;
import controller.PacienteController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gutei
 */
public class DlgCadastroPaciente extends javax.swing.JDialog {
    PacienteController pacienteController;
    EnderecoController enderecoController;
    /**
     * Creates new form DlgCadastroPaciente
     */
    public DlgCadastroPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.adicionarMascaraNosCampos();
        pacienteController = new PacienteController();
        enderecoController = new EnderecoController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void adicionarMascaraNosCampos(){
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraCPF.install(fEdtCpf);
        } catch (ParseException e){
            Logger.getLogger(DlgCadastroPaciente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        edtNomePaciente = new javax.swing.JTextField();
        edtIDPaciente = new javax.swing.JTextField();
        edtDataNascimento = new javax.swing.JTextField();
        edtRua = new javax.swing.JTextField();
        edtTelefone = new javax.swing.JTextField();
        lblDadosPessoais = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIDPaciente = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDadosParaContato = new javax.swing.JLabel();
        lblContato = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        edtEstado = new javax.swing.JTextField();
        edtNumero = new javax.swing.JTextField();
        edtCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblEndereco1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        fEdtCpf = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 228, 228));

        edtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtRuaActionPerformed(evt);
            }
        });

        lblDadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDadosPessoais.setForeground(new java.awt.Color(255, 121, 165));
        lblDadosPessoais.setText("DADOS PESSOAIS");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 121, 165));
        lblNome.setText("NOME DO PACIENTE:");

        lblIDPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDPaciente.setForeground(new java.awt.Color(255, 121, 165));
        lblIDPaciente.setText("ID DO PACIENTE:");

        lblDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(255, 121, 165));
        lblDataNascimento.setText("DATA DE NASCIMENTO:");

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 121, 165));
        lblCPF.setText("CPF:");

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

        edtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNumeroActionPerformed(evt);
            }
        });

        edtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCidadeActionPerformed(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 121, 165));
        lblEstado.setText("ESTADO:");

        lblRua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 121, 165));
        lblRua.setText("RUA:");

        lblCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 121, 165));
        lblCidade.setText("CIDADE:");

        lblNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 121, 165));
        lblNumero.setText("NÚMERO:");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo.setText("CADASTRO DE PACIENTE");

        lblEndereco1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEndereco1.setForeground(new java.awt.Color(255, 121, 165));
        lblEndereco1.setText("ENDEREÇO");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 121, 165));
        btnCancelar.setText("CANCELAR");

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
                        .addGap(19, 19, 19)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(edtDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtIDPaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtNomePaciente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(edtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPF)
                            .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(lblRua)
                            .addComponent(lblEstado)
                            .addComponent(edtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addComponent(lblCidade)
                            .addComponent(lblNumero)
                            .addComponent(lblDadosParaContato)
                            .addComponent(lblDadosPessoais)
                            .addComponent(lblContato)
                            .addComponent(lblEndereco1)
                            .addComponent(fEdtCpf))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(128, 128, 128))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDadosPessoais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIDPaciente)
                .addGap(5, 5, 5)
                .addComponent(edtIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDataNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCPF)
                .addGap(3, 3, 3)
                .addComponent(fEdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEndereco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCidade)
                .addGap(2, 2, 2)
                .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRua)
                .addGap(4, 4, 4)
                .addComponent(edtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumero)
                .addGap(5, 5, 5)
                .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDadosParaContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContato, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
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

    private void edtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCidadeActionPerformed

    private void edtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNumeroActionPerformed

    private void edtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtRuaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Endereco e = new Endereco();
        //enderecoController.cadastrarEndereco(edtEstado.getText(), edtCidade.getText(), edtRua.getText(), edtNumero.getText());
        e.setEstado(edtEstado.getText());
        e.setCidade(edtCidade.getText());
        e.setNumero(edtNumero.getText());
        e.setRua(edtRua.getText());
        System.out.println(edtNomePaciente.getText()+ " " + Integer.parseInt(edtIDPaciente.getText()) + " " + edtDataNascimento.getText() + " " + fEdtCpf.getText() + " " + edtTelefone.getText());
        pacienteController.cadastrarPaciente(edtNomePaciente.getText(), Integer.parseInt(edtIDPaciente.getText()), edtDataNascimento.getText(), fEdtCpf.getText(), e, edtTelefone.getText());
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtDataNascimento;
    private javax.swing.JTextField edtEstado;
    private javax.swing.JTextField edtIDPaciente;
    private javax.swing.JTextField edtNomePaciente;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtRua;
    private javax.swing.JTextField edtTelefone;
    private javax.swing.JFormattedTextField fEdtCpf;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblDadosParaContato;
    private javax.swing.JLabel lblDadosPessoais;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIDPaciente;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
