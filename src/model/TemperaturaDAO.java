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
public class TemperaturaDAO {
    ArrayList<TemperaturaVO> Temperaturas;
    boolean existe;
    int Conteo;
    
    public TemperaturaDAO() {
        Temperaturas = new ArrayList<TemperaturaVO>();
    }
    
    public ArrayList<TemperaturaVO> getTemperaturas(int idciudad, String fecha) {
        Connection conector = Conexion.getConexion();
        String sql = "SELECT * FROM temperaturas WHERE idciudad=? AND fecha LIKE ? ORDER BY idciudad";
        try {
            PreparedStatement comando = conector.prepareStatement(sql);
            comando.setInt(1, idciudad);
            comando.setString(2, fecha);
            
            ResultSet rs = comando.executeQuery();
            while(rs.next()) {
                Temperaturas.add(new TemperaturaVO( rs.getInt("idciudad"), rs.getString("fecha"), rs.getString("minima"), rs.getString("maxima")));
                
            }
            
            conector.close();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return Temperaturas;
    } 
    
    public void grabarTemperaturas(int idciudad, String fecha, String minima, String maxima) {
        Connection conector = Conexion.getConexion();
        String sql = "INSERT INTO temperaturas VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement comando = conector.prepareStatement(sql);
            comando.setInt(1, idciudad);
            comando.setString(2, fecha);
            comando.setString(3, minima);
            comando.setString(4, maxima);
            
            comando.execute();
            
            conector.close();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public boolean existeTemperatura(int idciudad, String fecha) {
       
        Connection conector = Conexion.getConexion();
        String sql = "SELECT Count(idciudad)as conteo FROM temperaturas WHERE idciudad=? AND fecha=?";
        try {
            PreparedStatement comando = conector.prepareStatement(sql);
            comando.setInt(1, idciudad);
            comando.setString(2, fecha);
            
            ResultSet rs = comando.executeQuery();
            while(rs.next()) {
                Conteo = rs.getInt("conteo");
            }
            
            if (Conteo == 1){
                existe = true;
            } else {
                existe = false;
            }
            
            
            
            conector.close();
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return existe;
    }
}
