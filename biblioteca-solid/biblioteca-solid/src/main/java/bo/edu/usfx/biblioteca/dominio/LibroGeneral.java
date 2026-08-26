package bo.edu.usfx.biblioteca.dominio;

import java.time.LocalDate;

public record LibroGeneral(String signatura, String titulo) implements Material, Prestable, Renovable {
    public LocalDate prestar(LocalDate hoy) { return hoy.plusDays(7); }
    public LocalDate renovar(LocalDate limiteActual) { return limiteActual.plusDays(7); }
}
