package UML.Ejercicio6;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        //Crear cliente
        Cliente cliente1 = new Cliente("Gaspar", "42123456");
        Mesa mesa1 = new Mesa(1, 10);
        //Crear tarjeta
        Reserva reserva1 = new Reserva("20/03/2025", "20:00", mesa1);
        
        reserva1.setCliente(cliente1); // asociacion
        
        // ver reserva
        System.out.println(cliente1);
        
        // ver cleinte
        System.out.println(reserva1);
        
    }
}
