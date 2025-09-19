package UML.Ejercicio6;

public class Reserva {
    // =======================
    // Propiedades privadas
    // =======================
    private String fecha;
    private String hora;
    private Mesa mesa;
    private Cliente cliente;

    // =======================
    // Constructores
    // =======================

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa; // agregación
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Reserva{"
                + "fecha: " + fecha + ", "
                + "hora: " + hora
                + "}";
        return str;
    }

}
