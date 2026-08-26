
package bo.edu.usfx.biblioteca.dominio;

import bo.edu.usfx.biblioteca.legado.Libro;
import bo.edu.usfx.biblioteca.legado.Prestamo;
import bo.edu.usfx.biblioteca.legado.Usuario;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author LLDC
 */
public interface PoliticaPrestamo {
    void validar(Usuario usuario, List<Prestamo> activos, Libro libro);
    LocalDate fechaLimite(LocalDate hoy);
}
