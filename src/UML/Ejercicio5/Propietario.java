package UML.Ejercicio5;


public class Propietario {
    // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private String dni;
    private Computadora computadora;

    // =======================
    // Constructores
    // =======================

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        
        if(computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }
    

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Propietario{"
                + "nombre: " + nombre + ", "
                + "dni: " + dni
                + "}";
        return str;
    }
}
