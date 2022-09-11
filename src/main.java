import javax.swing.*;

public class main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Libreria libreria = new Libreria();
        String opcion = "";
        String nombre, autor, categoria;

        while (!opcion.equals("4")) {
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

                    if (libreria.insertar(libro) && (!nombre.isEmpty() || !autor.isEmpty() || !categoria.isEmpty())) {
                        libro = new Libro(true, nombre, autor, categoria);
                        JOptionPane.showMessageDialog(null, "El libro fue agregado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El libro no fue agregado.");
                    }

                    break;
                case "2":
                    autor = JOptionPane.showInputDialog("Autor del Libro.");

                    libro = libreria.buscarPorAutor(autor);

                    JOptionPane.showMessageDialog(null, String.format(
                            libro.getTitulo() + ".\n" +
                                    libro.getAutor() + ".\n" +
                                    libro.getCategoria() + ".\n" +
                                    libro.isDisponible() + "."));

                    break;
                case "3":

                    break;
                default:

                    break;
            }
        }
    }
}
