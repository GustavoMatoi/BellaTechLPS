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
public class Endereco {

    private int id;
    private String estado;
    private String cidade;
    private String rua;
    private String numero;
    
    public void teste(){
        System.out.println("Combinando lonbok com método tradicional");
    }
}
