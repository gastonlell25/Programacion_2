package programacion.POO;
import java.util.UUID;
/**
 *
 * @author gastonlell
 */
public class Gallina {
    String idGallina;
    int edad;
    int huevosPuestos;

    public Gallina () {
        this.idGallina = UUID.randomUUID().toString();
        this.edad = 1;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo() {
        huevosPuestos += 1;
    }
    
    public void envejecer() {
        edad += 1;
    }
    
    
    public void mostrarEstado() {
        System.out.println("\n=== INFORMACIÓN DEL GALLINA===");
        System.out.println("Identificador: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("==============================");
    }
}
