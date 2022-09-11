import javax.swing.*;
import java.util.*;

public class Libreria {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public int cantidadLibros(Libro libro) {
        int resultado = 0;

        for (int index = 0; index < libros.size(); index++) {
            if (libro.getTitulo().equals(libros.get(index).getTitulo())) {
                resultado = resultado + 1;
            }
        }

        return resultado;
    }

    public boolean insertar(Libro libro) {
        boolean resultado = false;

        if(cantidadLibros(libro) < 5) {
            libros.add(libro);
            resultado = true;
        }

        return resultado;
    }

    public Libro buscarPorAutor(String author) {
        Libro resultado = new Libro();

        for (Libro l : libros) {
            if (author.equals(l.getAutor())) {
                resultado = l;
            }
        }

        return resultado;
    }

    public Libro buscarCategoria(String categoria) {
        Libro resultado = new Libro();

        for(Libro l: libros) {
            if(l.getCategoria().equals(categoria)) {
                resultado = l;
            }
        }

        return resultado;
    }
}
