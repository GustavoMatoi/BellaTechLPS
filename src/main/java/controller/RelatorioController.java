/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.RelatorioDAO;
import Model.Paciente;
import Model.Relatorio;
import Model.Valid.ValidaRelatorio;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author gutei
 */
public class RelatorioController {
        private RelatorioDAO repositorio;
    
    public RelatorioController(){
        repositorio = new RelatorioDAO();
    }
    
    public boolean cadastrarRelatorio(Paciente paciente, String protocolo, String justificativa){
        ValidaRelatorio valida = new ValidaRelatorio();
        Relatorio novoRelatorio = valida.validaRelatorio(paciente, protocolo, justificativa);
        
        repositorio.save(novoRelatorio);
        return true;
    }
    
    public void atualizarRelatorio(Paciente paciente, String protocolo, String justificativa){
        ValidaRelatorio valida = new ValidaRelatorio();
        Relatorio novoRelatorio = valida.validaRelatorio(paciente, protocolo, justificativa);
        repositorio.update(novoRelatorio);        
    }
    
    public Relatorio buscarRelatorio(int id){
        return (Relatorio) this.repositorio.findById(id);
    }
    
    public void excluirRelatorio(int id){
        Object relatorio = (Relatorio) repositorio.findById(id);
        repositorio.delete(relatorio);
    }
    
    public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMRelatorio tableModel = new TMRelatorio(lst);
        grd.setModel(tableModel);
    }
    
    
}
