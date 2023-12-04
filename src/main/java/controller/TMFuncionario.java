/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Paciente;
import Model.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gutei
 */
public class TMFuncionario extends AbstractTableModel{
       
    private List<Usuario> lst;
    private final int COL_ID = 0;
    private final int COL_CARGO = 1;
    private final int COL_CPF = 2;
    private final int COL_DATANASCIMENTO = 3;
    private final int COL_NOME = 4;
    private final int COL_TELEFONE = 5;
    private final int COL_SALARIO = 6;
    public TMFuncionario(List<Usuario> lista){
        this.lst = lista;
    }

    @Override
    public int getRowCount() {
        return this.lst.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario u = this.lst.get(rowIndex);
        
        if(columnIndex  == COL_ID){
            return u.getId();
        } else if (columnIndex == COL_CARGO){
            return u.getCargo();
        } else if (columnIndex == COL_CPF){
            return u.getCpf();
        } else if (columnIndex == COL_DATANASCIMENTO){
            return u.getDataNascimento();
        } else if (columnIndex == COL_NOME){
            return u.getNome();
        }else if (columnIndex == COL_TELEFONE){
            return u.getTelefone();
        }else if (columnIndex == COL_SALARIO){
            return u.getSalario();
        }
        return "-";
    }
    
    
    @Override 
    public String getColumnName(int columnIndex){
        if(columnIndex  == COL_ID){
            return "Id";
        } else if (columnIndex == COL_CARGO){
            return "Cargo";
        } else if (columnIndex == COL_CPF){
            return "CPF";
        } else if (columnIndex == COL_DATANASCIMENTO){
            return "Data Nascimento";
        } else if (columnIndex == COL_NOME){
            return "Nome";
        }else if (columnIndex == COL_TELEFONE){
            return "Telefone";
        }else if (columnIndex == COL_SALARIO){
            return "Salário";
        }
        return "-";
      }
}
