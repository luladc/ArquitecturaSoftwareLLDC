package bo.edu.usfx.biblioteca.legado;

import bo.edu.usfx.biblioteca.dominio.roles.*;

// Solo implementa roles digitales. ¡Cero excepciones lanzadas!
public class EjemplarDigital implements Prestable, Descargable, Distribuible {
    @Override public void prestar(String codigoUsuario) { /* lógica */ }
    @Override public void devolver(String codigoUsuario) { /* lógica */ }
    @Override public byte[] descargarPdf() { return new byte[0]; }
    @Override public void enviarPorCorreo(String destinatario) { /* lógica */ }
}