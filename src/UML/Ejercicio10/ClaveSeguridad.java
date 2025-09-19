package UML.Ejercicio10;
import java.time.LocalDateTime;

public class ClaveSeguridad {
    // ==========================
    // Metodos privados
    // ==========================
    private String codigo;
    private LocalDateTime ultimaModificacion;

    // ==========================
    // Constructor
    // ==========================
    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = LocalDateTime.now();
    }

    // ==========================
    // Metodos getters y setters
    // ==========================
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
        setUltimaModificacion(LocalDateTime.now());
    }

    public LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
    
    // ==========================
    // Metodos utilitarios
    // ==========================

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
    
    
}
