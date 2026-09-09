/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica2;

/**
 *
 * @author LLDC
 */
public class PezFactory implements AnimalFactory {
    @Override
    public Animal crearAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("pacu")) return new Pacu();
        if (tipo.equalsIgnoreCase("sabalo")) return new Sabalo();
        return null;
    }
}

