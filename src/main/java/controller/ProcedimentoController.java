/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.ProcedimentoDAO;
import Model.Medico;
import Model.Procedimento;
import Model.Valid.ValidaProcedimento;
import Model.exceptions.ProcedimentoException;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author gutei
 */
public class ProcedimentoController {
        private ProcedimentoDAO repositorio;
    
    public ProcedimentoController (){
        this.repositorio = new ProcedimentoDAO();
    }

    public void cadastrarProcedimento(String nome, String dataHora, Medico medico, String descricao){
        ValidaProcedimento valida = new ValidaProcedimento();
        Procedimento novoProcedimento = valida.validaProcedimento(nome,dataHora, medico.getNome(), descricao);
        repositorio.save(novoProcedimento);
    }
    public void atualizarProcedimento(String nome, String dataHora, Medico medico, String descricao){
        ValidaProcedimento valida = new ValidaProcedimento();
        Procedimento novoProcedimento = valida.validaProcedimento(nome,dataHora, medico.getNome(), descricao);
        repositorio.update(novoProcedimento);
    }
    
    public Procedimento buscarConsulta(int id){
        return (Procedimento) this.repositorio.findById(id);
    }
    
    public void excluirConsulta(int id){
        Object procedimento = (Procedimento) repositorio.findById(id);
        
        if(procedimento != null){
            repositorio.delete(procedimento);
        } else {
            throw new ProcedimentoException("Erro - Procedimento inexistente");
        }
    }
    
    public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMProcedimento tableModel = new TMProcedimento(lst);
        grd.setModel(tableModel);
    }
}
