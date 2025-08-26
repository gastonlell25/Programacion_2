package programacion.POO;

/**
 *
 * @author gastonlell
 */
public class Main {
    
    public static void main(String[] args) {
        // ESTUDIANTE
        Estudiante estudiante1 = new Estudiante("Gaston", "Lell", "Programación", 8.00);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(2.50);
        estudiante1.mostrarInfo();
        
        System.out.println("\n=== === === === ===");
        
        // MASCOTA
        Mascota perro = new Mascota("Galo", "Perro", 1);
        perro.mostrarInfo();
        
        System.out.println("Paso de dos anios");
        perro.cumplirAnios();
        perro.cumplirAnios();
        
        perro.mostrarInfo();
        
        System.out.println("\n=== === === === ===");

        // LIBRO
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        libro.mostrarInformacion();
        libro.setAnioPublicacion(2030); // Año futuro (inválido)
        libro.setAnioPublicacion(1970); // Año válido
        
        libro.mostrarInformacion();
        System.out.println("\n=== ACCESO A LIBRO A TRAVÉS DE GETTERS ===");
        System.out.println("Título (getter): " + libro.getTitulo());
        System.out.println("Autor (getter): " + libro.getAutor());
        System.out.println("Año (getter): " + libro.getAñoPublicacion());
        
        
        // GALLINERO DIGITAL
        
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        gallina2.envejecer();
        gallina2.ponerHuevo();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
    }
}
