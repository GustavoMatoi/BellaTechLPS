/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Medico;
import Model.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gutei
 */
public class TMMEdico extends AbstractTableModel {
    
    private List<Medico> lst;
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_CPF = 2;
    private final int COL_TELEFONE = 3;
    
    public TMMEdico(List<Medico> lista){
        this.lst = lista;
    }

    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medico m = this.lst.get(rowIndex);
        
        if(columnIndex  == COL_ID){
            return m.getId();
        } else if (columnIndex == COL_NOME){
            return m.getNome();
        } else if (columnIndex == COL_CPF){
            return m.getCpf();
        } else if (columnIndex == COL_TELEFONE){
            return m.getTelefone();
        }
        return "-";
    }
    
    
    @Override 
    public String getColumnName(int columnIndex){
        if(columnIndex == COL_ID){
            return "Id";
        } else if (columnIndex == COL_NOME){
            return "Nome";
        } else if (columnIndex == COL_CPF){
            return "CPF";
        } else if (columnIndex == COL_TELEFONE){
            return "Telefone";
        }
        return "-";
      }
}