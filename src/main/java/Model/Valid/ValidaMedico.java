/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Medico;
import Model.exceptions.MedicoException;

/**
 *
 * @author gutei
 */
public class ValidaMedico {
    public Medico validaMedico(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        Medico m = new Medico();
        if(id == -1) throw new MedicoException("Id inválido");
        m.setId(id);
        if(nome.isEmpty()) throw new MedicoException("Nome inválido");
        m.setNome(nome);
        ValidaCpf cpfValidado = new ValidaCpf();
        if(!cpfValidado.validaCPF(cpf)) throw new MedicoException("CPF inválido");
        m.setCpf(cpf);
        if(login.isEmpty()) throw new MedicoException("Login inválido");
        m.setLogin(login);
        if(senha.isEmpty()) throw new MedicoException("Senha inválida");
        m.setSenha(senha);
        if(dataNascimento.isEmpty()) throw new MedicoException("Data de nascimento inválida");
        m.setDataNascimento(dataNascimento);
        if(telefone.isEmpty()) throw new MedicoException("Telefone inválido");
        m.setTelefone(telefone);
        if(cargo.isEmpty()) throw new MedicoException("Cargo inválido");
        m.setCargo(cargo);
        if(salario == 0) throw new MedicoException("Salário inválido");
        m.setSalario(salario);
        return m;
    }
}
