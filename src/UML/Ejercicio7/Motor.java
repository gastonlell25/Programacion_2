package UML.Ejercicio7;

public class Motor {
    // =======================
    // Métodos privados
    // =======================
    private String tipo;
    private String numeroSerie;

    // =======================
    // Constructor
    // =======================
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    // =======================
    // Métodos utilitarios
    // =======================
    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    }
    
    
}
