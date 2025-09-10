package POO2;

public class Main {
    public static void main(String[] args) {
        // Crear empleados con distintos constructores
        Empleado e1 = new Empleado("Juan Pérez", "Programador", 3000);
        Empleado e2 = new Empleado("Ana Gómez", "Diseñadora", 3050);
        Empleado e3 = new Empleado("Luis Torres", "Analista");

        // Mostrar empleados
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Actualizar salarios
        e1.actualizarSalario(500.5); // aumento fijo
        e2.actualizarSalario(10);  // aumento por porcentaje

        // Mostrar empleados actualizados
        System.out.println("Después de los aumentos:");
        System.out.println(e1);
        System.out.println(e2);

        // Mostrar total empleados
        Empleado.mostrarTotalEmpleados();
    }
}

