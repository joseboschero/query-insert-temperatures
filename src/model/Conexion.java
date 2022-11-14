/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
/**
 *
 * @author joseb
 */
public class Conexion {
    
    public static Connection getConexion() {
        Connection conector = null;
        
        try {
            conector = DriverManager.getConnection("jdbc:mysql://localhost/clima_db", "root", ""); 
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
       
        return conector;
    }
    
}
