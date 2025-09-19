package UML.Ejercicio4;

public class main {
    public static void main(String[] args) {
        //Crear cliente
        Cliente cliente1 = new Cliente("Gaspar", "42123456");
        
        //Crear banco
        Banco banco1 = new Banco("Liciaga", "30500001735");
        
        //Crear tarjeta
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234567812345678", banco1);
        
        // ver tarjeta
        System.out.println(tarjeta1.toString());
        
        // ver cleinte
        System.out.println(cliente1.toString());
        
        // asociar cliente y tarjeta
        cliente1.setTarjetaDeCredito(tarjeta1);
        
        // check tarjeta asociada a cliente
        System.out.println(cliente1.getTarjetaDeCredito());
        
    }
}
