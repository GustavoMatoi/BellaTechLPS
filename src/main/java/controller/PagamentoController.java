/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.PagamentoDAO;
import Model.Pagamento;
import Model.Valid.ValidaPagamento;
import Model.exceptions.PagamentoException;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author gutei
 */
public class PagamentoController {
    private PagamentoDAO repositorio;
    
    public PagamentoController(){
        this.repositorio = new PagamentoDAO();
    }

    public void cadastrarPagamento(int id, float valor, String metodo, String data, String recebedor, String pagador){
        ValidaPagamento valid = new ValidaPagamento();
        Pagamento novoPagamento = valid.validaPagamento( id,  valor,  metodo, data, recebedor, pagador);
        
        if(repositorio.findById(id) == null){ 
            repositorio.save(novoPagamento);
        } else {
            throw new PagamentoException("Error - Já existe esse endereço");
        }
    }
    
    public void atualizarPagamento(int id, float valor, String metodo, String data, String recebedor, String pagador){
        ValidaPagamento valid = new ValidaPagamento();
        Pagamento novoPagamento = valid.validaPagamento( id,  valor,  metodo, data, recebedor, pagador);
        
        repositorio.update(novoPagamento);
    }
    
    public Pagamento buscarPagamento(int id){
        return (Pagamento) this.repositorio.findById(id);
    }
    
    public void excluirPagamento(int id){
        Object pagamento = (Pagamento) repositorio.findById(id);
        
        if(pagamento != null){
            repositorio.delete(pagamento);
        } else {
            throw new PagamentoException("Erro - Endereço inexistente");
        }
    }
    
       public void atualizarTabela(JTable grd, String recebedor){
        List lst = repositorio.findAllByPagamento(recebedor);
        TMPagamento tableModel = new TMPagamento(lst);
        grd.setModel(tableModel);
    }
}
