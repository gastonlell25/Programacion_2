package UML.Ejercicio14;

public class Proyecto {
    // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private Double duracionMin;

    // =======================
    // Constructor
    // =======================
    public Proyecto(String nombre, Double duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // =======================
    // Metodos getters y setters
    // =======================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Double duracionMin) {
        this.duracionMin = duracionMin;
    }

    // =======================
    // Metodos utilitarios
    // =======================
    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }
    
    
}
