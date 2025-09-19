package UML.Ejercicio13;

public class Usuario {
     // =======================
    // Propiedades privadas
    // =======================    
    private String nombre;
    private String email;
    
    // =======================
    // Constructor
    // =======================
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // =======================
    // Metodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    

}
