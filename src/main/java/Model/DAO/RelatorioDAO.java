/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Persistencia;
import Model.Relatorio;
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
public class RelatorioDAO implements IDAO {
    String jpql;
    EntityManagerFactory factory;
    EntityManager entityManager;
    public RelatorioDAO(){
        //this.sql = "";
        this.jpql = "";
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
        Relatorio relatorio = (Relatorio) objeto;
        
        Relatorio r = this.entityManager.find(Relatorio.class, relatorio.getId());
        this.entityManager.close();
        return r;    
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        String jpql = " SELECT r " + " FROM Relatorio r ";
        
        Query qry = this.entityManager.createQuery(jpql);
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;    }

    @Override
    public boolean delete(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Relatorio relatorio = (Relatorio) objeto;
        Relatorio r = this.entityManager.find(Relatorio.class, relatorio.getId());
        this.entityManager.remove(r);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT r " + " FROM Relatorio r" + " WHERE r.id like :id";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Relatorio) lst.get(0);
        }    
    }
}
