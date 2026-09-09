/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica2;

/**
 *
 * @author LLDC
 */
public abstract class Mamifero extends Animal {
    protected double temperatura;
    protected int numeroPatas;
    protected String color;

    public Mamifero() {}

    public abstract double getTemperatura();

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " | Mamífero - Temp: " + getTemperatura() + "°C, Patas: " + numeroPatas + ", Color: " + color;
    }
}
