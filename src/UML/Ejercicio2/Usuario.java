package UML.Ejercicio2;

public class Usuario {
    // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private String dni;
    private Celular celular;
    
    // =======================
    // Constructores
    // =======================
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
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
    
    
    public String getDni() {
        return dni;
    };
    
    public void setDni(String dni){
        this.dni = dni;
    };

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Usuario{dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular.getMarca() +  celular.getModelo() + '\'' +
              "}";
    }
}
