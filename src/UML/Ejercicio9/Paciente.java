package UML.Ejercicio9;

public class Paciente {
    // =======================
    // Metodos privados
    // =======================
    private String nombre;
    private String obraSocial;
    
    // =======================
    // Constructor
    // =======================
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
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

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }
    
    // =======================
    // Metodos utilitarios
    // =======================
    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", obraSocial=" + obraSocial + '}';
    }
}
