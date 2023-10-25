/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Feedback;
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
public class FeedbackDAO implements IDAO{
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    //
    EntityManagerFactory factory;
    EntityManager entityManager;
    
    public FeedbackDAO(){
        factory = Persistence.createEntityManagerFactory("bellatech");
        entityManager = factory.createEntityManager();
    }
    
    @Override
    public void save(Object objeto) {
        Feedback feedback = (Feedback) objeto;
        try {
              Feedback feedbackManaged = entityManager.merge(feedback);
              entityManager.getTransaction().begin();
              entityManager.persist(feedbackManaged);
              entityManager.getTransaction().commit();
        } catch (Error e){
            System.out.println(e);
        } finally {
            entityManager.close();
            factory.close();
        } 
      /*  sql = "INSERT INTO" + 
                "Feedback(data, id_procedimento, avaliacao, comentarios)" + "VALUES(?,?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setString(1, feedback.getData());
            statement.setInt(2, feedback.getIdProcedimento());
            statement.setString(3, feedback.getAvaliacao());
            statement.setString(4, feedback.getComentarios());
            
            statement.execute();
            statement.close();
        } catch (SQLException ex) {
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }
    */
    }   

    @Override
    public void update(Object objeto) {
        Feedback feedback = (Feedback) objeto;
        
        sql = "UPDATE Feedback" + 
                "SET data=?, id_procedimento=?, avaliacao=?, comentarios=?" +
                "WHERE id=?";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            statement.setString(1, feedback.getData());
            statement.setInt(2, feedback.getId());
            statement.setString(3, feedback.getAvaliacao());
            statement.setString(4, feedback.getComentarios());
      
            statement.setInt(5, feedback.getId());
            
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
        Feedback feedback = (Feedback) objeto;
        
        sql = "SELECT * FROM Feedback WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, feedback.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Feedback f = null;
            
            while (resultSet.next()){
                f= new Feedback();
                f.setData(resultSet.getString(2));
                //f.setProcedimento(resultSet.getInt(3));
                f.setAvaliacao(resultSet.getString(4));
                f.setComentarios(resultSet.getString(5));
            }
            statement.close();
            return f;
        } catch (SQLException ex){
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public List<Object> findAll() {
        List <Object> list = new ArrayList<>();
        
        sql = "SELECT * FROM Feedback ORDER BY upper(id)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Feedback f = new Feedback();
                f.setData(resultSet.getString(2));
                //f.setProcedimento(resultSet.getInt(3));
                f.setAvaliacao(resultSet.getString(4));
                f.setComentarios(resultSet.getString(5));
                
                list.add(f);
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
        Feedback f = (Feedback) objeto;
        
        sql = "DELETE FROM Feedback WHERE id = ?";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, f.getId());
            
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
        sql = "SELECT * FROM Feedback as p WHERE e.id = ?";
        
        Feedback f = null;
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                f = new Feedback();
                f.setId(resultSet.getInt(1));
                f.setData(resultSet.getString(2));
                //f.setProcedimento(resultSet.getInt(3));
                f.setAvaliacao(resultSet.getString(4));
                f.setComentarios(resultSet.getString(5));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return f;
    }

}
