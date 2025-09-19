package UML.Ejercicio10;

public class main {
    public static void main (String[] args) {
        // Crear usuario
        Titular pedro = new Titular("Pedro", "34567804");
        
        // Crear cuenta bancaria
        CuentaBancaria cuentaDePedro = new CuentaBancaria("Pedro1234");
        
        // Asociacion bidireccional cuenta bancaria con titular
        pedro.setCuentaBancaria(cuentaDePedro);
        
        // Verificar informacion
        System.out.println(pedro);
        
        // Depositamos sueldo de Pedro
        cuentaDePedro.setSaldo(4_000_000.0);
        
        System.out.println(pedro);
    }
}
