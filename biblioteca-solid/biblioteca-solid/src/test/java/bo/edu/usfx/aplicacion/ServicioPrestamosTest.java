package bo.edu.usfx.biblioteca.aplicacion;

import bo.edu.usfx.biblioteca.dominio.Notificador;
import bo.edu.usfx.biblioteca.dominio.PoliticaEstudiante;
import bo.edu.usfx.biblioteca.dominio.RepositorioPrestamos;
import bo.edu.usfx.biblioteca.dominio.Libro;
import bo.edu.usfx.biblioteca.dominio.Prestamo;
import bo.edu.usfx.biblioteca.dominio.Usuario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServicioPrestamosTest {

    @Mock private RepositorioPrestamos repositorio;
    @Mock private Notificador notificador;

    @Test
    @DisplayName("registra el prestamo y notifica al estudiante")
    void registraYNotifica() {
        when(repositorio.activosDe(any())).thenReturn(List.of());
        
        ServicioPrestamo servicio = new ServicioPrestamo(
            repositorio, notificador, new PoliticaEstudiante());
            
        Usuario ana = new Usuario("218123", "Ana Quispe", "ana@usfx.bo", "ESTUDIANTE");
        Libro libro = new Libro("005.1 M379c", "Clean Architecture", "R. C. Martin");
        
        Prestamo prestamo = servicio.registrar(ana, libro, LocalDate.of(2026, 8, 25));
        
        assertThat(prestamo.getFechaLimite()).isEqualTo(LocalDate.of(2026, 9, 1));
        verify(repositorio).guardar(prestamo);
        verify(notificador).notificar(eq("ana@usfx.bo"), anyString(), anyString());
    }
}
