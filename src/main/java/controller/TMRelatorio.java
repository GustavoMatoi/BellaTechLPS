/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Procedimento;
import Model.Relatorio;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gutei
 */
public class TMRelatorio extends AbstractTableModel{
        private List<Relatorio> lst;
    private final int COL_ID = 0;
    private final int COL_PACIENTE = 1;
    private final int COL_PROTOCOLO = 2;
    private final int COL_JUSTIFICATIVA = 3;

    public TMRelatorio(List<Relatorio> lista){
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
        Relatorio r = this.lst.get(rowIndex);
        
        if(columnIndex  == COL_ID){
            return r.getId();
        } else if (columnIndex == COL_PACIENTE){
            return r.getPaciente().getNome();
        } else if (columnIndex == COL_PROTOCOLO){
            return r.getProtocolo();
        } else if (columnIndex == COL_JUSTIFICATIVA){
            return r.getJustificativa();
        }
        return "-";
    }
    
    
    @Override 
    public String getColumnName(int columnIndex){

        if(columnIndex  == COL_ID){
            return "Id";
        } else if (columnIndex == COL_PACIENTE){
            return "Paciente";
        } else if (columnIndex == COL_PROTOCOLO){
            return "Protocolo";
        } else if (columnIndex == COL_JUSTIFICATIVA){
            return "Justificativa";
        }
        return "-";
      }
}
