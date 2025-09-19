package UML.Ejercicio3;

public class Editorial {
    // =======================
    // Propiedades privadas
    // =======================
    String nombre;
    String direccion;
    
    // =======================
    // Constructores
    // =======================

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Autor{"
                + "nombre: " + nombre + ", "
                + "direccion: " + direccion
                + "}";
        return str;
    }
    
}
