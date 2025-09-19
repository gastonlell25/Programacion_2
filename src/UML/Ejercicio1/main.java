
package UML.Ejercicio1;
import java.util.UUID;

public class main {
    public static void main(String[] args) {
        // crear titular
        Titular usuario1 = new Titular("Gaston", "20345345");
        
        Pasaporte pasaporteUsuario1 = new Pasaporte(UUID.randomUUID().toString(), "https://imagen.com");
        
        // usuario sin pasaporte
        System.out.println(usuario1.toString());
        usuario1.setPasaporte(pasaporteUsuario1);
        
        // usuario con pasaporte
        System.out.println(usuario1.toString());
        
        // pasaporte
        System.out.println(pasaporteUsuario1.toString());
        
    }
}
