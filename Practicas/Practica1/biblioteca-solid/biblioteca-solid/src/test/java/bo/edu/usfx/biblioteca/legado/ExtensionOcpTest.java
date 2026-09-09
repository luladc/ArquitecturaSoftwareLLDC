package bo.edu.usfx.biblioteca.legado;

import bo.edu.usfx.biblioteca.dominio.Usuario;
// ¡ESTA ES LA LÍNEA QUE FALTABA! Importamos todo lo del paquete dominio
import bo.edu.usfx.biblioteca.dominio.*; 

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class PoliticaEgresado implements PoliticaPrestamo {
    public boolean aplicaA(Usuario u) { return "EGRESADO".equals(u.getTipo()); }
    public int diasPermitidos()       { return 5; }
    public int maximoEjemplares()     { return 2; }
    public BigDecimal tarifaDiaria()  { return new BigDecimal("3.0"); }
}

public class ExtensionOcpTest {

    @Test
    @DisplayName("OCP: se agrega EGRESADO sin tocar el codigo existente")
    void extensionSinModificacion() {
        CatalogoPoliticas catalogo = new CatalogoPoliticas(List.of(
            new PoliticaEstudiante(), 
            // new PoliticaDocente(), new PoliticaAdministrativo(), new PoliticaExterno(), 
            new PoliticaEgresado()
        ));

        // única linea agregada
        Usuario juan = new Usuario("205001", "Juan", "juan@usfx.bo", "EGRESADO");
        
        assertThat(catalogo.para(juan).diasPermitidos()).isEqualTo(5);
        assertThat(catalogo.para(juan).multa(4)).isEqualByComparingTo("12.0");
    }
}