/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Endereco;
import Model.Paciente;
import Model.exceptions.PacienteException;

/**
 *
 * @author gutei
 */
public class ValidaPaciente {
    public Paciente validaCamposEntrada(String nome, int id, String dataNascimento, String cpf, String telefone, String email){   
        Paciente novoPaciente = new Paciente();
        ValidaCpf valida = new ValidaCpf();
        if(nome.isEmpty()) throw new PacienteException("Nome não preenchido");
        novoPaciente.setNome(nome);
        if(id == -1) throw new PacienteException("Id inválido");
        novoPaciente.setId(id);
        if(dataNascimento.isEmpty()) throw new PacienteException("Data de Nascimento inválida");
        novoPaciente.setDataNascimento(dataNascimento);
        if(!valida.validaCPF(cpf)) throw new PacienteException("CPF inválido");
        novoPaciente.setCpf(cpf);
        if(telefone.isEmpty()) throw new PacienteException("Telefone inválido");
        novoPaciente.setTelefone(telefone);
        if(email.isEmpty()) throw new PacienteException("Email inválido");
        novoPaciente.setEmail(email);
        return novoPaciente;
    }
}
