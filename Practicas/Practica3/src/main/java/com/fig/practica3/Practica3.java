/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fig.practica3;

/**
 *
 * @author LLDC
 */
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibroReal libroFisico = new LibroReal("Cartas de amor a los muertos", "Ava Dellaira", 
            "Trata de una novela juvenil contada a través de una serie de cartas escritas a personajes muertos por una chica de 15 años llamada Laurel, que está de duelo por la pérdida de su hermana mayor llamada May.",
             2014
        );

        System.out.println("--- SISTEMA DE BIBLIOTECA VIRTUAL ---");
        System.out.println("Recurso solicitado: " + libroFisico.getNombre_libro());
        System.out.println("Debe iniciar sesión para acceder al contenido.\n");

        System.out.print("Ingrese su usuario: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Ingrese su contraseña (pista: clave123): ");
        String inputPassword = scanner.nextLine();

        Usuario usuarioConsola = new Usuario(inputUsername, inputPassword);

        Libro proxyLibro = new ProxyLibro(libroFisico, usuarioConsola);

        System.out.println("\nProcesando solicitud de acceso...\n");

        proxyLibro.leer();

        scanner.close();
    }
}