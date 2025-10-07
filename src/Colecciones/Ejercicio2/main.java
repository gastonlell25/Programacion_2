package Colecciones.Ejercicio2;

public class main {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Popular");

        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Julio Cortázar", "Argentina");
        Autor autor3 = new Autor("A003", "Mario Vargas Llosa", "Peruana");

        // 3. Agregar 5 libros asociados a alguno de los autores
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El coronel no tiene quien le escriba", 1961, autor1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN004", "La ciudad y los perros", 1962, autor3);
        biblioteca.agregarLibro("ISBN005", "Conversación en La Catedral", 1969, autor3);

        System.out.println("\n-------------------------------------");

        // 4. Listar todos los libros con su información y la del autor
        biblioteca.listarLibros();

        System.out.println("\n-------------------------------------");

        // 5. Buscar un libro por su ISBN y mostrar su información
        System.out.println("Buscando libro con ISBN 'ISBN003':");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro con ese ISBN.");
        }

        System.out.println("\n-------------------------------------");

        // 6. Filtrar y mostrar los libros publicados en un año específico
        int anioFiltro = 1967;
        System.out.println("Libros publicados en el año " + anioFiltro + ":");
        biblioteca.filtrarLibrosPorAnio(anioFiltro).forEach(Libro::mostrarInfo);

        System.out.println("\n-------------------------------------");

        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("Eliminando libro con ISBN 'ISBN002'...");
        biblioteca.eliminarLibro("ISBN002");
        System.out.println("Libros después de la eliminación:");
        biblioteca.listarLibros();

        System.out.println("\n-------------------------------------");

        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("Cantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        System.out.println("\n-------------------------------------");

        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        biblioteca.mostrarAutoresDisponibles();
    }
}
