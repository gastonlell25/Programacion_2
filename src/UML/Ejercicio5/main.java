package UML.Ejercicio5;
import java.util.UUID;
public class main {
    public static void main(String[] args) {
        //Crear cliente
        Propietario propietario1 = new Propietario("Gaspar", "42123456");
        
        //Crear tarjeta
        Computadora computadora1 = new Computadora("1234567812345678", UUID.randomUUID().toString(), "ASUS Prime", "Intel Z790");
        
        // ver tarjeta
        System.out.println(propietario1);
        
        // ver cleinte
        System.out.println(computadora1);
        
        // asociar propietario y computadora
        propietario1.setComputadora(computadora1);
        
        // check computadora de propietario 1
        System.out.println(propietario1.getComputadora());
        
    }
}
