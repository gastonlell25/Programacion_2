package UML.Ejercicio6;

public class Cliente {
    // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private String telefono;

    // =======================
    // Constructores
    // =======================

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Cliente{"
                + "nombre: " + nombre + ", "
                + "telefono: " + telefono
                + "}";
        return str;
    }
}
