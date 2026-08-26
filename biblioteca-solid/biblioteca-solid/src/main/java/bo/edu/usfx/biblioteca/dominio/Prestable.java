package bo.edu.usfx.biblioteca.dominio;
import java.time.LocalDate;

public interface Prestable {
    LocalDate prestar(LocalDate hoy);
}
