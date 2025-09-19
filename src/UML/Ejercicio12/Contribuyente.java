package UML.Ejercicio12;

public class Contribuyente {
    // =======================
    // Propiedades privadas
    // =======================    
    private String nombre;
    private String cuit;
    
    // =======================
    // Constructor
    // =======================
    public Contribuyente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    // =======================
    // Metodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre=" + nombre + ", cuit=" + cuit + '}';
    }
    

}
