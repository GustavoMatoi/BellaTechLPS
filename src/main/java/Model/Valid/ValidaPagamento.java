/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.exceptions.PagamentoException;
import Model.Pagamento;

/**
 *
 * @author gutei
 */
public class ValidaPagamento {
    public Pagamento validaPagamento(float valor, String metodo, String data, String comentarios){
        Pagamento p = new Pagamento();
        if(valor == 0) throw new PagamentoException("Valor inválido");
        p.setValor(valor);
        if(metodo.isEmpty()) throw new PagamentoException("Metodo inválido");
        p.setMetodo(metodo);
        if(data.isEmpty()) throw new PagamentoException("Data inválida");
        p.setData(data);
        if(comentarios.isEmpty()) throw new PagamentoException("Comentário inválido");
        p.setComentarios(comentarios);
        return p;
    }
}
