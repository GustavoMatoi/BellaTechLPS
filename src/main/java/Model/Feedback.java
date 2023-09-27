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
public class Feedback {
    private int id;
    private String data;
    private int idProcedimento;
    private String avaliacao;
    private String comentarios;
}
