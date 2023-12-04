/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.Procedimento;
import Model.exceptions.ConsultaException;

/**
 *
 * @author gutei
 */
public class ValidaConsulta {
    public Consulta validaConsulta(Paciente p, int medicoId, String horario, String motivo, Procedimento procedimento){
        Consulta consultaValidada = new Consulta();
        if(horario.isEmpty()) throw new ConsultaException("Horário inválido");
        consultaValidada.setHorarioDaConsulta(horario);
        if(motivo.isEmpty()) throw new ConsultaException("Motivo inválido");
        consultaValidada.setMotivoDaConsulta(motivo);
        if(procedimento == null) throw new ConsultaException("Proceidmento inválido");
        consultaValidada.setProcedimento(procedimento);
        if(p == null) throw new ConsultaException("Paciente Inválido");
        consultaValidada.setPaciente(p);
        if(medicoId == -1) throw new ConsultaException("Médico inválido");
        consultaValidada.setIdMedico(medicoId);
        return consultaValidada;
    } 
}
