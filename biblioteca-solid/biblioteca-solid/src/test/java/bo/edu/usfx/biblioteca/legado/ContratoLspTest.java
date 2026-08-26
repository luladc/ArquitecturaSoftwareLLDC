package bo.edu.usfx.biblioteca.legado;

import bo.edu.usfx.biblioteca.dominio.Prestable;
import bo.edu.usfx.biblioteca.dominio.LibroGeneral;
import bo.edu.usfx.biblioteca.dominio.Revista;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;

class ContratoLspTest {

    @Test
    @DisplayName("LSP: Todo material Prestable devuelve una fecha valida al prestarse")
    void sustituibilidadLsp() {
        LocalDate hoy = LocalDate.of(2026, 8, 25);
        
        Prestable material1 = new LibroGeneral("001", "Clean Code");
        Prestable material2 = new Revista("002", "IEEE Software");
        
        assertThat(material1.prestar(hoy)).isEqualTo(hoy.plusDays(7));
        assertThat(material2.prestar(hoy)).isEqualTo(hoy.plusDays(2));
    }
}