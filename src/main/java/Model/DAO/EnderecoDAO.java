/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Endereco;
import Model.Persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gutei
 */
public class EnderecoDAO implements IDAO {
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    
    public EnderecoDAO(){
        this.sql = "";
    }
    
    @Override
    public void save(Object objeto) {
        Endereco endereco = new Endereco();
        
        sql = "INSERT INTO" + 
                "Endereco(estado, cidade, bairro, rua, numero)" + "VALUES(?,?,?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, endereco.getId());
            statement.setString(2, endereco.getEstado());
            statement.setString(3, endereco.getCidade());
            statement.setString(4, endereco.getRua());
            statement.setString(5, endereco.getNumero());
            
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
        Endereco endereco = (Endereco) objeto;
        
        sql = "UPDATE Endereco" + 
                "SET estado=?, cidade=?, rua=?, numero=?" +
                "WHERE id=?";
        
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, endereco.getEstado());
            statement.setString(2, endereco.getCidade());
            statement.setString(3, endereco.getRua());
            statement.setString(4, endereco.getNumero());
      
            statement.setInt(5, endereco.getId());
            
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
        Endereco endereco = (Endereco) objeto;
        
        sql = "SELECT * FROM Endereco WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, endereco.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Endereco e = null;
            
            while (resultSet.next()){
                e = new Endereco();
                e.setEstado(resultSet.getString(2));
                e.setCidade(resultSet.getString(3));
                e.setRua(resultSet.getString(4));
                e.setNumero(resultSet.getString(5));
            }
            statement.close();
            return e;
        } catch (SQLException ex){
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public List<Object> findAll(Object objeto) {
        List <Object> list = new ArrayList<>();
        
        sql = "SELECT * FROM Endereco ORDER BY upper(estado)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Endereco e = new Endereco();
                e.setEstado(resultSet.getString(2));
                e.setCidade(resultSet.getString(3));
                e.setRua(resultSet.getString(4));
                e.setNumero(resultSet.getString(5));
                
                list.add(e);
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
        Endereco e = (Endereco) objeto;
        
        sql = "DELETE FROM Endereco WHERE id = ?";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, e.getId());
            
            statement.execute();
            statement.close();
            return true;    
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    public Object findByRuaNumero(String rua, String numero) {
        sql = "SELECT * FROM Endereco as end WHERE end.id = ?";
        
        Endereco e = null;
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            statement.setString(1, e.getRua());
            statement.setString(2, e.getNumero());

            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                e = new Endereco();
                e.setId(resultSet.getInt(1));
                e.setEstado(resultSet.getString(2));
                e.setCidade(resultSet.getString(3));
                e.setRua(resultSet.getString(4));
                e.setNumero(resultSet.getString(5));
            }
            
            statement.close();
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return e;
    }

    @Override
    public Object findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
