/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import controller.PacienteController;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gutei
 */
@Getter
@Setter
@Entity
@DiscriminatorValue("SECRETARIA")

public class Secretaria extends Usuario implements IFuncionario {

    @Override
    public void cadastrarProcedimento(Procedimento novoProcedimento) {
        System.out.println("Cadastrou novo procedimento");
    }

    @Override
    public void cadastrarPaciente(Paciente novoPaciente) {
        PacienteController pacienteController = new PacienteController();
        pacienteController.cadastrarPaciente(novoPaciente.getNome(), 0, novoPaciente.getDataNascimento(), novoPaciente.getCpf(), novoPaciente.getTelefone(), novoPaciente.getEmail());
    }

    @Override
    public void cadastrarConsulta(Consulta novaConsulta) {
        System.out.println("Cadastrou nova consulta");

    }
    
}
