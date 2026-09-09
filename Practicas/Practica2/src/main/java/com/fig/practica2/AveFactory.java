/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica2;

/**
 *
 * @author LLDC
 */
public class AveFactory implements AnimalFactory {
    @Override
    public Animal crearAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("loro")) return new Loro();
        if (tipo.equalsIgnoreCase("aguila")) return new Aguila();
        if (tipo.equalsIgnoreCase("condor")) return new Condor();
        return null;
    }
}
