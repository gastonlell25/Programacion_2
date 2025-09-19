package UML.Ejercicio10;
import java.util.Random;
import java.text.DecimalFormat;

public class CuentaBancaria {
    // =======================
    // Metodos privados
    // =======================
    private String cbu;
    private Double saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;
    
    // =======================
    // Constructor
    // =======================

    public CuentaBancaria(String claveSeguridad) {
        this.cbu = generarCBU();
        this.saldo = 0.0;
        this.claveSeguridad = new ClaveSeguridad(claveSeguridad);
    }

    
    // =======================
    // Metodos getters y setters
    // =======================

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        
        if(titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    
    // =======================
    // Metodos utilitarios
    // =======================

    @Override
    public String toString() {
        DecimalFormat formatSaldo = new DecimalFormat("#,###.##");
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + formatSaldo.format(saldo) + '}';
    }

    public static String generarCBU() {
        Random random = new Random();
        StringBuilder cbu = new StringBuilder();

        for (int i = 0; i < 17; i++) {
            int digit = random.nextInt(10);
            cbu.append(digit);
        }

        return cbu.toString();
    }
}
