 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Persistencia;
import Model.Secretaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gutei
 */
public class SecretariaDAO implements IDAO {
    
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    
    
    EntityManagerFactory factory;
    EntityManager entityManager;
    
    public SecretariaDAO(){
        this.sql = "";
        factory = Persistence.createEntityManagerFactory("bellatech");
        entityManager = factory.createEntityManager();
    }
    
    @Override
    public void save(Object objeto) {
        Secretaria secretaria = new Secretaria();
        try {
              Secretaria secretariaManaged = entityManager.merge(secretaria);
              entityManager.getTransaction().begin();
              entityManager.persist(secretariaManaged);
              entityManager.getTransaction().commit();
        } catch (Error e){
            System.out.println(e);
        } finally {
            entityManager.close();
            factory.close();
        } 
        
        /*
        sql = "INSERT INTO" + 
                "Secretaria(nome, cpf, login, senha, dataNascimento, telefone, cargo, salario)" + "VALUES(?,?,?,?,?,?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, secretaria.getNome());
            statement.setString(2, secretaria.getCpf());
            statement.setString(3, secretaria.getLogin());
            statement.setString(4, secretaria.getSenha());
            statement.setString(5, secretaria.getDataNascimento());
            statement.setString(6, secretaria.getTelefone());
            statement.setString(7, secretaria.getCargo());
            statement.setFloat(8, secretaria.getSalario());
            
            statement.execute();
            statement.close();
        } catch (SQLException ex) {
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        } */
        
    }   

    @Override
    public void update(Object objeto) {
        Secretaria secretaria = (Secretaria) objeto;
        
        sql = "UPDATE Secretaria" + 
                "SET nome = ?, cpf = ?, login = ?, senha = ?, dataNascimento = ?, telefone = ?, cargo = ?, salario = ?" +
                "WHERE id=?";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, secretaria.getNome());
            statement.setString(2, secretaria.getCpf());
            statement.setString(3, secretaria.getLogin());
            statement.setString(4, secretaria.getSenha());
            statement.setString(5, secretaria.getDataNascimento());
            statement.setString(6, secretaria.getTelefone());
            statement.setString(7, secretaria.getCargo());
            statement.setFloat(8, secretaria.getSalario());
            
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
        Secretaria secretaria = (Secretaria) objeto;
        
        sql = "SELECT * FROM Secretaria WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, secretaria.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Secretaria m = null;
            
            while (resultSet.next()){
                m = new Secretaria();
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
    public List<Object> findAll() {
        List <Object> list = new ArrayList<>();
        
        sql = "SELECT * FROM Secretaria ORDER BY upper(id)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Secretaria m = new Secretaria();
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
        Secretaria m = (Secretaria) objeto;
        
        sql = "DELETE FROM Secretaria WHERE id = ?";
        
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
        sql = "SELECT * FROM Secretaria as m WHERE m.id = ?";
        
        Secretaria m = null;
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                m = new Secretaria();
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
