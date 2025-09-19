
package UML.Ejercicio3;

public class Autor {
     // =======================
    // Propiedades privadas
    // =======================
    String nombre;
    String nacionalidad;
    
    // =======================
    // Constructores
    // =======================
    
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Autor{"
                + "nombre: " + nombre + ", "
                + "nacionalidad: " + nacionalidad 
                + "}";
        return str;
    }

 
}
