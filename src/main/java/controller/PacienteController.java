package controller;


import Model.DAO.PacienteDAO;
import Model.Endereco;
import Model.Paciente;
import Model.Valid.ValidaPaciente;
import Model.exceptions.PacienteException;
import java.util.List;
import javax.swing.JTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gutei
 */
public class PacienteController {
    private PacienteDAO repositorio;
    
    public PacienteController(){
        repositorio = new PacienteDAO();
    }
    
    public boolean cadastrarPaciente(String nome, int id, String dataNascimento, String cpf, Endereco endereco, String telefone){
        ValidaPaciente valida = new ValidaPaciente();
        Paciente novoPaciente = valida.validaCamposEntrada(nome, id, dataNascimento, cpf, endereco, telefone);
        
        if(repositorio.findById(id) == null){
            repositorio.save(novoPaciente);
        } else {
            throw new PacienteException("Paciente já existnete");
        }
        return true;
    }
    
    public void atualizarPaciente(String nome, int id, String dataNascimento, String cpf, Endereco endereco, String telefone){
        ValidaPaciente valida = new ValidaPaciente();
        Paciente novoPaciente = valida.validaCamposEntrada(nome, id, dataNascimento, cpf, endereco, telefone);
        novoPaciente.setId(id);
        
        repositorio.update(novoPaciente);

    }
    
    public Paciente buscarPaciente(int id){
        return (Paciente) this.repositorio.findById(id);
    }
    
    public void excluirPaciente(int id){
        Object paciente = (Paciente) repositorio.findById(id);
        if(paciente != null){
            repositorio.delete(paciente);
        } else {
            throw new PacienteException("Paciente inexistente");
        }
    }
    
    public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMPaciente tableModel = new TMPaciente(lst);
        grd.setModel(tableModel);
    }
    
    
}
