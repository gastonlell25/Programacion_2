/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_polimorfismo.Ejercicio_2;

/**
 *
 * @author gastonlell
 */
public abstract class Figura {
    protected String nombre;
    
    Figura(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularArea();
    public abstract String mostrarDatos();
}
