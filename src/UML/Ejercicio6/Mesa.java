package UML.Ejercicio6;

public class Mesa {
    // =======================
    // Propiedades privadas
    // =======================
    private int numero;
    private int capacidad;
    

    // =======================
    // Constructores
    // =======================

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public int getNumero() {
        return numero;
    }

    public void setNumero(int modelo) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Mesa{"
                + "numero: " + numero + ", "
                + "capacidad: " + capacidad
                + "}";
        return str;
    }

}
