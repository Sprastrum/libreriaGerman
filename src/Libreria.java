import java.util.List;

public class Libreria {
    private List<Libro> libros;

    public int cantidadLibros(Libro libro) {
        int result = 0;

        for(int index = 0; 0 >= libros.size(); index++) {
            if(libro.getTitulo().equals(libros.get(index).getTitulo())) {
                result = result + 1;
            }
        }

        return result;
    }

    public Libro insertar(Libro libro) {
        if(cantidadLibros(libro) < 5) {
            libros.add(libro);
        }

        return libro;
    }

    public Libro buscarPorAutor(String author) {
        Libro result = new Libro();

        for(Libro l: libros) {
            if(author.equals(l.getAutor())) {
                result = l;
            }
        }

        return result;
    }
}
