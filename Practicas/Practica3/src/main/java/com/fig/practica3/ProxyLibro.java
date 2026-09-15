/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fig.practica3;

/**
 *
 * @author LLDC
 */
// 2. El Proxy modificado para exigir un Usuario
public class ProxyLibro implements Libro {
    private LibroReal libroReal;
    private Usuario usuarioLogueado;

    public ProxyLibro(LibroReal libroReal, Usuario usuarioLogueado) {
        this.libroReal = libroReal;
        this.usuarioLogueado = usuarioLogueado;
    }

    @Override
    public void leer() {
        System.out.println("Verificando credenciales de: " + usuarioLogueado.getUsername() + "...");
        
        if ("clave123".equals(usuarioLogueado.getPassword())) {
            System.out.println("Acceso concedido.");
            this.libroReal.leer();
        } else {
            System.out.println("ACCESO DENEGADO. Contraseña incorrecta para el libro: " + libroReal.getNombre_libro());
        }
    }
}
