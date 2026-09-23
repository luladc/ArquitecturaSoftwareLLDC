/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.parcial1;

/**
 *
 * @author LLDC
 */
public class Actividad implements IElementoProyecto{
    String nombre;
    String responsable;
    int duraciondias;
    float costo;
    float por_avance;

    public Actividad(String nombre, String responsable, int duraciondias, float costo, float por_avance) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.duraciondias = duraciondias;
        this.costo = costo;
        this.por_avance = por_avance;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }
    
    @Override

    public int getDuracionDias() {
        return duraciondias;
    }
    @Override
    public float getCosto() {
        return costo;
    }
    @Override 
    public void mostrar(int nivel){
        
    }

    public float getPor_avance() {
        return por_avance;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void setDuracionDias(int duraciondias) {
        this.duraciondias = duraciondias;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setPor_avance(float por_avance) {
        this.por_avance = por_avance;
    }
    
}
