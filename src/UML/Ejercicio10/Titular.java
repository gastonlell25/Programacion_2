package UML.Ejercicio10;

public class Titular {
    // =======================
    // Metodos privados
    // =======================
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;
    
    // =======================
    // Constructor
    // =======================
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // =======================
    // Metodos getters y setters
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

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }
    
    // =======================
    // Metodos utilitarios
    // =======================
    @Override
    public String toString() {
        String str = "Paciente{" + "nombre=" + nombre + ", dni=" + dni + '}';
        
        if(cuentaBancaria != null) {
            str += "\n " + cuentaBancaria;
        }
        
        return str;
    }
}
