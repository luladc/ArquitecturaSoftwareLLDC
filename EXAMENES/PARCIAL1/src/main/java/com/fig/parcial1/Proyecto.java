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
public class Proyecto {
    String codigo;
    String titulo;
    String invetigadorres;
    String convocatoria;
    float presupuesto_max;
    List<IElementoProyecto> fases;

    public Proyecto(String codigo, String titulo, String invetigadorres, String convocatoria, float presupuesto_max) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.invetigadorres = invetigadorres;
        this.convocatoria = convocatoria;
        this.presupuesto_max = presupuesto_max;
        this.fases= new ArrayList<>(                                                );
        
    }

    public double calcularTotal(double total) {
        total = 0;
        for (IElementoProyecto d : fases) {
            total += d.getCosto();
        }
        return total;
    }
    
      public int getDuracionTotal(IElementoProyecto fase) {
        int dias=0;
        for (IElementoProyecto d : fases) {
            dias += d.getDuracionDias();
        }
        return dias;
    }

    public void estaDentroDelPresupuesto(double total) {
        if(total <= presupuesto_max){
            System.out.println("etsa dentro");
            

    }
}
     
}
