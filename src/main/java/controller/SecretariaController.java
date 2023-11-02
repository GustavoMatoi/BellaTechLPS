/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.SecretariaDAO;
import Model.DAO.UsuarioDAO;
import Model.Endereco;
import Model.Secretaria;
import Model.Usuario;
import Model.Valid.ValidaSecretaria;
import Model.Valid.ValidaUsuario;
import Model.exceptions.UsuarioException;

/**
 *
 * @author gutei
 */
public class SecretariaController {
    private SecretariaDAO repositorio;
    
    public SecretariaController(){
        repositorio = new SecretariaDAO();
    }
    
    public boolean cadastrarSecretaria(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        ValidaSecretaria valida = new ValidaSecretaria();
        Usuario novoUsuario = valida.validaSecretaria(id, nome, cpf, login, senha, dataNascimento, telefone,cargo, salario);
        repositorio.save(novoUsuario);
        return true;
    }
    
    public void atualizarSecretaria(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        ValidaSecretaria valida = new ValidaSecretaria();
        Secretaria novaSecretaria = valida.validaSecretaria(id, nome, cpf, login, senha, dataNascimento, telefone,cargo, salario);
        repositorio.update(novaSecretaria);        
    }
    
    public Secretaria buscarSecretaria(int id){
        return (Secretaria) this.repositorio.findById(id);
    }
    
    public Secretaria buscarLoginSecretaria(String login){
        return (Secretaria) this.repositorio.findByLogin(login);
    }
    
    public void excluirUsuario(int id){
        Object usuario = (Usuario) repositorio.findById(id);
        if(usuario != null){
            repositorio.delete(usuario);
        } else {
            throw new UsuarioException("usuario inexistente");
        }
    }
    
    
}
