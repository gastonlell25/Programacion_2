package Colecciones.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    // ------------------- Métodos requeridos -------------------

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            System.out.println("Libros en la biblioteca:");
            libros.forEach(Libro::mostrarInfo);
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        return libros.stream()
                     .filter(l -> l.getIsbn().equals(isbn))
                     .findFirst()
                     .orElse(null);
    }


    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro == null) {
            System.out.println("No se encontró un libro con ISBN: " + isbn);
            return false;
        }
        
        libros.remove(libro);
        System.out.println("Libro eliminado: " + libro.getTitulo());
        return true;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        return libros.stream()
                     .filter(l -> l.getAnioPublicacion() == anio)
                     .collect(Collectors.toUnmodifiableList());
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles en la biblioteca:");
        libros.stream()
              .map(l -> l.getAutor().getNombre())
              .distinct()
              .forEach(System.out::println);
    }
}
