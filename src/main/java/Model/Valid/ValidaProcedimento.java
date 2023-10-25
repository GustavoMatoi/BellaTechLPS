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
    public Procedimento validaProcedimento(String nome, String dataHora, String medicoResponsavel, String descricao){
        Procedimento p = new Procedimento();
        if(nome.isEmpty()) throw new ProcedimentoException("Nome inválido");
        p.setNome(nome);
        if(medicoResponsavel.isEmpty()) throw new ProcedimentoException("Médico não informado");
        Medico m = new Medico();
        m.setNome(medicoResponsavel);
        p.setMedicoResponsavel(m);
        if(dataHora.isEmpty()) throw new ProcedimentoException("Data e hora não preenchidos");
        p.setDataHora(dataHora);
        if(descricao.isEmpty()) throw new ProcedimentoException("Descrição não informada");
        p.setDescricao(descricao);
        return p;
    }
}
