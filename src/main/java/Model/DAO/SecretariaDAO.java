 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Persistencia;
import Model.Secretaria;
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
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(objeto);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        
    }   

    @Override
    public void update(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(objeto);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Secretaria secretaria = (Secretaria) objeto;
        Secretaria s = this.entityManager.find(Secretaria.class, secretaria.getId());
        this.entityManager.close();
        return s;
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        String jpql = " SELECT s " + " FROM Secretaria s ";
        
        Query qry = this.entityManager.createQuery(jpql);
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
       }

    @Override
    public boolean delete(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Secretaria secretaria = (Secretaria) objeto;
        Secretaria s = this.entityManager.find(Secretaria.class, secretaria.getId());
        this.entityManager.remove(s);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT s " + " FROM Secretaria s" + " WHERE s.id like :id";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Secretaria) lst.get(0);
        }
    }
    
        public Object findByLogin(String id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT s " + " FROM Secretaria s" + " WHERE s.login like :login";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("login", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Secretaria) lst.get(0);
        }
    }
    
}
