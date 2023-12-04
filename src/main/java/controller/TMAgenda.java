/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Consulta;
import Model.Paciente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gutei
 */
public class TMAgenda extends AbstractTableModel{
    
    private List<Consulta> lst;
    private final int COL_ID = 0;
    private final int COL_PACIENTE = 1;
    private final int COL_MEDICO = 2;
    private final int COL_MOTIVO = 3;
    private final int COL_DATA = 4;
    private final int COL_PROCEDIMENTO = 5;
    
    public TMAgenda(List<Consulta> lista){
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
        Consulta c = this.lst.get(rowIndex);
        
        if(columnIndex  == COL_PACIENTE){
            return c.getPaciente().getNome();
        } else if (columnIndex == COL_MEDICO){
            return c.getIdMedico();
        } else if (columnIndex == COL_MOTIVO){
            return c.getMotivoDaConsulta();
        } else if (columnIndex == COL_DATA){
            return c.getHorarioDaConsulta();
        } else if (columnIndex == COL_PROCEDIMENTO){
            return c.getProcedimento().getNome();
        } else if (columnIndex == COL_ID){
            return c.getId();
        }
        return "-";
    }
    
    
    @Override 
    public String getColumnName(int columnIndex){
        if(columnIndex == COL_PACIENTE){
            return "Paciente";
        } else if (columnIndex == COL_MEDICO){
            return "Medico";
        } else if (columnIndex == COL_MOTIVO){
            return "Motivo";
        } else if (columnIndex == COL_DATA){
            return "Data";
        } else if (columnIndex == COL_PROCEDIMENTO){
            return "Procedimento";
        } else if (columnIndex == COL_ID){
            return "ID";
        }
        return "-";
      }
}
