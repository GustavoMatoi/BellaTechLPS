/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Paciente;
import Model.Procedimento;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gutei
 */
public class TMProcedimento extends AbstractTableModel{
    
    private List<Procedimento> lst;
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_DESCRICAO = 2;

    public TMProcedimento(List<Procedimento> lista){
        this.lst = lista;
    }

    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Procedimento p = this.lst.get(rowIndex);
        
        if(columnIndex  == COL_ID){
            return p.getId();
        } else if (columnIndex == COL_NOME){
            return p.getNome();
        } else if (columnIndex == COL_DESCRICAO){
            return p.getDescricao();
        }
        return "-";
    }
    
    
    @Override 
    public String getColumnName(int columnIndex){

        if(columnIndex  == COL_ID){
            return "Id";
        } else if (columnIndex == COL_NOME){
            return "Nome";
        } else if (columnIndex == COL_DESCRICAO){
            return "Descrição";
        }
        return "-";
      }
}
