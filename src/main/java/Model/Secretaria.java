/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gutei
 */
public class Secretaria extends Usuario implements IFuncionario {

    @Override
    public void cadastrarProcedimento(Procedimento novoProcedimento) {
        System.out.println("Cadastrou novo procedimento");
    }

    @Override
    public void cadastrarPaciente(Paciente novoPaciente) {
        System.out.println("Cadastrou novo paciente");
    }

    @Override
    public void cadastrarConsulta(Consulta novaConsulta) {
        System.out.println("Cadastrou nova consulta");

    }

    @Override
    public void fazerRelatorioDeProcedimentos(Relatorio novoRelatorio) {
        System.out.println("Fez relatório de procedimentos");
    }
    
}
