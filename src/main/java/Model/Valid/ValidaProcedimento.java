/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Valid;

import Model.Medico;
import Model.exceptions.ProcedimentoException;
import Model.Procedimento;

/**
 *
 * @author gutei
 */
public class ValidaProcedimento {
    public Procedimento validaProcedimento(String nome, String descricao){
        Procedimento p = new Procedimento();
        if(nome.isEmpty()) throw new ProcedimentoException("Nome inválido");
        p.setNome(nome);
        if(descricao.isEmpty()) throw new ProcedimentoException("Descrição não informada");
        p.setDescricao(descricao);
        return p;
    }
}
