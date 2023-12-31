/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import Model.Paciente;
import Model.Relatorio;
import Model.Valid.ValidaRelatorio;
import controller.PacienteController;
import controller.RelatorioController;
import javax.swing.JOptionPane;

/**
 *
 * @author gutei
 */
public class DlgRelatorioProcedimento extends javax.swing.JDialog {
    RelatorioController relatorioController;
    PacienteController pacienteController;
    Paciente p;

    public DlgRelatorioProcedimento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pacienteController = new PacienteController();
        relatorioController = new RelatorioController();
        pacienteController.atualizarTabela(grdPacientes);
        p = null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        edtProtocolo = new javax.swing.JTextField();
        edtJustificativa = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblProtocolo = new javax.swing.JLabel();
        lblJustificativa = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdPacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackground.setBackground(new java.awt.Color(255, 228, 228));

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 121, 165));
        lblNome.setText("NOME DO PACIENTE:");

        lblProtocolo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProtocolo.setForeground(new java.awt.Color(255, 121, 165));
        lblProtocolo.setText("PROTOCOLO DE ATENDIMENTO ESCOLHIDO:");

        lblJustificativa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJustificativa.setForeground(new java.awt.Color(255, 121, 165));
        lblJustificativa.setText("JUSTIFICATIVA DO TRATAMENTO PROPOSTO:");

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
        lblTitulo.setText("RELATÓRIO DE PROCEDIMENTO");

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
                        .addGap(124, 124, 124)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(edtJustificativa, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                                        .addComponent(edtProtocolo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblProtocolo, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(lblTitulo))))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProtocolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJustificativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtJustificativa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(2, 2, 2)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(p != null){
            relatorioController.cadastrarRelatorio(p, edtProtocolo.getText() , edtJustificativa.getText());
            JOptionPane.showMessageDialog(null, "Relatório cadastrado com sucesso.");
            this.dispose();
        } else { 
            JOptionPane.showMessageDialog(null, "Selecione um paciente antes de prosseguir.");
        
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void grdPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdPacientesMouseClicked
        p = new Paciente();
        int rowIndex = grdPacientes.getSelectedRow();
        p.setId((int) grdPacientes.getValueAt(rowIndex, 0));
        p.setNome((String) grdPacientes.getValueAt(rowIndex, 1));
        p.setCpf((String) grdPacientes.getValueAt(rowIndex, 2));
        p.setTelefone((String) grdPacientes.getValueAt(rowIndex,3));
        p.setDataNascimento((String) grdPacientes.getValueAt(rowIndex, 4));
        p.setEmail((String) grdPacientes.getValueAt(rowIndex, 5));
        
    }//GEN-LAST:event_grdPacientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtJustificativa;
    private javax.swing.JTextField edtProtocolo;
    private javax.swing.JTable grdPacientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJustificativa;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblProtocolo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBackground;
    // End of variables declaration//GEN-END:variables
}
