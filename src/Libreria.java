import javax.swing.*;
import java.util.*;

public class Libreria {
    private ArrayList<Libro> libros = new ArrayList<Libro>();
    private ArrayList<Libro> resultado = new ArrayList<Libro>();

    public int cantidadLibros(Libro libro) {
        int resultado = 0;

        for (Libro l : libros) {
            if (libro.getTitulo().equals(l.getTitulo())) {
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

    public ArrayList<Libro> buscarPorAutor(String author) {
        resultado.clear();

        for (Libro l : libros) {
            if (author.equals(l.getAutor())) {
                resultado.add(l);
            }
        }

        return resultado;
    }

    public ArrayList<Libro> buscarCategoria(String categoria) {
        resultado.clear();

        for(Libro l: libros) {
            if(categoria.equals(l.getCategoria())) {
                resultado.add(l);
            }
        }

        return resultado;
    }
}
