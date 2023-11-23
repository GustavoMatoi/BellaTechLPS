/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import Model.Feedback;
import Model.Medico;
import Model.Paciente;
import Model.Procedimento;
import controller.FeedbackController;
import controller.MedicoController;
import controller.PacienteController;
import controller.ProcedimentoController;
import javax.swing.JOptionPane;

/**
 *
 * @author gutei
 */
public class DlgReceberFeedback extends javax.swing.JDialog {

    MedicoController medicoController;
    ProcedimentoController procedimentoController;
    PacienteController pacienteController;
    Paciente paciente;
    Medico medico;
    Procedimento procedimento;
    Feedback feedback;
    FeedbackController feedbackController;
    public DlgReceberFeedback(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
                procedimentoController = new ProcedimentoController();
        pacienteController = new PacienteController();
        
        medicoController = new MedicoController();
        procedimentoController.atualizarTabela(grdProcedimento);
        pacienteController.atualizarTabela(grdPaciente);
        medicoController.atualizarTabela(grdMedico);

        paciente = new Paciente();
        medico = new Medico();
        procedimento = new Procedimento();
        feedback = new Feedback();
        feedbackController = new FeedbackController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        pnlBackground = new javax.swing.JPanel();
        edtData = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblProcedimento = new javax.swing.JLabel();
        lblMedico = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblAvaliacao = new javax.swing.JLabel();
        btnUmaEstrela = new javax.swing.JRadioButton();
        btnDuasEstrelas = new javax.swing.JRadioButton();
        btnTresEstrelas = new javax.swing.JRadioButton();
        btnQuatroEstrelas = new javax.swing.JRadioButton();
        btnCincoEstrelas = new javax.swing.JRadioButton();
        lblComentarios = new javax.swing.JLabel();
        edtComentarios = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdMedico = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdPaciente = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        grdProcedimento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 228, 228));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 121, 165));
        lblNome.setText("PACIENTE:");

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 121, 165));
        lblData.setText("DATA:");

        lblProcedimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProcedimento.setForeground(new java.awt.Color(255, 121, 165));
        lblProcedimento.setText("PROCEDIMENTO REALIZADO:");

        lblMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMedico.setForeground(new java.awt.Color(255, 121, 165));
        lblMedico.setText("MÉDICO RESPONSÁVEL:");

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
        lblTitulo.setText("FEEDBACK DO PACIENTE");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 121, 165));
        btnCancelar.setText("CANCELAR");

        lblAvaliacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAvaliacao.setForeground(new java.awt.Color(255, 121, 165));
        lblAvaliacao.setText("AVALIAÇÃO:");

        btnUmaEstrela.setBackground(new java.awt.Color(255, 228, 228));
        btnUmaEstrela.setText("⭐");
        btnUmaEstrela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmaEstrelaActionPerformed(evt);
            }
        });

        btnDuasEstrelas.setBackground(new java.awt.Color(255, 228, 228));
        btnDuasEstrelas.setText("⭐⭐");
        btnDuasEstrelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuasEstrelasActionPerformed(evt);
            }
        });

        btnTresEstrelas.setBackground(new java.awt.Color(255, 228, 228));
        btnTresEstrelas.setText("⭐⭐⭐");
        btnTresEstrelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresEstrelasActionPerformed(evt);
            }
        });

        btnQuatroEstrelas.setBackground(new java.awt.Color(255, 228, 228));
        btnQuatroEstrelas.setText("⭐⭐⭐⭐");
        btnQuatroEstrelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroEstrelasActionPerformed(evt);
            }
        });

        btnCincoEstrelas.setBackground(new java.awt.Color(255, 228, 228));
        btnCincoEstrelas.setText("⭐⭐⭐⭐⭐");
        btnCincoEstrelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoEstrelasActionPerformed(evt);
            }
        });

        lblComentarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblComentarios.setForeground(new java.awt.Color(255, 121, 165));
        lblComentarios.setText("COMENTÁRIOS:");

        grdMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdMedicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdMedico);

        grdPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdPacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grdPaciente);

        grdProcedimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdProcedimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdProcedimentoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(grdProcedimento);

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(btnUmaEstrela, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDuasEstrelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTresEstrelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnQuatroEstrelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCincoEstrelas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblAvaliacao)))
                        .addGap(179, 179, 179))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addComponent(lblProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblComentarios)
                            .addComponent(edtComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(lblMedico)
                        .addGap(436, 436, 436))))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblTitulo))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(116, 116, 116))
            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(939, Short.MAX_VALUE)))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProcedimento)
                            .addComponent(lblMedico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(lblNome)
                        .addGap(311, 311, 311)))
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUmaEstrela)
                            .addComponent(btnDuasEstrelas)
                            .addComponent(btnTresEstrelas)
                            .addComponent(btnQuatroEstrelas)
                            .addComponent(btnCincoEstrelas)))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblComentarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(8, 8, 8)
                .addComponent(lblLogo))
            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUmaEstrelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmaEstrelaActionPerformed
        feedback.setAvaliacao("1 estrela");
    }//GEN-LAST:event_btnUmaEstrelaActionPerformed

    private void grdPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdPacienteMouseClicked
        int rowIndex = grdPaciente.getSelectedRow();
        paciente.setId((int) grdPaciente.getValueAt(rowIndex, 0));
        paciente.setNome((String) grdPaciente.getValueAt(rowIndex, 1));
        paciente.setCpf((String) grdPaciente.getValueAt(rowIndex, 2));
        paciente.setDataNascimento((String) grdPaciente.getValueAt(rowIndex, 3));
        paciente.setTelefone((String) grdPaciente.getValueAt(rowIndex, 4));

    }//GEN-LAST:event_grdPacienteMouseClicked

    private void grdProcedimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdProcedimentoMouseClicked
        int rowIndex = grdProcedimento.getSelectedRow();
        procedimento.setId((int) grdProcedimento.getValueAt(rowIndex, 0));
        procedimento.setNome((String) grdProcedimento.getValueAt(rowIndex, 1));
        procedimento.setDescricao((String) grdProcedimento.getValueAt(rowIndex, 2));

    }//GEN-LAST:event_grdProcedimentoMouseClicked

    private void grdMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdMedicoMouseClicked
        int rowIndex = grdMedico.getSelectedRow();
        medico.setId((int) grdMedico.getValueAt(rowIndex, 0));
        medico.setNome((String) grdMedico.getValueAt(rowIndex, 1));
        medico.setCpf((String) grdMedico.getValueAt(rowIndex, 2));
        medico.setTelefone((String) grdMedico.getValueAt(rowIndex, 3));
    }//GEN-LAST:event_grdMedicoMouseClicked

    private void btnDuasEstrelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuasEstrelasActionPerformed
        feedback.setAvaliacao("2 estrelas");
    }//GEN-LAST:event_btnDuasEstrelasActionPerformed

    private void btnTresEstrelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresEstrelasActionPerformed
        feedback.setAvaliacao("3 estrelas");
    }//GEN-LAST:event_btnTresEstrelasActionPerformed

    private void btnQuatroEstrelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroEstrelasActionPerformed
        feedback.setAvaliacao("4 estrelas");

    }//GEN-LAST:event_btnQuatroEstrelasActionPerformed

    private void btnCincoEstrelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoEstrelasActionPerformed
        feedback.setAvaliacao("5 estrelas");

    }//GEN-LAST:event_btnCincoEstrelasActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        feedback.setData(edtData.getText());
        feedback.setComentarios(edtComentarios.getText());
        feedback.setPaciente(paciente);
        feedback.setMedico(medico);
        feedback.setProcedimento(procedimento);
        feedbackController.cadastrarFeedback(0, feedback.getData(), procedimento, feedback.getAvaliacao(), feedback.getComentarios(), medico, paciente);
        JOptionPane.showMessageDialog(null, "Feedback cadastrado com sucesso.");
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnCincoEstrelas;
    private javax.swing.JRadioButton btnDuasEstrelas;
    private javax.swing.JRadioButton btnQuatroEstrelas;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JRadioButton btnTresEstrelas;
    private javax.swing.JRadioButton btnUmaEstrela;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JTextField edtComentarios;
    private javax.swing.JTextField edtData;
    private javax.swing.JTable grdMedico;
    private javax.swing.JTable grdPaciente;
    private javax.swing.JTable grdProcedimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblComentarios;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProcedimento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
