/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica2;

/**
 *
 * @author LLDC
 */
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Jaula> listaJaulas;

    public Zoologico(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaJaulas = new ArrayList<>();
    }

    public void agregarJaula(Jaula jaula) {
        listaJaulas.add(jaula);
    }

    public List<Jaula> getListaJaulas() {
        return listaJaulas;
    }

    @Override
    public String toString() {
        return "Zoológico: " + nombre + " | Dir: " + direccion + " | Tel: " + telefono + " | Total Jaulas: " + listaJaulas.size();
    }
}