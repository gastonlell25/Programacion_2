package UML.Ejercicio9;

public class Profesional {
    // =======================
    // Metodos privados
    // =======================
    private String nombre;
    private String especialidad;
    
    // =======================
    // Constructor
    // =======================
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // =======================
    // Metodos utilitarios
    // =======================
    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
}
