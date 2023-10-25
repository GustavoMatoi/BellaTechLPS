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
        Object objetoManaged = this.entityManager.merge(objeto);
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(objetoManaged);
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
    }

    @Override
    public void update(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object find(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    /*
    protected Connection conexao;
    private PreparedStatement statement;
    private String sql; 
    //
    EntityManagerFactory factory;
    EntityManager entityManager;
    
    public RelatorioDAO(){
        this.sql = "";
        factory = Persistence.createEntityManagerFactory("bellatech");
        entityManager = factory.createEntityManager();
    }
    
    @Override
    public void save(Object objeto) {
        Relatorio relatorio = new Relatorio();
        
        try {
              Relatorio relatorioManaged = entityManager.merge(relatorio);
              entityManager.getTransaction().begin();
              entityManager.persist(relatorioManaged);
              entityManager.getTransaction().commit();
        } catch (Error e){
            System.out.println(e);
        } finally {
            entityManager.close();
            factory.close();
        } 
        
        /*
        sql = "INSERT INTO" + 
                "Relatorio(nomePaciente, protocolo, justificativa, medicoResponsavel)" + "VALUES(?,?,?,?)";
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            statement.setString(1, relatorio.getNomePaciente());
            statement.setString(2, relatorio.getProtocolo());
            statement.setString(3, relatorio.getJustificativa());
            statement.setString(4, relatorio.getMedicoResponsavel());
            
            statement.execute();
            statement.close();
        } catch (SQLException ex) {
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        } 
    
    }   

    @Override
    public void update(Object objeto) {
        Relatorio relatorio = (Relatorio) objeto;
        
        sql = "UPDATE Relatorio" + 
                "SET nomePaciente=?, protocolo=?, justificativa=?, medicoResponsavel=?" +
                "WHERE id=?";
        
        try{
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            //statement.setInt(1, relatorio.getPacienteId());
            statement.setString(2, relatorio.getProtocolo());
            statement.setString(3, relatorio.getJustificativa());
            //statement.setInt(4, relatorio.getMedicoId());
      
            statement.setInt(5, relatorio.getId());
            
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
        Relatorio endereco = (Relatorio) objeto;
        
        sql = "SELECT * FROM Relatorio WHERE id = ?";
        
        try {
            statement = Persistencia.getConnection().prepareStatement(sql);
            statement.setInt(1, endereco.getId());
            
            ResultSet resultSet = statement.executeQuery();
            Relatorio r = null;
            
            while (resultSet.next()){
                r = new Relatorio();
                //r.setPacienteId(resultSet.getInt(2));
                r.setProtocolo(resultSet.getString(3));
                r.setJustificativa(resultSet.getString(4));
                //r.setMedicoId(resultSet.getInt(5));
            }
            statement.close();
            return r;
        } catch (SQLException ex){
            throw new RuntimeException (ex);
        } finally {
            Persistencia.closeConnection();
        }
    }

    @Override
    public List<Object> findAll(Object objeto) {
        List <Object> list = new ArrayList<>();
        
        sql = "SELECT * FROM Relatorio ORDER BY upper(id)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Relatorio r = new Relatorio();
                //r.setPacienteId(resultSet.getInt(2));
                r.setProtocolo(resultSet.getString(3));
                r.setJustificativa(resultSet.getString(4));
                //r.setMedicoId(resultSet.getInt(5));
                
                list.add(r);
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
        Relatorio r = (Relatorio) objeto;
        
        sql = "DELETE FROM Relatorio WHERE id = ?";
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, r.getId());
            
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
        sql = "SELECT * FROM Relatorio as r WHERE r.id = ?";
        
        Relatorio r = null;
        
        try {
            conexao = Persistencia.getConnection();
            statement = conexao.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                r = new Relatorio();
                r.setId(resultSet.getInt(1));
               // r.setPacienteId(resultSet.getInt(2));
                r.setProtocolo(resultSet.getString(3));
                r.setJustificativa(resultSet.getString(4));
                //r.setMedicoId(resultSet.getInt(5));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            Persistencia.closeConnection();
        }
        return r;
    }
*/

}
