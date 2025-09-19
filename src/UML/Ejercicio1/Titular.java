
package UML.Ejercicio1;

public class Titular {
    // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    
    // =======================
    // Constructores
    // =======================
    public Titular(String nombre, String dni) {
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

    public Pasaporte getPasaporte() {
        return pasaporte;
    };
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    };
    
    
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String imprimir = "Titular{DNI=" + dni +
                ", nombre='" + nombre + '\'' +
              "}";
        if (pasaporte != null) {
            imprimir = imprimir.substring(0, imprimir.length() -1) + ", pasaporte='" + pasaporte.getNumero() + '\'' + " }";
        }
        
        return imprimir;
    }
}
