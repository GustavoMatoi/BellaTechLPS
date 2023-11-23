/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.Procedimento;
import controller.ConsultaController;
import controller.MedicoController;
import controller.PacienteController;
import controller.ProcedimentoController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gutei
 */
public class DlgCadastrarConsulta extends javax.swing.JDialog {

    PacienteController pacienteController;
    ConsultaController consultaController;
    Paciente pacienteConsulta;
    Medico medicoConsulta;
    MedicoController medicoController;
    Procedimento procedimento;
    ProcedimentoController procedimentoController;
    Consulta consultaEditando;
    public DlgCadastrarConsulta(java.awt.Frame parent, boolean modal, Consulta c) {
        super(parent, modal);
        initComponents();
        pacienteController = new PacienteController();
        consultaController = new ConsultaController();
        pacienteController.atualizarTabela(grdPacientes);
        pacienteConsulta = new Paciente();
        medicoController = new MedicoController();
        medicoConsulta = new Medico();
        medicoController.atualizarTabela(grdMedico);
        procedimento = new Procedimento();
        procedimentoController = new ProcedimentoController();
        procedimentoController.atualizarTabela(grdProcedimento);
        this.consultaEditando = c;
        this.adicionarMascaraNosCampos();
        this.verificarConsultaEditando();
    }

        public void adicionarMascaraNosCampos(){
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("##/## ##:##");
            mascaraCPF.install(fEdtDataHora);
        } catch (ParseException e){
            Logger.getLogger(DlgCadastroPaciente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
        public void verificarConsultaEditando(){
            if(consultaEditando != null){
                fEdtDataHora.setText(consultaEditando.getHorarioDaConsulta());
                edtMotivoConsulta.setText(consultaEditando.getMotivoDaConsulta());
            }
        }
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        edtMotivoConsulta = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        lblMedico = new javax.swing.JLabel();
        lblDataHora = new javax.swing.JLabel();
        lblMotivoConsulta = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblLogo1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdPacientes = new javax.swing.JTable();
        fEdtDataHora = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdMedico = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        grdProcedimento = new javax.swing.JTable();
        lblMedico1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 228, 228));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo.setText("CADASTRO DE CONSULTA");

        lblPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPaciente.setForeground(new java.awt.Color(255, 121, 165));
        lblPaciente.setText("PACIENTE:");

        lblMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMedico.setForeground(new java.awt.Color(255, 121, 165));
        lblMedico.setText("MÉDICO:");

        lblDataHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDataHora.setForeground(new java.awt.Color(255, 121, 165));
        lblDataHora.setText("DATA E HORA:");

        lblMotivoConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMotivoConsulta.setForeground(new java.awt.Color(255, 121, 165));
        lblMotivoConsulta.setText("MOTIVO DA CONSULTA:");

        btnSalvar.setBackground(new java.awt.Color(255, 121, 165));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblLogo1.setFont(new java.awt.Font("Monotype Corsiva", 0, 14)); // NOI18N
        lblLogo1.setForeground(new java.awt.Color(255, 121, 165));
        lblLogo1.setText("BellaTech  ©2023");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 121, 165));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        grdPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        grdPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdPacientes);

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
        jScrollPane2.setViewportView(grdMedico);

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
        jScrollPane3.setViewportView(grdProcedimento);

        lblMedico1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMedico1.setForeground(new java.awt.Color(255, 121, 165));
        lblMedico1.setText("PROCEDIMENTO:");

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(321, 321, 321))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fEdtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMotivoConsulta)
                            .addComponent(edtMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblLogo1)
                        .addGap(16, 16, 16))))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(36, 36, 36)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataHora)
                    .addComponent(lblMotivoConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fEdtDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtMotivoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(lblLogo1)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(pacienteConsulta.getNome().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um paciente antes de prosseguir.");
        }
        if(medicoConsulta.getNome().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um médico antes de prosseguir.");
        }
        if(procedimento == null){
            JOptionPane.showMessageDialog(null, "Selecione um procedimento antes de prosseguir.");
        }
        consultaController.cadastrarConsulta(0, pacienteConsulta,medicoConsulta, fEdtDataHora.getText(), edtMotivoConsulta.getText(), procedimento);
        JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso.");
        this.dispose();
     

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void grdPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdPacientesMouseClicked
        int indexSelecionado = grdPacientes.getSelectedRow();
        pacienteConsulta.setNome(grdPacientes.getValueAt(indexSelecionado, 1).toString());
        System.out.println(pacienteConsulta.getNome());
        pacienteConsulta.setCpf(grdPacientes.getValueAt(indexSelecionado, 2).toString());
        pacienteConsulta.setId(Integer.parseInt(grdPacientes.getValueAt(indexSelecionado,0).toString()));
        pacienteConsulta.setTelefone(grdPacientes.getValueAt(indexSelecionado, 1).toString());
    }//GEN-LAST:event_grdPacientesMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void grdMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdMedicoMouseClicked
        int indexSelecionado = grdMedico.getSelectedRow();
        medicoConsulta.setNome(grdMedico.getValueAt(indexSelecionado, 1).toString());
        medicoConsulta.setCpf(grdMedico.getValueAt(indexSelecionado, 2).toString());
        medicoConsulta.setId(Integer.parseInt(grdMedico.getValueAt(indexSelecionado,0).toString()));
        medicoConsulta.setTelefone(grdMedico.getValueAt(indexSelecionado, 1).toString());
    }//GEN-LAST:event_grdMedicoMouseClicked

    private void grdProcedimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdProcedimentoMouseClicked
        int indexSelecionado = grdProcedimento.getSelectedRow();
        procedimento.setId((int) grdProcedimento.getValueAt(indexSelecionado, 0));
        procedimento.setNome((String) grdProcedimento.getValueAt(indexSelecionado, 1));
        procedimento.setDescricao((String) grdProcedimento.getValueAt(indexSelecionado,2));
    }//GEN-LAST:event_grdProcedimentoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtMotivoConsulta;
    private javax.swing.JFormattedTextField fEdtDataHora;
    private javax.swing.JTable grdMedico;
    private javax.swing.JTable grdPacientes;
    private javax.swing.JTable grdProcedimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblMedico;
    private javax.swing.JLabel lblMedico1;
    private javax.swing.JLabel lblMotivoConsulta;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
