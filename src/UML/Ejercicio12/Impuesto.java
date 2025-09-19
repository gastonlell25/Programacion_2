package UML.Ejercicio12;

public class Impuesto {
    // =======================
    // Propiedades privadas
    // =======================
    private Double monto;
    private Contribuyente contribuyente;
    
    // =======================
    // Constructor
    // =======================
    public Impuesto(Double monto) {
        this.monto = monto;
    }

    // =======================
    // Metodos getters y setters
    // =======================
    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    // =======================
    // Metodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + '}';
    }
    
    
}
