/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Feedback;
import Model.Pagamento;
import Model.Persistencia;
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
public class PagamentoDAO implements IDAO {
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    //
    
    EntityManagerFactory factory;
    EntityManager entityManager;
    public PagamentoDAO (){
        //this.sql = "";
        factory = Persistence.createEntityManagerFactory("bellatech");
        entityManager = factory.createEntityManager();
    }
    
    @Override
    public void save(Object objeto) {
        Pagamento pagamento = new Pagamento();
        try {
              Pagamento pagamentoManaged = entityManager.merge(pagamento);
              entityManager.getTransaction().begin();
              entityManager.persist(pagamentoManaged);
              entityManager.getTransaction().commit();
        } catch (Error e){
            System.out.println(e);
        } finally {
            entityManager.close();
            factory.close();
        } 
        
        /*
        sql = "INSERT INTO" + 
                "Pagamento(valor, metodo, data, comentarios)" + "VALUES(?,?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setFloat(1, pagamento.getValor());
            statement.setString(2, pagamento.getMetodo());
            statement.setString(3, pagamento.getData());
            statement.setString(4, pagamento.getComentarios());
            
            statement.execute();
            statement.close();
        } catch (SQLException ex) {
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }*/
    
    }   

    @Override
    public void update(Object objeto) {
        Pagamento pagamento = (Pagamento) objeto;
        
        sql = "UPDATE Pagamento" + 
                "SET valor=?, metodo=?, data=?, comentarios=?" +
                "WHERE id=?";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            statement.setFloat(1, pagamento.getValor());
            statement.setString(2, pagamento.getMetodo());
            statement.setString(3, pagamento.getData());
            statement.setString(4, pagamento.getComentarios());
            statement.setInt(5, pagamento.getId());
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
        Pagamento pagamento = (Pagamento) objeto;
        
        sql = "SELECT * FROM Pagamento WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, pagamento.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Pagamento p = null;
            
            while (resultSet.next()){
                p= new Pagamento();
                p.setValor(resultSet.getFloat(2));
                p.setMetodo(resultSet.getString(3));
                p.setData(resultSet.getString(4));
                p.setComentarios(resultSet.getString(5));
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
    public List<Object> findAll() {
        List <Object> list = new ArrayList<>();
        
        sql = "SELECT * FROM Pagamento ORDER BY upper(id)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Pagamento p= new Pagamento();
                p.setValor(resultSet.getFloat(2));
                p.setMetodo(resultSet.getString(3));
                p.setData(resultSet.getString(4));
                p.setComentarios(resultSet.getString(5));
                
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
        Pagamento p = (Pagamento) objeto;
        
        sql = "DELETE FROM Pagamento WHERE id = ?";
        
        try {
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
        sql = "SELECT * FROM Pagamento as p WHERE p.id = ?";
        
        Pagamento p = null;
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                p = new Pagamento();
                p.setValor(resultSet.getFloat(2));
                p.setMetodo(resultSet.getString(3));
                p.setData(resultSet.getString(4));
                p.setComentarios(resultSet.getString(5));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return p;
    }

}
