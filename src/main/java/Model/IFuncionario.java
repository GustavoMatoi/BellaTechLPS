/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gutei
 */

public interface IFuncionario {
    public void cadastrarProcedimento(Procedimento novoProcedimento);
    public void cadastrarPaciente(Paciente novoPaciente);
    public void cadastrarConsulta(Consulta novaConsulta);

}