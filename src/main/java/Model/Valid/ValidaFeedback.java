/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.exceptions.FeedbackException;
import Model.Feedback;
import Model.Medico;
import Model.Paciente;
import Model.Procedimento;

/**
 *
 * @author gutei
 */
public class ValidaFeedback {
    public Feedback validaFeedback(String data, Procedimento procedimento, String avaliacao, String comentarios, Medico medico, Paciente paciente){
        Feedback novoFeedback = new Feedback();
        if(data.isEmpty()) throw new FeedbackException("Data inválida");
        novoFeedback.setData(data);
        if(procedimento.getId() == -1)throw new FeedbackException("Procedimento inválido");
        novoFeedback.setProcedimento(procedimento);
        if(avaliacao.isEmpty()) throw new FeedbackException("Avaliação inválida");
        novoFeedback.setAvaliacao(avaliacao);
        if(comentarios.isEmpty()) throw new FeedbackException("Comentários inválidos");
        novoFeedback.setComentarios(comentarios);
        if(medico == null) throw new FeedbackException("Médico inválido");
        novoFeedback.setMedico(medico);
        if(paciente == null) throw new FeedbackException("Paciente inválido");
        novoFeedback.setPaciente(paciente);
        return novoFeedback;
    }
}
