/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.dialog;

import Model.Paciente;
import controller.PacienteController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gutei
 */
public class DlgEditarPaciente extends javax.swing.JDialog {
    PacienteController pacienteController;
    /**
     * Creates new form DlgEditarPaciente
     */
    Paciente pacienteEditando;
    public DlgEditarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pacienteController = new PacienteController();
        pacienteController.atualizarTabela(grdPaciente);
        pacienteEditando = new Paciente();
    }

        public void adicionarMascaraNosCampos(){
        try {
            MaskFormatter mascaraTelefone = new MaskFormatter("(##)####-####");
            mascaraTelefone.install(fEdtTelefone);
            MaskFormatter mascaraDataNascimento = new MaskFormatter("##/##/####");
            mascaraDataNascimento.install(fEdtDataNascimento);
        } catch (ParseException e){
            Logger.getLogger(DlgCadastroPaciente.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grdPaciente = new javax.swing.JTable();
        edtCpf = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        fEdtTelefone = new javax.swing.JFormattedTextField();
        lblNome3 = new javax.swing.JLabel();
        fEdtDataNascimento = new javax.swing.JFormattedTextField();
        btnSalvar2 = new javax.swing.JButton();
        lblNome4 = new javax.swing.JLabel();
        edtEmail = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSalvar.setBackground(new java.awt.Color(255, 121, 165));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 228, 228));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 121, 165));
        lblTitulo.setText("EDITAR PACIENTE");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 121, 165));
        lblNome.setText("NOME DO PACIENTE:");

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

        edtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCpfActionPerformed(evt);
            }
        });

        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(255, 121, 165));
        lblNome1.setText("CPF DO PACIENTE:");

        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });

        lblNome2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(255, 121, 165));
        lblNome2.setText("TELEFONE DO PACIENTE");

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 0, 51));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        fEdtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEdtTelefoneActionPerformed(evt);
            }
        });

        lblNome3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(255, 121, 165));
        lblNome3.setText("DATA DE NASCIMENTO");

        fEdtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fEdtDataNascimentoActionPerformed(evt);
            }
        });

        btnSalvar2.setBackground(new java.awt.Color(255, 121, 165));
        btnSalvar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar2.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar2.setText("SALVAR");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        lblNome4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome4.setForeground(new java.awt.Color(255, 121, 165));
        lblNome4.setText("EMAIL DO PACIENTE");

        edtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 217, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(185, 185, 185))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(lblNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fEdtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblNome1)
                    .addComponent(lblNome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEdtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fEdtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnSalvar2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCpfActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        pacienteController.atualizarPaciente(edtNome.getText(),pacienteEditando.getId(), fEdtDataNascimento.getText(), edtCpf.getText(), fEdtTelefone.getText(), edtEmail.getText());
        JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso.");

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        pacienteController.excluirPaciente(pacienteEditando.getId());
        JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso.");
        this.dispose();

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void grdPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdPacienteMouseClicked
    int rowIndex = grdPaciente.getSelectedRow();
    pacienteEditando.setNome((String) grdPaciente.getValueAt(rowIndex, 1));
    pacienteEditando.setId((int) grdPaciente.getValueAt(rowIndex, 0));
    pacienteEditando.setCpf((String) grdPaciente.getValueAt(rowIndex, 2));
    pacienteEditando.setTelefone((String) grdPaciente.getValueAt(rowIndex,3));
    pacienteEditando.setDataNascimento((String) grdPaciente.getValueAt(rowIndex,4));
    pacienteEditando.setEmail((String) grdPaciente.getValueAt(rowIndex,5));
    
    edtNome.setText(pacienteEditando.getNome());
    edtCpf.setText(pacienteEditando.getCpf());
    fEdtTelefone.setText(pacienteEditando.getTelefone());
    fEdtDataNascimento.setText(pacienteEditando.getDataNascimento());
    edtEmail.setText(pacienteEditando.getEmail());
    }//GEN-LAST:event_grdPacienteMouseClicked

    private void fEdtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEdtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fEdtTelefoneActionPerformed

    private void fEdtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fEdtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fEdtDataNascimentoActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
    System.out.println("Id do paciente: " + pacienteEditando.getId());
    // Retrieve the managed entity from the database
    Paciente managedPaciente = pacienteController.buscarPaciente(pacienteEditando.getId());

    managedPaciente.setNome(edtNome.getText());
    managedPaciente.setDataNascimento(fEdtDataNascimento.getText());
    managedPaciente.setCpf(edtCpf.getText());
    managedPaciente.setTelefone(fEdtTelefone.getText());
    managedPaciente.setId(pacienteEditando.getId());
    managedPaciente.setEmail(edtEmail.getText());
    // Merge the updated entity
    pacienteController.atualizarPaciente(managedPaciente.getNome(), managedPaciente.getId(), managedPaciente.getDataNascimento(), managedPaciente.getCpf(), managedPaciente.getTelefone(), managedPaciente.getEmail());

    JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso.");
    this.dispose();
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void edtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEmailActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JFormattedTextField edtEmail;
    private javax.swing.JTextField edtNome;
    private javax.swing.JFormattedTextField fEdtDataNascimento;
    private javax.swing.JFormattedTextField fEdtTelefone;
    private javax.swing.JTable grdPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
