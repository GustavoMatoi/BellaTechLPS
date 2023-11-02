/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Medico;
import Model.Usuario;
import Model.exceptions.MedicoException;
import Model.exceptions.UsuarioException;

/**
 *
 * @author gutei
 */
public class ValidaUsuario {
    public Usuario validaUsuario(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        Medico m = new Medico();
        if(id == -1) throw new UsuarioException("Id inválido");
        m.setId(id);
        if(nome.isEmpty()) throw new UsuarioException("Nome inválido");
        m.setNome(nome);
        ValidaCpf cpfValidado = new ValidaCpf();
        if(!cpfValidado.validaCPF(cpf)) throw new UsuarioException("CPF inválido");
        m.setCpf(cpf);
        if(login.isEmpty()) throw new UsuarioException("Login inválido");
        m.setLogin(login);
        if(senha.isEmpty()) throw new UsuarioException("Senha inválida");
        m.setSenha(senha);
        if(dataNascimento.isEmpty()) throw new UsuarioException("Data de nascimento inválida");
        m.setDataNascimento(dataNascimento);
        if(telefone.isEmpty()) throw new UsuarioException("Telefone inválido");
        m.setTelefone(telefone);
        if(cargo.isEmpty()) throw new UsuarioException("Cargo inválido");
        m.setCargo(cargo);
        if(salario == 0) throw new UsuarioException("Salário inválido");
        m.setSalario(salario);
        return m;
    }
}
