package UML.Ejercicio3;
import java.util.UUID;
public class main {
    public static void main(String[] args) {
        // crear autor
        Autor julito = new Autor("Juio Cortázar", "Argentina");
        
        // crear editorial
        Editorial editorial1 = new Editorial("Alfaguara", "Perón 255");
        
        // crear libro agregando editorial
        Libro libro1 = new Libro("Rayuela", UUID.randomUUID().toString(), editorial1);
        
        // asociar autor
        libro1.setAutor(julito);
    }
}
