
package bo.edu.usfx.biblioteca.dominio;

import java.util.List;
/**
 *
 * @author LLDC
 */
public interface RepositorioPrestamos {
    void guardar(Prestamo prestamo);
    List<Prestamo> activosDe(Usuario usuario);
}
