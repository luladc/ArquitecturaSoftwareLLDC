/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica3;

/**
 *
 * @author LLDC
 */
public class LibroReal implements Libro{
    public String nombre_libro;
    public String autor_libro;
    public String sipnosis_libro;
    public int anio_libro;
    
    public LibroReal(String nombre_libro, String autor_libro, String sipnosis_libro, int anio_libro) {
        this.nombre_libro = nombre_libro;
        this.autor_libro = autor_libro;
        this.sipnosis_libro = sipnosis_libro;
        this.anio_libro = anio_libro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public String getAutor_libro() {
        return autor_libro;
    }

    public String getSipnosis_libro() {
        return sipnosis_libro;
    }

    public int getAnio_libro() {
        return anio_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public void setAutor_libro(String autor_libro) {
        this.autor_libro = autor_libro;
    }

    public void setSipnosis_libro(String sipnosis_libro) {
        this.sipnosis_libro = sipnosis_libro;
    }

    public void setAnio_libro(int anio_libro) {
        this.anio_libro = anio_libro;
    }
    
    @Override
    public void leer(){
        System.out.println("Mostrando info de libro:");
        System.out.println("Titulo de libro: " + nombre_libro);
        System.out.println("Autor del libro: " + autor_libro);
        System.out.println("Sipnosis del libro: " + sipnosis_libro);
        System.out.println("Año de estreno: " + anio_libro);
    }
}
