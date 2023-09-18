/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.EnderecoDAO;
import Model.Endereco;
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
    
    public void cadastrarEndereco(String estado, String cidade, String rua, String numero){
        ValidaEndereco valid = new ValidaEndereco();
        Endereco novoEndereco = valid.validaCamposEntrada(estado, cidade, rua, numero);
        
        if(repositorio.findByRuaNumero(rua, numero) == null){ 
            repositorio.save(novoEndereco);
        } else {
            throw new EnderecoException("Error - Já existe esse endereço");
        }
    }
    
    public void atualizarEndereco(String estado, String cidade, String rua, String numero){
        ValidaEndereco valid = new ValidaEndereco();
        Endereco novoEndereco = valid.validaCamposEntrada(estado, cidade, rua, numero);
        
        repositorio.update(novoEndereco);
    }
    
    public Endereco buscarEndereco(String rua, String numero){
        return (Endereco) this.repositorio.findByRuaNumero(rua, numero);
    }
    
    public void excluirEndereco(String rua, String numero){
        Object endereco = (Endereco) repositorio.findByRuaNumero(rua, numero);
        
        if(endereco != null){
            repositorio.delete(endereco);
        } else {
            throw new EnderecoException("Erro - Endereço inexistente");
        }
    }
    
}
