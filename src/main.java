import javax.swing.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<Libro>();
        Libro libro = new Libro();
        Libreria libreria = new Libreria();
        String opcion = "";
        String nombre, autor, categoria, resultado;

        while (!opcion.equals("4")) {
            nombre = "";
            autor = "";
            categoria = "";
            resultado = "";
            opcion = JOptionPane.showInputDialog(
                    "Aplicación de la librería, por favor seleccione una opción.\n" +
                            "1. Agregar libro.\n" +
                            "2. Buscar libro por autor.\n" +
                            "3. Buscar libro por categoría.\n" +
                            "4. Salir.");
            switch (opcion) {
                case "1":
                    nombre = JOptionPane.showInputDialog("Nombre del Libro.");
                    autor = JOptionPane.showInputDialog("Autor del Libro.");
                    categoria = JOptionPane.showInputDialog("Categoria del Libro.");

                    libro = new Libro(true, nombre, autor, categoria);

                    if (!nombre.isEmpty() && !autor.isEmpty() && !categoria.isEmpty()) {
                        libreria.insertar(libro);
                        JOptionPane.showMessageDialog(null, "El libro fue agregado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El libro no fue agregado.");
                    }
                    break;
                case "2":
                    autor = JOptionPane.showInputDialog("Autor del Libro.");

                    libros = libreria.buscarPorAutor(autor);

                    for(Libro l : libros) {
                        resultado += String.format(
                                        l.getTitulo() + ".\n" +
                                        l.getAutor() + ".\n" +
                                        l.getCategoria() + ".\n" +
                                        l.isDisponible() + ".\n\n");
                    }

                    JOptionPane.showMessageDialog(null, resultado);
                    resultado = "";
                    break;
                case "3":
                    resultado = JOptionPane.showInputDialog("Categoria del Libro.");

                    libros = libreria.buscarPorAutor(categoria);

                    for(int index = 0; index < libros.size(); index++) {
                        resultado +=
                                libros.get(index).getTitulo() + ".\n" +
                                        libros.get(index).getAutor() + ".\n" +
                                        libros.get(index).getCategoria() + ".\n" +
                                        libros.get(index).isDisponible() + ".\n\n";
                    }

                    JOptionPane.showMessageDialog(null, resultado);
                    resultado = "";
                    break;
                case "4":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");
                    break;
            }
        }
    }
}
