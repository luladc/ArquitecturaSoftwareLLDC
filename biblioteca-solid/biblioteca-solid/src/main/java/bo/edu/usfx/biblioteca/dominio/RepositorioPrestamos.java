
package bo.edu.usfx.biblioteca.dominio;

import bo.edu.usfx.biblioteca.legado.Prestamo;
import bo.edu.usfx.biblioteca.legado.Usuario;
import java.util.List;
/**
 *
 * @author LLDC
 */
public interface RepositorioPrestamos {
    void guardar(Prestamo prestamo);
    List<Prestamo> activosDe(Usuario usuario);
}
