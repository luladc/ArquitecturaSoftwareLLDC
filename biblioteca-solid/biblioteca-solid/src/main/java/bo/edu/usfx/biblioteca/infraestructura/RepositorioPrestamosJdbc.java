package bo.edu.usfx.biblioteca.infraestructura;

import bo.edu.usfx.biblioteca.dominio.RepositorioPrestamos;
import bo.edu.usfx.biblioteca.legado.Prestamo;
import bo.edu.usfx.biblioteca.legado.Usuario;
import java.util.ArrayList;
import java.util.List;

public class RepositorioPrestamosJdbc implements RepositorioPrestamos {
    // Aquí iría la conexión real a BD (DataSource). 
    // Lo dejamos simulado para que compile y pases la prueba.
    @Override
    public void guardar(Prestamo prestamo) {
        System.out.println("Guardando en BD real...");
    }

    @Override
    public List<Prestamo> activosDe(Usuario usuario) {
        return new ArrayList<>();
    }
}