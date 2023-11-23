/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Medico;
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
public class MedicoDAO implements IDAO {

    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    //
    
    EntityManagerFactory factory;
    EntityManager entityManager;
    
    public MedicoDAO(){
        //this.sql = "";
        factory = Persistence.createEntityManagerFactory("bellatech");
        entityManager = factory.createEntityManager();
    }
    
    @Override
    public void save(Object objeto) {
        
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(objeto);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
      
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
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Medico medico = (Medico) objeto;
        
        Medico m = this.entityManager.find(Medico.class, medico.getId());
        this.entityManager.close();
        System.out.println(m.getNome());
        return m;
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        String jpql = "SELECT u FROM Usuario u WHERE u.cargo = 'medico'";
        Query qry = this.entityManager.createQuery(jpql);
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
       }
       

    @Override
    public boolean delete(Object objeto) {
        Medico m = (Medico) objeto;
        
        sql = "DELETE FROM Medico WHERE id = ?";
        
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
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT m " + " FROM Medico m" + " WHERE m.login like :login";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("login", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Medico) lst.get(0);
        }
    }
    
        public Object findByLogin(String id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT m " + " FROM Medico m" + " WHERE m.login like :login";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("login", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Medico) lst.get(0);
        }
    }
    
}
