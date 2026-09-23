/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.parcial1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LLDC
 */
public class Fase implements IElementoProyecto {
    String nombre;
    float por_ga_ad;
    List<IElementoProyecto> actividades;
    
      public Fase(String nombre, float por_ga_ad) {
        this.nombre = nombre;
        this.por_ga_ad = por_ga_ad;
        this.actividades = new ArrayList<>();
    }
      
    @Override
    public String getNombre() {
        return nombre;
    }

    public float getPor_ga_ad() {
        return por_ga_ad;
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPor_ga_ad(float por_ga_ad) {
        this.por_ga_ad = por_ga_ad;
    }
    
     public void agregar(IElementoProyecto actividad) {
        this.actividades.add(actividad);
    }
    
    public void eliminar(IElementoProyecto actividad) {
        this.actividades.remove(actividad);
    }

    public IElementoProyecto obtener(int posicion) {
        return this.actividades.get(posicion);
    }

    public List<IElementoProyecto> obtenerTodos() {
        return this.actividades;
    }

    @Override
    public float getCosto() {
        float total = 0;
        int aux=0;
        for (IElementoProyecto actividad : actividades) {
            aux+=1;
            total = (total+actividad.getCosto())/aux; 
        }
        return total;
    }
    
    @Override 
    public int getDuracionDias(){
        int total_dias = 0;
        for (IElementoProyecto actividad : actividades) {
            total_dias += actividad.getDuracionDias(); 
        }
        return total_dias;
    }
    
    @Override 
    public void mostrar(int nivel){
        
    }
    
}
