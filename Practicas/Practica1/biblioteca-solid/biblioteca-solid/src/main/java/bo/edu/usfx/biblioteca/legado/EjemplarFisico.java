package bo.edu.usfx.biblioteca.legado;

import bo.edu.usfx.biblioteca.dominio.roles.*;

// Solo implementa roles físicos. ¡Cero excepciones lanzadas!
public class EjemplarFisico implements Prestable, Renovable, Reservable, Restaurable {
    @Override public void prestar(String codigoUsuario) { /* lógica */ }
    @Override public void devolver(String codigoUsuario) { /* lógica */ }
    @Override public void renovar(String codigoUsuario) { /* lógica */ }
    @Override public void reservar(String codigoUsuario) { /* lógica */ }
    @Override public void enviarARestauracion() { /* lógica */ }
}
