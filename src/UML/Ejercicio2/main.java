
package UML.Ejercicio2;
import java.util.UUID;

public class main {
    
    public static void main(String[] args) {
        //Crear un usuario
        Usuario usuario1 = new Usuario("Pepito", "20345345");
        
        // Crear modelo de bateria
        Bateria bateria3000 = new Bateria("Power3000", 400);
        
        // Crear celular
        Celular sungsamA20 = new Celular(UUID.randomUUID().toString(), "sungsam", "A20", bateria3000);
        
        usuario1.setCelular(sungsamA20);
        
        System.out.println(usuario1.toString());
        System.out.println(sungsamA20.toString());
    }
}
