package bo.edu.usfx.biblioteca.dominio;
import java.time.LocalDate;

public interface Renovable {
    LocalDate renovar(LocalDate limiteActual);
}