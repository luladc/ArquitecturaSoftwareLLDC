
package bo.edu.usfx.biblioteca.presentacion;
import bo.edu.usfx.biblioteca.legado.Prestamo;
/**
 *
 * @author LLDC
 */

public class ComprobantePrestamo {
    public String imprimir(Prestamo prestamo) {
        return "=== BIBLIOTECA USFX ===\n" 
             + "Usuario : " + prestamo.getUsuario().getNombre() + " (" + prestamo.getUsuario().getCodigo() + ")\n"
             + "Titulo  : " + prestamo.getLibro().getTitulo() + "\n"
             + "Entrega : " + prestamo.getFechaLimite() + "\n"
             + "=======================";
    }
}