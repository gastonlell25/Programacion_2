package UML.Ejercicio8;
import java.time.LocalDateTime;
import java.util.UUID;

public class FirmaDigital {
    // =======================
    // Propiedades privadas
    // =======================
    private String codigoHash;
    private LocalDateTime fecha;
    private Usuario usuario;

    // =======================
    // Constructor
    // =======================    
    public FirmaDigital() {
        this.codigoHash = UUID.randomUUID().toString();
        this.fecha = LocalDateTime.now();
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // =======================
    // Métodos utilitarios
    // =======================
    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + '}';
    }
}
