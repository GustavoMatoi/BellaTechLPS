/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author gutei
 */
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter 
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;

@OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
private Endereco endereco;

    @OneToMany(mappedBy = "paciente",cascade = CascadeType.ALL)
    List<Consulta> consulta;
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Pagamento> pagamentos;
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;
}
