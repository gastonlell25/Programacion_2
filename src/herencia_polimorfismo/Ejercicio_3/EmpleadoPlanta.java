/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_polimorfismo.Ejercicio_3;

/**
 *
 * @author gastonlell
 */
public class EmpleadoPlanta extends Empleado {
    private double salarioMensual;

    public EmpleadoPlanta(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }
}
