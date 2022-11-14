/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joseb
 */
public class ControladorFecha {
    boolean fechaCorrecta = false;
    
    public boolean fechaCorrecta(String fecha){
        String fechaPattern = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$";
        fechaCorrecta = fecha.matches(fechaPattern);
        return fechaCorrecta;
    }
}
