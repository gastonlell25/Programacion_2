package UML.Ejercicio4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TarjetaDeCredito {
    // =======================
    // Propiedades privadas
    // =======================
    private String numero;
    private String fechaVencimiento;
    private Banco banco; //agregación
    private Cliente cliente; // asociacion

    // =======================
    // Constructores
    // =======================

    public TarjetaDeCredito(String numero, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = calcularFechaVencimiento();
        this.banco = banco;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setDireccion(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        
        if(cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "TarjetaDeCredito{"
                + "numero: " + numero + ", "
                + "fecha de vencimiento: " + fechaVencimiento
                + "}";
        return str;
    }
    
    private String calcularFechaVencimiento() {
        // Fecha de hoy
        LocalDate hoy = LocalDate.now();

        // Sumar 5 años
        LocalDate fechaFutura = hoy.plusYears(5);

        // Formatear a mm/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");

        return fechaFutura.format(formatter);
    }
}
