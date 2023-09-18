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

public class Usuario {
    private String id;
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private String cargo;
    private float salario;
}
