package UML.Ejercicio7;


public class main {
    public static void main(String[] args) {
        // Crear conductor
        Conductor conductor1 = new Conductor("Pedro", "1234");
        
        // Crear motor
        Motor motor1 = new Motor("Electrico", "M266.920");
        
        // Crear auto
        Vehiculo vehiculo1 = new Vehiculo("AB089RF", "Nivus", motor1);
        
        // Verificar conductor
        System.out.println(conductor1);
        
        // asociar vehiculo
        conductor1.setVehiculo(vehiculo1);
        
        // verificar asociacion
        if (conductor1.getVehiculo() != null) {
            System.out.println(conductor1.getVehiculo());
        }
        
    }
}
