package bo.edu.usfx.biblioteca.infraestructura;

import bo.edu.usfx.biblioteca.dominio.Notificador;

public class NotificadorSmtp implements Notificador {
    private String host;
    private int puerto;

    public NotificadorSmtp(String host, int puerto) {
        this.host = host;
        this.puerto = puerto;
    }

    @Override
    public void notificar(String destino, String asunto, String mensaje) {
        System.out.println("Enviando correo real a " + destino);
    }
}
