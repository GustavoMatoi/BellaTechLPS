/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Endereco;
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
public class PacienteDAO implements IDAO {
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    
    public PacienteDAO(){
        this.sql = "";
    }
    @Override
    public void save(Object objeto) {
        Paciente paciente = (Paciente) objeto;
        
        sql = "INSERT INTO" + " Paciente(id, nome, dataNascimento, cpf, telefone, endereco_id)" + "VALUES(?,?,?,?,?)";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
        
            statement.setInt(1, paciente.getId());
            statement.setString(2, paciente.getNome());
            statement.setString(3, paciente.getDataNascimento());
            statement.setString(4, paciente.getCpf());
            statement.setString(5, paciente.getTelefone());
            statement.setInt(6, paciente.getEnderecoId());

            statement.execute();
            statement.close();
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }

    }

    @Override
    public void update(Object objeto) {
        Paciente paciente = (Paciente) objeto;
        
        sql = "UPDATE Paciente" + 
                "SET nome=?, dataNascimento=?, cpf=?, telefone=?" + "WHERE id=?";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, paciente.getNome());
            statement.setString(2, paciente.getDataNascimento());
            statement.setString(3, paciente.getCpf());
            statement.setString(4, paciente.getTelefone());
            
            statement.execute();
            statement.close();
        } catch(SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }

    }

    @Override
    public Object find(Object objeto) {
        Paciente paciente = (Paciente) objeto;
        
        sql = "SELECT * FROM Paciente WHERE id = ?";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, paciente.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Paciente p = null;
            
            
            while (resultSet.next()){
                p = new Paciente();
                p.setNome(resultSet.getString(2));
                p.setDataNascimento(resultSet.getString(3));
                p.setCpf(resultSet.getString(4));
                p.setTelefone(resultSet.getString(5));
            }
            
            statement.close();
            return p;
            
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public List<Object> findAll(Object objeto) {
        List <Object> list  = new ArrayList<>();
        
        sql = "SELECT * FROM Paciente ORDER BY upper(id)";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                Paciente p = new Paciente();
                p.setId(resultSet.getInt(1));
                p.setNome(resultSet.getString(2));
                p.setDataNascimento(resultSet.getString(3));
                p.setCpf(resultSet.getString(4));
                p.setTelefone(resultSet.getString(5));
           
                list.add(p);
            } 
            statement.close();
            } catch (SQLException ex){
                throw new RuntimeException(ex);
            } finally {
                Persistencia.closeConnection();
        }
        return list;
       }
    

    @Override
    public boolean delete(Object objeto) {
       Paciente p = (Paciente) objeto;
       
       sql = "DELETE FROM Paciente WHERE id = ?";
       
       try{
           conexao = Persistencia.getConnection();
           statement = conexao.prepareStatement(sql);
           
           statement.setInt(1, p.getId());
           
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
        sql = "SELECT * FROM Paciente as p WHERE p.id = ?";
        
        Paciente p = null;
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                p = new Paciente();
                p.setId(resultSet.getInt(1));
                p.setNome(resultSet.getString(2));
                p.setDataNascimento(resultSet.getString(3));
                p.setCpf(resultSet.getString(4));
                p.setTelefone(resultSet.getString(5));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return p;
    }
    
    public Endereco buscaTelefone(int pacienteId){
        Endereco e = null;
        sql = "SELECT * FROM Telefonte WHERE PacienteId = ?";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            statement.setInt(1, pacienteId);
            ResultSet resultSet = statement.executeQuery();
            e.setId(resultSet.getInt(1));
            e.setEstado(resultSet.getString(2));
            e.setCidade(resultSet.getString(3));
            e.setRua(resultSet.getString(4));
            e.setNumero(resultSet.getString(5));
            
           statement.execute();
           statement.close();
           
       } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return e;
    }
    
}
