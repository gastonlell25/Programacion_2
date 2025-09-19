package UML.Ejercicio4;

public class Banco {
    // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private String cuit;
    
    // =======================
    // Constructores
    // =======================
    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
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

    public String getCuit() {
        return cuit;
    }

    public void setcuit(String cuit) {
        this.cuit = cuit;
    }

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Banco{"
                + "nombre: " + nombre + ", "
                + "cuit: " + cuit
                + "}";
        return str;
    }
    
}
