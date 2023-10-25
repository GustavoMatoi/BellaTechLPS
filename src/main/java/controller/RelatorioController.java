/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.RelatorioDAO;
import Model.Paciente;
import Model.Relatorio;
import Model.Valid.ValidaRelatorio;

/**
 *
 * @author gutei
 */
public class RelatorioController {
        private RelatorioDAO repositorio;
    
    public RelatorioController(){
        repositorio = new RelatorioDAO();
    }
    
    public boolean cadastrarRelatorio(Paciente paciente, String protocolo, String justificativa, String responsavel){
        ValidaRelatorio valida = new ValidaRelatorio();
        Relatorio novoRelatorio = valida.validaRelatorio(paciente, protocolo, justificativa, responsavel);
        
        repositorio.save(novoRelatorio);
        return true;
    }
    
    public void atualizarRelatorio(Paciente paciente, String protocolo, String justificativa, String responsavel){
        ValidaRelatorio valida = new ValidaRelatorio();
        Relatorio novoRelatorio = valida.validaRelatorio(paciente, protocolo, justificativa, responsavel);
        repositorio.update(novoRelatorio);        
    }
    
    public Relatorio buscarRelatorio(int id){
        return (Relatorio) this.repositorio.findById(id);
    }
    
    public void excluirRelatorio(int id){
        Object relatorio = (Relatorio) repositorio.findById(id);
        repositorio.delete(relatorio);
    }
    
  /*  public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMPaciente tableModel = new TMPaciente(lst);
        grd.setModel(tableModel);
    }*/
    
    
}
