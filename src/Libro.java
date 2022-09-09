public class Libro {
    public boolean disponible;
    public String titulo, autor, categoria;

    public Libro(boolean disponible, String titulo, String autor, String categoria) {
        this.disponible = disponible;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
}
