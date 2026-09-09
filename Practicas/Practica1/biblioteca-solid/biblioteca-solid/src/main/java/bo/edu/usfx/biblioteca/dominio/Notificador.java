
package bo.edu.usfx.biblioteca.dominio;

/**
 *
 * @author LLDC
 */
public interface Notificador {
    public void notificar(String destino, String asunto, String mensaje);
}
