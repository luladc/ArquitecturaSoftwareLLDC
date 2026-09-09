package bo.edu.usfx.biblioteca.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface PoliticaPrestamo {
    boolean aplicaA(Usuario usuario);
    int diasPermitidos();
    int maximoEjemplares();
    BigDecimal tarifaDiaria();
    
    // Método OCP original para la multa
    default BigDecimal multa(long diasRetraso) {
        if (diasRetraso <= 0) return BigDecimal.ZERO;
        BigDecimal calculada = tarifaDiaria().multiply(BigDecimal.valueOf(diasRetraso));
        return calculada.min(TOPE); // el tope sigue siendo Bs 200
    }
    
    BigDecimal TOPE = new BigDecimal("200");

    // --- MÉTODOS FALTANTES PARA SERVICIO PRESTAMOS ---
    
    default LocalDate fechaLimite(LocalDate hoy) {
        // Calcula la fecha sumando los días permitidos que define cada política
        return hoy.plusDays(diasPermitidos());
    }

    default void validar(Usuario usuario, List<Prestamo> activos, Libro libro) {
        // Valida que no exceda el máximo de ejemplares de su política
        if (activos.size() >= maximoEjemplares()) {
            throw new IllegalStateException("limite de " + maximoEjemplares());
        }
    }
}
