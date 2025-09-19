package UML.Ejercicio11;

public class Artista {
    // =======================
    // Propiedades privadas
    // =======================    
    private String nombre;
    private String genero;
    
    // =======================
    // Constructor
    // =======================
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    // =======================
    // Metodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
    
}
