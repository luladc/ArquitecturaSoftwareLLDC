package bo.edu.usfx.biblioteca.dominio.roles;
public interface Prestable { 
    void prestar(String codigoUsuario); 
    void devolver(String codigoUsuario); 
}