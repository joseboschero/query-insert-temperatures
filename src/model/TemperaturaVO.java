/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joseb
 */
public class TemperaturaVO {
    private int idciudad;
    private String fecha;
    private String minima;
    private String maxima;
    
    public TemperaturaVO() {
        
    }
    
    public TemperaturaVO(int idciudad, String fecha, String minima, String maxima){
        this.idciudad = idciudad;
        this.fecha = fecha;
        this.minima = minima;
        this.maxima = maxima;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMinima() {
        return minima;
    }

    public void setMinima(String minima) {
        this.minima = minima;
    }

    public String getMaxima() {
        return maxima;
    }

    public void setMaxima(String maxima) {
        this.maxima = maxima;
    }
    
    @Override
    public String toString() {
        String fechaLarga;
        fechaLarga = fecha + minima + maxima ;
        return fechaLarga;
    }
}
