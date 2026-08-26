package bo.edu.usfx.biblioteca.aplicacion;

import bo.edu.usfx.biblioteca.dominio.Libro;
import bo.edu.usfx.biblioteca.dominio.Prestamo;
import bo.edu.usfx.biblioteca.dominio.Usuario;
import bo.edu.usfx.biblioteca.dominio.*;
import bo.edu.usfx.biblioteca.legado.*; 
import java.time.LocalDate;

public class ServicioPrestamo {
    private final RepositorioPrestamos repositorio;
    private final Notificador notificador;
    private final PoliticaPrestamo politica;

    public ServicioPrestamo(RepositorioPrestamos repositorio, Notificador notificador, PoliticaPrestamo politica) {
        this.repositorio = repositorio;
        this.notificador = notificador;
        this.politica = politica;
    }

    public Prestamo registrar(Usuario usuario, Libro libro, LocalDate hoy) {
        politica.validar(usuario, repositorio.activosDe(usuario), libro);
        Prestamo prestamo = new Prestamo(usuario, libro, hoy, politica.fechaLimite(hoy));
        repositorio.guardar(prestamo);
        notificador.notificar(usuario.getCorreo(), "Préstamo registrado", "Devuelva hasta el " + prestamo.getFechaLimite());
        return prestamo;
    }
}