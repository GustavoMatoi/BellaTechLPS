/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Consulta;
import Model.DAO.ConsultaDAO;
import Model.Paciente;
import Model.Medico;
import Model.Valid.ValidaConsulta;
import Model.exceptions.ConsultaException;
import java.util.List;
import javax.swing.JTable;
import Model.Procedimento;
/**
 *
 * @author gutei
 */
public class ConsultaController {
    private ConsultaDAO repositorio;
    
    public ConsultaController (){
        this.repositorio = new ConsultaDAO();
    }

    public void cadastrarConsulta(int id, Paciente p, Medico m, String horario, String motivo, Procedimento procedimento){
        ValidaConsulta valida = new ValidaConsulta();
        Consulta novaConsulta = valida.validaConsulta(p, m, horario, motivo, procedimento );
        if(repositorio.findById(id) == null){ 
            repositorio.save(novaConsulta);
        } else {
            throw new ConsultaException("Error - Já existe esse endereço");
        }
    }
    public void atualizarConsulta(Paciente p, Medico m, String horario, String motivo, Procedimento procedimento){
        ValidaConsulta valid = new ValidaConsulta();
        Consulta novaConsulta = valid.validaConsulta(p, m, horario, motivo, procedimento);
        
        repositorio.update(novaConsulta);
    }
    
    public Consulta buscarConsulta(int id){
        return (Consulta) this.repositorio.findById(id);
    }
    
    public void excluirConsulta(int id){
        Object consulta = (Consulta) repositorio.findById(id);
        
        if(consulta != null){
            repositorio.delete(consulta);
        } else {
            throw new ConsultaException("Erro - Endereço inexistente");
        }
    }
    public void atualizarTabela(JTable grd){
        List lst = repositorio.findAll();
        TMAgenda tableModel = new TMAgenda(lst);
        grd.setModel(tableModel);
    }
}
