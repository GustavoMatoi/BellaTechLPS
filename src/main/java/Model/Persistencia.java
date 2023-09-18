/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gutei
 */
public class Persistencia {
    private static Connection connection = null;
    
    private Persistencia(){
        try{
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:dbBellaTech.sqlite");
        } catch (ClassNotFoundException e){
            System.err.println("Erro ao abrir conexão " + e.toString());
        } catch (SQLException e){
            System.err.println("Erro ao abrir conexão " + e.toString());
        }
    }
    
    public static Connection getConnection(){
        if(connection == null){
            new Persistencia();
        }
        return connection;
    }
    
    public static void closeConnection(){
        try{
            connection.close();
            connection = null;
        } catch (SQLException e){
            Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
