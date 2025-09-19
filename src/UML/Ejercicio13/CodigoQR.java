package UML.Ejercicio13;

public class CodigoQR {
    // =======================
    // Propiedades privadas
    // =======================    
    private String valor;
    private Usuario usuario;

    // =======================
    // Constructor
    // =======================
    public CodigoQR(String valor) {
        this.valor = valor;
    }
    // =======================
    // Metodos getters y setters
    // =======================
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    // =======================
    // Metodos utilitarios
    // =======================
    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
    
    
}
