package UML.Ejercicio13;
import java.util.UUID;

public class main {
    public static void main(String[] args) {
        Usuario usuario12 = new Usuario("Gerardo", "gera@gmail.com");
        
        GeneradorQR generadorQR = new GeneradorQR();
        
        generadorQR.generar(UUID.randomUUID().toString(), usuario12);
        
    }
}
