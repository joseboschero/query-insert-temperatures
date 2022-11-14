/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author joseb
 */
public class CiudadDAO {
    ArrayList<CiudadVO> Ciudad;
    
    public CiudadDAO() {
        Ciudad = new ArrayList<CiudadVO>();
    }
    
    public ArrayList<CiudadVO> getAll() {
        Connection conector = Conexion.getConexion();
        String sql = "SELECT * FROM ciudades ORDER BY idciudad";
        try {
            PreparedStatement comando = conector.prepareStatement(sql);
            
            ResultSet rs = comando.executeQuery();
            while(rs.next()) {
                Ciudad.add(new CiudadVO( rs.getInt("idciudad"), rs.getString("nombre")));
                
            }
        conector.close();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return Ciudad;
    }
    
    public ArrayList<CiudadVO> getNombresCiudades() {
        Connection conector = Conexion.getConexion();
        String sql = "SELECT * FROM ciudades ORDER BY idciudad ASC";
        try {
            PreparedStatement comando = conector.prepareStatement(sql);
            
            ResultSet rs = comando.executeQuery();
            while(rs.next()) {
                Ciudad.add(new CiudadVO( rs.getInt("idciudad"), rs.getString("nombre")));
                
            }
        conector.close();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return Ciudad;
    } 
}
