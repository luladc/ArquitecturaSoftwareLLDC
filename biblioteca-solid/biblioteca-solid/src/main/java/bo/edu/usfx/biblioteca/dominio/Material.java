package bo.edu.usfx.biblioteca.dominio;

public sealed interface Material permits LibroGeneral, Revista, LibroReferencia {
    String signatura();
    String titulo();
}