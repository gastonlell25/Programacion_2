/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_polimorfismo;

import herencia_polimorfismo.Ejercicio_1.Auto;
import herencia_polimorfismo.Ejercicio_1.Vehiculo;
import herencia_polimorfismo.Ejercicio_2.Circulo;
import herencia_polimorfismo.Ejercicio_2.Figura;
import herencia_polimorfismo.Ejercicio_2.Rectangulo;
import herencia_polimorfismo.Ejercicio_3.Empleado;
import herencia_polimorfismo.Ejercicio_3.EmpleadoPlanta;
import herencia_polimorfismo.Ejercicio_3.EmpleadoTemporal;
import herencia_polimorfismo.Ejercicio_4.Animal;
import herencia_polimorfismo.Ejercicio_4.Gato;
import herencia_polimorfismo.Ejercicio_4.Perro;
import herencia_polimorfismo.Ejercicio_4.Vaca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gastonlell
 */
public class main {
    public static void main(String[] args){
        // Ejercicio 1
        Vehiculo nivus = new Auto("2024", "Volkswagen", 5);
        nivus.mostrarInfo();
        
        
        // Ejercicio 2
          Figura[] figuras = new Figura[] {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(2.5),
            new Rectangulo(3, 8)
        };

        for (Figura f : figuras) {
            System.out.println(
                f.getNombre() + "Radio: " +  f.mostrarDatos() + " - Área: " + f.calcularArea()
            );
        }
        
        
        // Ejercicio 3
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 200000));
        empleados.add(new EmpleadoTemporal("Luis", 120, 1500));
        empleados.add(new EmpleadoPlanta("Sofía", 250000));
        empleados.add(new EmpleadoTemporal("Juan", 80, 1700));

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() +
                " | Tipo: " + tipoEmpleado(e) +
                " | Sueldo: " + e.calcularSueldo()
            );
        }
        
        
        // Ejercicio 4
        
        List<Animal> animales = new ArrayList<>();
        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Vaca());
        
        for ( Animal a : animales ) {
            
            System.out.println("Soy un " + a.getClass().getSimpleName() + " " + a.hacerSonido());
        }
    }
    

    // Clasificación usando instanceof
    public static String tipoEmpleado(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return "Planta";
        } else if (e instanceof EmpleadoTemporal) {
            return "Temporal";
        } else {
            return "Desconocido";
        }

    }
    
    
}
