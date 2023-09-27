/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.exceptions.FeedbackException;
import Model.Feedback;
import Model.Procedimento;

/**
 *
 * @author gutei
 */
public class ValidaFeedback {
    public Feedback validaFeedback(String data, Procedimento procedimento, String avaliacao, String comentarios){
        Feedback novoFeedback = new Feedback();
        if(data.isEmpty()) throw new FeedbackException("Data inválida");
        novoFeedback.setData(data);
        if(procedimento.getId() == -1)throw new FeedbackException("Procedimento inválido");
        novoFeedback.setIdProcedimento(procedimento.getId());
        if(avaliacao.isEmpty()) throw new FeedbackException("Avaliação inválida");
        novoFeedback.setAvaliacao(avaliacao);
        if(comentarios.isEmpty()) throw new FeedbackException("Comentários inválidos");
        novoFeedback.setComentarios(comentarios);
        return novoFeedback;
    }
}
