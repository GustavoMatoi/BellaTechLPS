/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gutei
 */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Consulta {
    Paciente pacienteDaConsulta;
    Medico medicoDaConsulta;
    String horarioDaConsulta;
    String motivoDaConsulta;
}
