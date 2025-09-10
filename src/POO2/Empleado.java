package POO2;

/**
 * Clase que representa a un empleado de una empresa.
 * Cada empleado tiene un id único, nombre, puesto y salario.
 * El total de empleados creados se contabiliza en una variable estática.
 */
public class Empleado {
    // =======================
    // Atributos privados
    // =======================
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // =======================
    // Constructores
    // =======================

    /**
     * Constructor privado que asigna el id único al empleado.
     * Se utiliza solo para encadenamiento con otros constructores.
     * 
     * @param id identificador único del empleado
     */
    private Empleado(int id) {
        this.id = id;
    }

    /**
     * Constructor que inicializa un empleado con todos sus atributos.
     * El id se asigna automáticamente en base al contador global.
     * 
     * @param nombre  nombre completo del empleado
     * @param puesto  puesto que desempeña
     * @param salario salario inicial
     */
    public Empleado(String nombre, String puesto, double salario) {
        this(++Empleado.totalEmpleados); // asigna id único automáticamente
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    /**
     * Constructor que inicializa un empleado con nombre y puesto.
     * El id se asigna automáticamente y el salario se inicializa por defecto.
     * 
     * @param nombre nombre completo del empleado
     * @param puesto puesto que desempeña
     */
    public Empleado(String nombre, String puesto) {
        this(++Empleado.totalEmpleados); // asigna id único automáticamente
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 2000; // salario por defecto
    }

    // =======================
    // Métodos getters y setters
    // =======================

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    // =======================
    // Métodos sobrecargados
    // =======================

    /**
     * Aumenta el salario en una cantidad fija.
     *
     * @param montoAumento cantidad fija a sumar al salario
     */
    public void actualizarSalario(double montoAumento) {
        this.salario += montoAumento;
    }

    /**
     * Aumenta el salario en un porcentaje.
     *
     * @param porcentaje porcentaje a aumentar (ejemplo: 10 representa un 10%)
     */
    public void actualizarSalario(int porcentaje) {
        this.salario += (this.salario * porcentaje) / 100.0;
    }

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Empleado{id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario + "}";
    }

    /**
     * Muestra en consola el total de empleados creados hasta el momento.
     */
    public static void mostrarTotalEmpleados() {
        System.out.println("Total empleados: " + Empleado.totalEmpleados);
    }
}
