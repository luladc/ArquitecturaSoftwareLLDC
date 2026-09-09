/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica2;

/**
 *
 * @author LLDC
 */
public class MamiferoFactory implements AnimalFactory {
    @Override
    public Animal crearAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("leon")) return new Leon();
        if (tipo.equalsIgnoreCase("oso")) return new Oso();
        if (tipo.equalsIgnoreCase("mono")) return new Mono();
        return null;
    }
}