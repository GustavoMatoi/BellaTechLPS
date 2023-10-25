/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Medico;
import Model.Persistencia;
import Model.Procedimento;
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
public class ProcedimentoDAO implements IDAO {
    private String jpql;
    private Query qry;
    EntityManagerFactory factory;
    EntityManager entityManager;
    public ProcedimentoDAO (){
        this.jpql = "";
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
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(objeto);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public Object find(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        Procedimento procedimento = (Procedimento) objeto;
        
        Procedimento p = this.entityManager.find(Procedimento.class, procedimento.getId());
        this.entityManager.close();
        return p;
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        jpql = " SELECT p " + "FROM Procedimento p";
        
        qry = this.entityManager.createQuery(jpql);
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
       }

    @Override
    public boolean delete(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(objeto);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        jpql = "SELECT p " + " FROM Procedimento p" + " WHERE p.id like :id";
        qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Procedimento) lst.get(0);
        }
    }

}
