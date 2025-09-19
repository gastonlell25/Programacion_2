package UML.Ejercicio8;

public class Usuario {
    // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private String email;
    
    // =======================
    // Constructores
    // =======================
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================

    public String getNombre() {
        return nombre;
    };
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    };
    
    
    public String getEmail() {
        return email;
    };
    
    public void setEmail(String email){
        this.email = email;
    };

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Usuario{email=" + email +
                ", nombre='" + nombre + '\'' +
              "}";
    }
}
