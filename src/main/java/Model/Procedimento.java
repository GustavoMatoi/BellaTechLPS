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
public class Procedimento {
    private int id;
    private String nome;
    private String dataHora;
    private Medico medicoResponsavel;
    private String descricao;
   
}
