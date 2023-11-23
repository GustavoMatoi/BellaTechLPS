/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Feedback;
import Model.Paciente;
import Model.Persistencia;
import factory.DatabaseJPA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Object objetoManaged = this.entityManager.merge(objeto);
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(objetoManaged);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
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
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Feedback paciente = (Feedback) objeto;
        Feedback p = this.entityManager.find(Feedback.class, paciente.getId());
        this.entityManager.close();
        return p;
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        String jpql = " SELECT f " + "FROM Feedback f";
        
        Query qry = this.entityManager.createQuery(jpql);
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
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
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT p " + " FROM Feedback p" + " WHERE p.id like :id";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Feedback) lst.get(0);
        }
    }

}
