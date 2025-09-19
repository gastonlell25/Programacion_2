package UML.Ejercicio1;
import java.time.LocalDate;

public class Pasaporte {
    // =======================
    // Propiedades privadas
    // =======================
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;
    private Titular titular; // Asociacion 1 a 1

    // =======================
    // Constructores
    // =======================
    public Pasaporte(String numero, String imagen) {
        this.numero = numero;
        this.fechaEmision = LocalDate.now();
        this.foto = new Foto(imagen, "jpg");
    }
    
    // =======================
    // Métodos getters y setters
    // =======================

    public String getNumero() {
        return numero;
    };
    
    public void setNumero(String numero){
        this.numero = numero;
    };
    
    public String getFechaEmision() {
        return fechaEmision.toString();
    };
    
    public void setFechaEmision(LocalDate fechaEmision){
        this.fechaEmision = fechaEmision;
    };
    
    public Foto getFoto() {
        return foto;
    };
    
    public void setFoto(String imagen){
        this.foto = new Foto(imagen, "jpg");
    };
    
    public Titular getTitular() {
        return titular;
    };
    
    public void setTitular(Titular titular){
        this.titular = titular;
        
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    };
    
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Pasaporte{numero=" + numero +
                ", emision='" + fechaEmision.toString() + '\'' +
              "}";
    }
}
