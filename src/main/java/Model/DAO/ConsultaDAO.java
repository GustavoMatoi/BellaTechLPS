/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Consulta;
import Model.Medico;
import Model.Paciente;
import Model.Persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gutei
 */

public class ConsultaDAO implements IDAO{
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    
    public ConsultaDAO(){
        this.sql = "";
    }
    
    @Override
    public void save(Object objeto) {
        Consulta consulta = new Consulta();
        
        sql = "INSERT INTO" + 
                "Consulta(id_paciente, id_medico, horario, motivo)" + "VALUES(?,?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, consulta.getPacienteDaConsulta().getId());
            statement.setInt(2, consulta.getMedicoDaConsulta().getId());
            statement.setString(3, consulta.getHorarioDaConsulta());
            statement.setString(4, consulta.getMotivoDaConsulta());
            
            statement.execute();
            statement.close();
        } catch (SQLException ex) {
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }
    
    }   

    @Override
    public void update(Object objeto) {
        Consulta consulta = (Consulta) objeto;
        
        sql = "UPDATE Consulta" + 
                "SET id_paciente=?, id_medico=?, horario=?, motivo=?" +
                "WHERE id=?";
        
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, consulta.getPacienteDaConsulta().getId());
            statement.setInt(2, consulta.getMedicoDaConsulta().getId());
            statement.setString(3, consulta.getHorarioDaConsulta());
            statement.setString(4, consulta.getMotivoDaConsulta());
      
            statement.setInt(5, consulta.getId());
            
            statement.execute();
            statement.close();
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public Object find(Object objeto) {
        Consulta consulta = (Consulta) objeto;
        
        sql = "SELECT * FROM Consulta WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, consulta.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Consulta c = null;
            Paciente p = null;
            Medico m = null;
            while (resultSet.next()){
                p = new Paciente();
                c = new Consulta();
                m = new Medico();
                p.setId(resultSet.getInt(2));
                c.setPacienteDaConsulta(p);
                m.setId(resultSet.getInt(3));
                c.setMedicoDaConsulta(m);
                c.setHorarioDaConsulta(resultSet.getString(4));
                c.setMotivoDaConsulta(resultSet.getString(5));
            }
            statement.close();
            return c;
        } catch (SQLException ex){
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public List<Object> findAll(Object objeto) {
        List <Object> list = new ArrayList<>();
        
        sql = "SELECT * FROM Consulta ORDER BY upper(id)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Consulta c = new Consulta();
                Medico m = new Medico();
                Paciente p = new Paciente();
                p.setId(resultSet.getInt(2));
                c.setPacienteDaConsulta(p);
                m.setId(resultSet.getInt(3));
                c.setMedicoDaConsulta(m);
                c.setHorarioDaConsulta(resultSet.getString(4));
                c.setMotivoDaConsulta(resultSet.getString(5));
                c.setId(resultSet.getInt(1));
                
                list.add(c);
            }
            statement.close();
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally{
            Persistencia.closeConnection();
        }
        return list;
       }

    @Override
    public boolean delete(Object objeto) {
        Consulta c = (Consulta) objeto;
        
        sql = "DELETE FROM Consulta WHERE id = ?";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, c.getId());
            
            statement.execute();
            statement.close();
            return true;    
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public Object findById(int id) {
        sql = "SELECT * FROM Consulta as c WHERE c.id = ?";
        
        Consulta c = null;
        Paciente p = null;
        Medico m = null;
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                c = new Consulta();
                p = new Paciente();
                m = new Medico();
                c.setId(resultSet.getInt(1));
                p.setId(resultSet.getInt(2));
                c.setPacienteDaConsulta(p);
                m.setId(resultSet.getInt(3));
                c.setMedicoDaConsulta(m);
                c.setHorarioDaConsulta(resultSet.getString(4));
                c.setMotivoDaConsulta(resultSet.getString(5));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return c;
    }

    
}
