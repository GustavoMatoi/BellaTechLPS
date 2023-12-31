/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.MedicoDAO;
import Model.Endereco;
import Model.Medico;
import Model.Valid.ValidaMedico;
import Model.exceptions.MedicoException;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author gutei
 */
public class MedicoController {
    private MedicoDAO repositorio;
    
    public MedicoController(){
        repositorio = new MedicoDAO();
    }
    
    public boolean cadastrarMedico(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        ValidaMedico valida = new ValidaMedico();
        Medico novoPaciente = valida.validaMedico(id, nome, cpf, login, senha, dataNascimento, telefone,cargo, salario);
        
            repositorio.save(novoPaciente);

        return true;
    }
    
    public void atualizarMedico(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        ValidaMedico valida = new ValidaMedico();
        Medico novoMedico = valida.validaMedico(id, nome, cpf, login, senha, dataNascimento, telefone,cargo, salario);
        repositorio.update(novoMedico);        
    }
    
    public Medico buscarMedico(int id){
        return (Medico) this.repositorio.findById(id);
    }
    
    public Medico buscarMedicoLogin(String login){
        return (Medico) this.repositorio.findByLogin(login);
    }
    
    public void excluirPaciente(int id){
        Object medico = (Medico) repositorio.findById(id);
        if(medico != null){
            repositorio.delete(medico);
        } else {
            throw new MedicoException("Paciente inexistente");
        }
    }
    
        public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMMEdico tableModel = new TMMEdico(lst);
        System.out.println(lst.size());
        grd.setModel(tableModel);
    }
}
