package UML.Ejercicio12;

public class main {
    public static void main (String[] args){
        
        // Crear impuesto
        Impuesto impuesto = new Impuesto(16.0);
        
        // Crear Contribuyente
        Contribuyente roberto = new Contribuyente("Roberto", "20345678763");
        
        // Asociacion unidireccional: Impuesto -> Contribuyente
        impuesto.setContribuyente(roberto);
        
        // Crear calculadora
        Calculadora calculadora = new Calculadora();
        
        calculadora.calcular(impuesto);
    }
}
