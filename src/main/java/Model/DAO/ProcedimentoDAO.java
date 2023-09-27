/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Medico;
import Model.Persistencia;
import Model.Procedimento;
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
public class ProcedimentoDAO implements IDAO {
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    
    public ProcedimentoDAO (){
        this.sql = "";
    }
    
    @Override
    public void save(Object objeto) {
        Procedimento procedimento = new Procedimento();
        Medico medico = new Medico();
        sql = "INSERT INTO" + 
                "Procedimento(nome, id_medico, descricao)" + "VALUES(?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, procedimento.getNome());
            statement.setInt(2, procedimento.getMedicoResponsavel().getId());
            statement.setString(3, procedimento.getDescricao());
            
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
        Procedimento procedimento = (Procedimento) objeto;
        
        sql = "UPDATE Procedimento" + 
                "SET nome=?, id_medico=?, descricao=?" +
                "WHERE id=?";
        
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, procedimento.getNome());
            statement.setInt(2, procedimento.getMedicoResponsavel().getId());
            statement.setString(3, procedimento.getDescricao());
      
            statement.setInt(5, procedimento.getId());
            
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
        Procedimento procedimento = (Procedimento) objeto;
        
        sql = "SELECT * FROM Procedimento WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, procedimento.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Procedimento p = null;
            Medico m = null;
            while (resultSet.next()){
                p = new Procedimento();
                m = new Medico();
                p.setNome(resultSet.getString(2));
                m.setId(resultSet.getInt(3));
                p.setMedicoResponsavel(m);
                p.setDescricao(resultSet.getString(1));
            }
            statement.close();
            return p;
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
                Procedimento p = new Procedimento();
                Medico m = new Medico();
                p.setNome(resultSet.getString(1));
                m.setId(resultSet.getInt(2));
                p.setMedicoResponsavel(m);
                p.setDescricao(resultSet.getString(3));
                               
                list.add(p);
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
        Procedimento procedimento = (Procedimento) objeto;
        
        sql = "DELETE FROM Procedimento WHERE id = ?";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, procedimento.getId());
            
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
        sql = "SELECT * FROM Procedimento as p WHERE p.id = ?";
        
        Procedimento p = null;
        Medico m = null;
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                p = new Procedimento();
                m = new Medico();
                p.setId(resultSet.getInt(1));
                p.setNome(resultSet.getString(2));
                m.setId(resultSet.getInt(3));
                p.setMedicoResponsavel(m);
                p.setDescricao(resultSet.getString(4));

            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return p;
    }

}
