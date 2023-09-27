/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.exceptions.SecretariaException;
import Model.Secretaria;

/**
 *
 * @author gutei
 */
public class ValidaSecretaria {
        public Secretaria validaMedico(int id, String nome, String cpf, String login, String senha, String dataNascimento, String telefone, String cargo, Float salario){
        Secretaria m = new Secretaria();
        if(id == -1) throw new SecretariaException("Id inválido");
        m.setId(id);
        if(nome.isEmpty()) throw new SecretariaException("Nome inválido");
        m.setNome(nome);
        ValidaCpf cpfValidado = new ValidaCpf();
        if(!cpfValidado.validaCPF(cpf)) throw new SecretariaException("CPF inválido");
        m.setCpf(cpf);
        if(login.isEmpty()) throw new SecretariaException("Login inválido");
        m.setLogin(login);
        if(senha.isEmpty()) throw new SecretariaException("Senha inválida");
        m.setSenha(senha);
        if(dataNascimento.isEmpty()) throw new SecretariaException("Data de nascimento inválida");
        m.setDataNascimento(dataNascimento);
        if(telefone.isEmpty()) throw new SecretariaException("Telefone inválido");
        m.setTelefone(telefone);
        if(cargo.isEmpty()) throw new SecretariaException("Cargo inválido");
        m.setCargo(cargo);
        if(salario == 0) throw new SecretariaException("Salário inválido");
        m.setSalario(salario);
        return m;
    }
}
