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
        Usuario usuario = (Usuario) objeto;

        try {
              Usuario usuarioManaged = entityManager.merge(usuario);
              entityManager.getTransaction().begin();
              entityManager.persist(usuarioManaged);
              entityManager.getTransaction().commit();
        } catch (Error e){
            System.out.println(e);
        } finally {
            entityManager.close();
            factory.close();
        } 

    
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
        Usuario usuario = (Usuario) objeto;
        
        Usuario u = this.entityManager.find(Usuario.class, usuario.getId());
        this.entityManager.close();
        System.out.println(u.getNome());
        return u;
    }

    @Override
    public List<Object> findAll() {
        List <Object> list = new ArrayList<>();
        
        /*sql = "SELECT * FROM Usuario ORDER BY upper(id)";
        
        try{
            statement = Persistencia.getConnection().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                Medico m = new Medico();
                m.setNome(resultSet.getString(2));
                m.setCpf(resultSet.getString(3));
                m.setLogin(resultSet.getString(4));
                m.setSenha(resultSet.getString(5));
                m.setDataNascimento(resultSet.getString(6));
                m.setTelefone(resultSet.getString(7));
                m.setCargo(resultSet.getString(8));
                m.setSalario(resultSet.getFloat(9));
                list.add(m);
            }
            statement.close();
        } catch (SQLException ex){
            throw new RuntimeException(ex);
        } finally{
            Persistencia.closeConnection();
        } */
        return list;
       }

    @Override
    public boolean delete(Object objeto) {
        Usuario m = (Usuario) objeto;
        
        sql = "DELETE FROM Usuario WHERE id = ?";
        
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
        
        String jpql = "SELECT u " + " FROM Usuario u" + " WHERE u.login like :login";
        Query qry = this.entityManager.createQuery(jpql);
        qry.setParameter("login", id);
        
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
