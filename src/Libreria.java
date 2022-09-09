import java.util.List;

public class Libreria {
    private List<Libro> libros;

    public void cantidadLibros() {
    }
    public Libro buscarCategoria(Libro libro, String categoria) {
        for(Libro l: libros) {
            if(libro.getCategoria().equals(categoria)) {
                System.out.println(libro.getTitulo());
            }
        }
        return null;
    }
    public Libro insert() {
        return null;
    }
}
