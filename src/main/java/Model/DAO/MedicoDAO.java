/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Medico;
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
public class MedicoDAO implements IDAO {

    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    
    public MedicoDAO(){
        this.sql = "";
    }
    
    @Override
    public void save(Object objeto) {
        Medico medico = new Medico();
        
        sql = "INSERT INTO" + 
                "Medico(nome, cpf, login, senha, dataNascimento, telefone, cargo, salario)" + "VALUES(?,?,?,?,?,?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, medico.getNome());
            statement.setString(2, medico.getCpf());
            statement.setString(3, medico.getLogin());
            statement.setString(4, medico.getSenha());
            statement.setString(5, medico.getDataNascimento());
            statement.setString(6, medico.getTelefone());
            statement.setString(7, medico.getCargo());
            statement.setFloat(8, medico.getSalario());
            
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
        Medico medico = (Medico) objeto;
        
        sql = "UPDATE Medico" + 
                "SET nome = ?, cpf = ?, login = ?, senha = ?, dataNascimento = ?, telefone = ?, cargo = ?, salario = ?" +
                "WHERE id=?";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, medico.getNome());
            statement.setString(2, medico.getCpf());
            statement.setString(3, medico.getLogin());
            statement.setString(4, medico.getSenha());
            statement.setString(5, medico.getDataNascimento());
            statement.setString(6, medico.getTelefone());
            statement.setString(7, medico.getCargo());
            statement.setFloat(8, medico.getSalario());
            
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
        Medico medico = (Medico) objeto;
        
        sql = "SELECT * FROM Medico WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, medico.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Medico m = null;
            
            while (resultSet.next()){
                m = new Medico();
                m.setNome(resultSet.getString(2));
                m.setCpf(resultSet.getString(3));
                m.setLogin(resultSet.getString(4));
                m.setSenha(resultSet.getString(5));
                m.setDataNascimento(resultSet.getString(6));
                m.setTelefone(resultSet.getString(7));
                m.setCargo(resultSet.getString(8));
                m.setSalario(resultSet.getFloat(9));

            }
            statement.close();
            return m;
        } catch (SQLException ex){
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public List<Object> findAll(Object objeto) {
        List <Object> list = new ArrayList<>();
        
        sql = "SELECT * FROM Medico ORDER BY upper(id)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Medico m = new Medico();
                m.setNome(resultSet.getString(2));
                m.setCpf(resultSet.getString(3));
                m.setLogin(resultSet.getString(4));
                m.setSenha(resultSet.getString(5));
                m.setDataNascimento(resultSet.getString(6));
                m.setTelefone(resultSet.getString(7));
                m.setCargo(resultSet.getString(8));
                m.setSalario(resultSet.getFloat(9));
                list.add(m);
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
        Medico m = (Medico) objeto;
        
        sql = "DELETE FROM Feedback WHERE id = ?";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, m.getId());
            
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
        sql = "SELECT * FROM Medico as m WHERE m.id = ?";
        
        Medico m = null;
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                m = new Medico();
                m.setNome(resultSet.getString(2));
                m.setCpf(resultSet.getString(3));
                m.setLogin(resultSet.getString(4));
                m.setSenha(resultSet.getString(5));
                m.setDataNascimento(resultSet.getString(6));
                m.setTelefone(resultSet.getString(7));
                m.setCargo(resultSet.getString(8));
                m.setSalario(resultSet.getFloat(9));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return m;
    }

    
}
