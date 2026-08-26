
package bo.edu.usfx.biblioteca.dominio;

import java.util.List;
/**
 *
 * @author LLDC
 */
public class CatalogoPoliticas {
    private final List<PoliticaPrestamo> politicas;

    public CatalogoPoliticas(List<PoliticaPrestamo> politicas) {
        this.politicas = politicas;
    }

    public PoliticaPrestamo para(Usuario usuario) {
        return politicas.stream()
                .filter(p -> p.aplicaA(usuario))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Politica no definida para: " + usuario.getTipo()));
    }
}
