/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseJPA {
    
    private EntityManagerFactory factory;
    
    public static DatabaseJPA INSTANCE = null;
    
    public static DatabaseJPA getInstance(){
        if(INSTANCE == null){
            INSTANCE = new DatabaseJPA();
        }
        return INSTANCE;
    }

    private DatabaseJPA(){
        factory = Persistence.createEntityManagerFactory("bellatech");
    }
    
    public EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
    
    public void closeFactory(){
        this.factory.close();
    }
}
