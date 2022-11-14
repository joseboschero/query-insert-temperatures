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
public class MesesDAO {
    ArrayList<Meses> Meses;
    int i;
    String idMes;
    
    public MesesDAO() {
        Meses = new ArrayList<Meses>();
    }
    
    public ArrayList<Meses> getMeses() {
        i = 1;
        String[] mesesArray = new String[]{ "Enero" , "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        
        for(String meses : mesesArray) {
            Meses.add(new Meses(i, meses));
            i++;
        }
        
        return Meses;
    }
    
    public String devolverIdMes(String mes) {
        switch(mes){
            case "Enero":
                idMes = "01";
                break;
            case "Febrero":
                idMes = "02";
                break;
            case "Marzo":
                idMes = "03";
                break;
            case "Abril":
                idMes = "04";
                break;
            case "Mayo":
                idMes = "05";
                break;
            case "Junio":
                idMes = "06";
                break;
            case "Julio":
                idMes = "07";
                break;
            case "Agosto":
                idMes = "08";
                break;
            case "Septiembre":
                idMes = "09";
                break;
            case "Octubre":
                idMes = "10";
                break;
            case "Noviembre":
                idMes = "11";
                break;
            case "Diciembre":
                idMes = "12";
                break;

        }
        return idMes;
    } 
}
