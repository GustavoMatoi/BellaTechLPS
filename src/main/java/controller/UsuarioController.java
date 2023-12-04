/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.UsuarioDAO;
import Model.Endereco;
import Model.Usuario;
import Model.Valid.ValidaUsuario;
import Model.exceptions.UsuarioException;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author gutei
 */
public class UsuarioController {
    private UsuarioDAO repositorio;
    
    public UsuarioController(){
        repositorio = new UsuarioDAO();
    }
    
    public boolean cadastrarUsuario(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        ValidaUsuario valida = new ValidaUsuario();
        Usuario novoUsuario = valida.validaUsuario(id, nome, cpf, login, senha, dataNascimento, telefone,cargo, salario);
        
            repositorio.save(novoUsuario);

        return true;
    }
    
    public void atualizarUsuario(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        ValidaUsuario valida = new ValidaUsuario();
        Usuario novoUsuario = valida.validaUsuario(id, nome, cpf, login, senha, dataNascimento, telefone,cargo, salario);
        repositorio.update(novoUsuario);        
    }
    
    public Usuario buscarUsuario(int id){
        return (Usuario) this.repositorio.findById(id);
    }
    
    public Usuario buscarLoginUsuario(String login){
        return (Usuario) this.repositorio.findByLogin(login);
    }
    
    public void excluirUsuario(int id){
        Object usuario = (Usuario) repositorio.findById(id);
        if(usuario != null){
            repositorio.delete(usuario);
        } else {
            throw new UsuarioException("usuario inexistente");
        }
    }
    
    public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMFuncionario tableModel = new TMFuncionario(lst);
        grd.setModel(tableModel);
    }
    
   
}
