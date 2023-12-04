/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Pagamento;
import Model.Relatorio;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gutei
 */
public class TMPagamento extends AbstractTableModel {
    private List<Pagamento> lst;
    private final int COL_ID = 0;
    private final int COL_DATA = 1;
    private final int COL_PAGADOR = 2;
    private final int COL_RECEBEDOR = 3;
    private final int COL_VALOR = 4;

    public TMPagamento(List<Pagamento> lista){
        this.lst = lista;
    }

    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pagamento p = this.lst.get(rowIndex);
        
        if(columnIndex  == COL_ID){
            return p.getId();
        } else if (columnIndex == COL_DATA){
            return p.getData();
        } else if (columnIndex == COL_PAGADOR){
            return p.getPagador();
        } else if (columnIndex == COL_RECEBEDOR){
            return p.getRecebedor();
        } else if (columnIndex == COL_VALOR){
            return p.getValor();
        }
        return "-";
    }
    
    
    @Override 
    public String getColumnName(int columnIndex){

        if(columnIndex  == COL_ID){
            return "Id";
        } else if (columnIndex == COL_DATA){
            return "Data";
        } else if (columnIndex == COL_PAGADOR){
            return "Pagador";
        } else if (columnIndex == COL_RECEBEDOR){
            return "Recebedor";
        } else if (columnIndex == COL_VALOR){
            return "Valor";
        }
        return "-";
      } 
}
