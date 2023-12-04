/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Feedback;
import Model.Pagamento;
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
        Pagamento pagamento = (Pagamento) objeto;
        
        Pagamento p = this.entityManager.find(Pagamento.class, pagamento.getId());
        this.entityManager.close();
        return p;
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        String jpql = " SELECT p " + " FROM Pagamento p ";
        
        Query qry = this.entityManager.createQuery(jpql);
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
       }

    @Override
    public boolean delete(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Pagamento pagamento = (Pagamento) objeto;
        Pagamento p = this.entityManager.find(Pagamento.class, pagamento.getId());
        this.entityManager.remove(p);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT p " + " FROM Pagamento p" + " WHERE p.id like :id";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Pagamento) lst.get(0);
        }
    }
    
public List<Pagamento> findAllByPagamento(String recebedor) {
    this.entityManager = DatabaseJPA.getInstance().getEntityManager();
    String jpql = "";
    if (recebedor.equals("BellaTech")) {
        jpql = "SELECT p FROM Pagamento p WHERE p.recebedor='BellaTech'";
    } else {
        jpql = "SELECT p FROM Pagamento p WHERE p.recebedor <> 'BellaTech'";
    }

    Query qry = this.entityManager.createQuery(jpql);
    List<Pagamento> lst = qry.getResultList();

    this.entityManager.close();
    return lst;
}
}