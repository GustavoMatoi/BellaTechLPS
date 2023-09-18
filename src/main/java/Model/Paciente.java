/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gutei
 */
import java.awt.List;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter 
public class Paciente {
    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;
    private List listaProcedimentos;
    private int enderecoId;
}
