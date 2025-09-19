package UML.Ejercicio4;

public class Cliente {
   // =======================
    // Propiedades privadas
    // =======================
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;

    // =======================
    // Constructores
    // =======================

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        
        if(tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }
    
    

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Cliente{"
                + "nombre: " + nombre + ", "
                + "dni: " + dni
                + "}";
        return str;
    }
}
