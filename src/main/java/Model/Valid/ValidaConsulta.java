/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.exceptions.ConsultaException;

/**
 *
 * @author gutei
 */
public class ValidaConsulta {
    public Consulta validaConsulta(Paciente p, Medico m, String horario, String motivo){
        Consulta consultaValidada = new Consulta();
        if(p.getCpf().isEmpty()) throw new ConsultaException("Paciente inválido"); 
        consultaValidada.setPacienteDaConsulta(p);
        if(m.getCpf().isEmpty()) throw new ConsultaException("Médico inválido");
        consultaValidada.setMedicoDaConsulta(m);
        if(horario.isEmpty()) throw new ConsultaException("Horário inválido");
        consultaValidada.setHorarioDaConsulta(horario);
        if(motivo.isEmpty()) throw new ConsultaException("Motivo inválido");
        consultaValidada.setMotivoDaConsulta(motivo);
        return consultaValidada;
    } 
}
