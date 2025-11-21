/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_y_excepciones;

import interfaces_y_excepciones.ecommerce.Cliente;
import interfaces_y_excepciones.ecommerce.Pedido;
import interfaces_y_excepciones.ecommerce.Producto;
import interfaces_y_excepciones.ecommerce.TarjetaCredito;
import interfaces_y_excepciones.exceptions.ConversionCadenaNumero;
import interfaces_y_excepciones.exceptions.DivisionSegura;
import interfaces_y_excepciones.exceptions.LecturaArchivo;
import interfaces_y_excepciones.exceptions.LecturaTryResources;
import interfaces_y_excepciones.exceptions.TestEdad;

/**
 *
 * @author gastonlell
 */
public class main {
    public static void main(String[] args) {
        // Ejercicio 1 - E-commerce
        
        Cliente cliente = new Cliente("Gastón");

        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        double total = pedido.calcularTotal();
        System.out.println("Total pedido: $" + total);

        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);

        tarjeta.procesarPago(totalConDescuento);

        cliente.notificar("Tu pedido ha sido pagado con éxito.");
        
        
        // Ejercicio 2
        
        System.out.println("=== Ejercicio 1: División segura ===");
        DivisionSegura divisionSegura = new DivisionSegura();
        divisionSegura.main();
        
        System.out.println("\n=== Ejercicio 2: Conversión de cadena a número ===");
        ConversionCadenaNumero conversion = new ConversionCadenaNumero();
        conversion.main();
        
        System.out.println("\n=== Ejercicio 3: Lectura de archivo ===");
        LecturaArchivo lecturaArchivo = new LecturaArchivo();
        lecturaArchivo.main();
        
        System.out.println("\n=== Ejercicio 4: Excepción personalizada de edad ===");
        TestEdad testEdad = new TestEdad();
        testEdad.main();
        
        System.out.println("\n=== Ejercicio 5: try-with-resources ===");
        LecturaTryResources lecturaTryResources = new LecturaTryResources();
        lecturaTryResources.main();
    }
}
