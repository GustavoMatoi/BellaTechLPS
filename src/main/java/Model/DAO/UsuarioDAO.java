/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Medico;
import Model.Paciente;
import Model.Persistencia;
import Model.Usuario;
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
public class UsuarioDAO implements IDAO {

    protected Connection conexao;
    private PreparedStatement statement;
    private String sql;
    //
    
    EntityManagerFactory factory;
    EntityManager entityManager;
    
    public UsuarioDAO(){
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
        Usuario usuario = (Usuario) objeto;
        
        Usuario u = this.entityManager.find(Usuario.class, usuario.getId());
        this.entityManager.close();
        return u;
    }

    @Override
    public List<Object> findAll() {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        String jpql = " SELECT u " + " FROM Usuario u ";
        
        Query qry = this.entityManager.createQuery(jpql);
        List lst = qry.getResultList();
        
        this.entityManager.close();
        return (List<Object>) lst;
       }

    @Override
    public boolean delete(Object objeto) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        this.entityManager.getTransaction().begin();
        Usuario usuario = (Usuario) objeto;
        Usuario u = this.entityManager.find(Usuario.class, usuario.getId());
        this.entityManager.remove(u);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object findById(int id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT u " + " FROM Usuario u" + " WHERE u.id like :id";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            return null;
        } else { 
            return (Usuario) lst.get(0);
        }
    }
    
        public Object findByLogin(String id) {
        this.entityManager = DatabaseJPA.getInstance().getEntityManager();
        
        String jpql = "SELECT u " + " FROM Usuario u" + " WHERE u.login like :login";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("login", id);
        
        List lst = qry.getResultList();
        
        this.entityManager.close();
        
        if(lst.isEmpty()){
            Usuario inexistente = new Usuario();
            inexistente.setCargo("inexistente");
            return inexistente;
        } else { 
            return (Usuario) lst.get(0);
        }
    }
        
        
    
}
