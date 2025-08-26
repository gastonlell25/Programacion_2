/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.POO;

/**
 *
 * @author gastonlell
 */
public class Mascota {
    String nombre, especie;
    int  edad;
    
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo() {
        System.out.println("\n=== INFORMACIÓN DE MASCOTA===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("==============================");
    }
    
    public void cumplirAnios() {
        edad += 1;
    }
}
