/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.EnderecoDAO;
import Model.Endereco;
import Model.Paciente;
import Model.Valid.ValidaEndereco;
import Model.exceptions.EnderecoException;

/**
 *
 * @author gutei
 */
public class EnderecoController {
    private EnderecoDAO repositorio;
    
    public EnderecoController(){
        this.repositorio = new EnderecoDAO();
    }
    
    public void cadastrarEndereco(int id, String estado, String cidade, String rua, String numero, Paciente id_paciente){
        ValidaEndereco valid = new ValidaEndereco();
        Endereco novoEndereco = valid.validaCamposEntrada(estado, cidade, rua, numero, id_paciente);
        System.out.println(id_paciente.getId() + " <- ID PACIENTE");
        repositorio.save(novoEndereco);

    }
    
    public void atualizarEndereco(String estado, String cidade, String rua, String numero, Paciente id_paciente){
        ValidaEndereco valid = new ValidaEndereco();
        Endereco novoEndereco = valid.validaCamposEntrada(estado, cidade, rua, numero, id_paciente);
        
        repositorio.update(novoEndereco);
    }
    
    public Endereco buscarEndereco(int id){
        return (Endereco) this.repositorio.findById(id);
    }
    
    public void excluirEndereco(int id){
        Object endereco = (Endereco) repositorio.findById(id);
        
        if(endereco != null){
            repositorio.delete(endereco);
        } else {
            throw new EnderecoException("Erro - Endereço inexistente");
        }
    }
    
}
