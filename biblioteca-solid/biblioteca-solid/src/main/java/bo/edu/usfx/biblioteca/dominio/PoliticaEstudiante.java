
package bo.edu.usfx.biblioteca.dominio;

import java.math.BigDecimal;
/**
 *
 * @author LLDC
 */
public class PoliticaEstudiante implements PoliticaPrestamo {
    public boolean aplicaA(Usuario u) { return "ESTUDIANTE".equals(u.getTipo()); }
    public int diasPermitidos()       { return 7; }
    public int maximoEjemplares()     { return 3; }
    public BigDecimal tarifaDiaria()  { return new BigDecimal("2.0"); }
}
