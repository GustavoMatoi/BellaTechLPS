/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Feedback;
import Model.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gutei
 */
public class TMFeedback extends AbstractTableModel {
    private List<Feedback> lst;
    private final int COL_ID = 0;
    private final int COL_AVALIACAO = 1;
    private final int COL_DATA = 2;
    private final int COL_MEDICOID = 3;
    private final int COL_PACIENTEID = 4;
    private final int COL_PROCEDIMENTOID = 5;
    public TMFeedback(List<Feedback> lista){
        this.lst = lista;
    }

    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Feedback p = this.lst.get(rowIndex);
        
        if(columnIndex  == COL_ID){
            return p.getId();
        } else if (columnIndex == COL_AVALIACAO){
            return p.getAvaliacao();
        } else if (columnIndex == COL_DATA){
            return p.getData();
        } else if (columnIndex == COL_MEDICOID){
            return p.getMedico().getNome();
        } else if (columnIndex == COL_PACIENTEID){
            return p.getPaciente().getNome();
        } else if (columnIndex == COL_PROCEDIMENTOID){
            return p.getProcedimento().getNome();
        }
        return "-";
    }
    
    
    @Override 
    public String getColumnName(int columnIndex){
        if(columnIndex == COL_ID){
            return "Id";
        } else if (columnIndex == COL_AVALIACAO){
            return "Avaliação";
        } else if (columnIndex == COL_DATA){
            return "Data";
        } else if (columnIndex == COL_MEDICOID){
            return "Médico";
        } else if (columnIndex == COL_PACIENTEID){
            return "Paciente";
        } else if (columnIndex == COL_PROCEDIMENTOID){
            return "Procedimento";
        }
        return "-";
      }
}
