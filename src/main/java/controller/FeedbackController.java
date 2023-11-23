/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.FeedbackDAO;
import Model.Feedback;
import Model.Medico;
import Model.Paciente;
import Model.Procedimento;
import Model.Valid.ValidaFeedback;
import Model.exceptions.FeedbackException;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author gutei
 */
public class FeedbackController {
    private FeedbackDAO repositorio;
    
    public FeedbackController(){
        this.repositorio = new FeedbackDAO();
    }
    
    public void cadastrarFeedback(int id, String data, Procedimento procedimento, String avaliacao, String comentarios, Medico medico, Paciente paciente){
        ValidaFeedback valid = new ValidaFeedback();
        Feedback novoFeedback = valid.validaFeedback(data, procedimento, avaliacao, comentarios, medico, paciente);
        
        if(repositorio.findById(id) == null){ 
            repositorio.save(novoFeedback);
        } else {
            throw new FeedbackException("Error - Já existe esse endereço");
        }
    }
    
    public void atualizarEndereco(int id, String data, Procedimento procedimento, String avaliacao, String comentarios, Medico medico, Paciente paciente){
        ValidaFeedback valid = new ValidaFeedback();
        Feedback novoFeedback = valid.validaFeedback(data, procedimento, avaliacao, comentarios, medico, paciente);
        
        repositorio.update(novoFeedback);
    }
    
    public Feedback buscarEndereco(int id){
        return (Feedback) this.repositorio.findById(id);
    }
    
    public void excluirEndereco(int id){
        Object feedback = (Feedback) repositorio.findById(id);
        
        if(feedback != null){
            repositorio.delete(feedback);
        } else {
            throw new FeedbackException("Erro - Endereço inexistente");
        }
    }
    
        public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMFeedback tableModel = new TMFeedback(lst);
        grd.setModel(tableModel);
    }
}
