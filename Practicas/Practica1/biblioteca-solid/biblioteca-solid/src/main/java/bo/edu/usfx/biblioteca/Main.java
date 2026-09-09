package bo.edu.usfx.biblioteca;

import bo.edu.usfx.biblioteca.aplicacion.ServicioPrestamo;
import bo.edu.usfx.biblioteca.dominio.PoliticaEstudiante;
import bo.edu.usfx.biblioteca.infraestructura.NotificadorSmtp;
import bo.edu.usfx.biblioteca.infraestructura.RepositorioPrestamosJdbc;

public class Main {
    public static void main(String[] args) {
        ServicioPrestamo servicio = new ServicioPrestamo(
            new RepositorioPrestamosJdbc(),
            new NotificadorSmtp("smtp.usfx.bo", 587),
            new PoliticaEstudiante() 
        );
        
        System.out.println("Sistema ensamblado correctamente usando Inyección de Dependencias.");
    }
}