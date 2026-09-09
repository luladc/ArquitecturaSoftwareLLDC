/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica2;

/**
 *
 * @author LLDC
 */
public abstract class Ave extends Animal {
    protected double peso;
    protected double tamanoAlas;

    public Ave() {}

    public abstract void volar();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(double tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    @Override
    public String toString() {
        return super.toString() + " peso de ave: " + peso + "kilos, tamaño de alas: " + tamanoAlas + "metros";
    }
}
