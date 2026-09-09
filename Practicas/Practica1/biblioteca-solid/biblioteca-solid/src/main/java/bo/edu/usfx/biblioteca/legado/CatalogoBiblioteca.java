package bo.edu.usfx.biblioteca.legado;

import bo.edu.usfx.biblioteca.dominio.Material;
import bo.edu.usfx.biblioteca.dominio.Prestable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Cliente escrito contra el tipo base. Aqui se ve el dano de la violacion
 * de LSP: el codigo se llena de instanceof y de try/catch defensivos.
 */
public class CatalogoBiblioteca {

    private final List<MaterialBiblioteca> materiales = new ArrayList<>();

    public void agregar(MaterialBiblioteca material) {
        materiales.add(material);
    }

    public List<String> prestarTodo(LocalDate hoy) {
        return materiales.stream()
                .filter(Prestable.class::isInstance)
                .map(Prestable.class::cast)
                .map(p -> ((Material) p).titulo() + " -> " + p.prestar(hoy))
                .toList();
    }

    public List<MaterialBiblioteca> getMateriales() { return materiales; }
}
