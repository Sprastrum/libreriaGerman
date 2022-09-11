public class Libro {
    private boolean disponible;
    private String titulo, autor, categoria;

    public Libro(boolean disponible, String titulo, String autor, String categoria) {
        this.disponible = disponible;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public Libro() {

    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }
}
