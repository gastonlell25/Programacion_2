
package programacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
        
public class Programacion_estructurada {
    public static final Scanner teclado = new Scanner(System.in);
    
    //Constante para ejercicio 11
    public static final Double DESCUENTO = 0.10;

    public static void main(String[] args) {
        anioBisiesto();
        numeroMayor();
        clasificarEdad();
        calculadoraDescuento();
        sumarPares();
        clasificadorDeNumeros();
        notaValida();
        calcularPrecioFinalMain();
        calcularCostoEnvioMain();
        contadorStock();
        descuentoEspecialMain();
        modificarPreciosMain();
        modificarPreciosRecursivoMain();
    }
    
    // Estructuras condicionales
    // Ejercicio 1    
    public static void anioBisiesto() {
        System.out.println("Ingresa un año: ");
        
        
        if (!teclado.hasNextInt()) {
            System.out.println("Error: Debes ingresar un número entero.");
            teclado.next();
            return;
        }
        
        int anio = teclado.nextInt();

        boolean es_bisiesto = anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0);
        
        System.out.println(es_bisiesto ? "Ingresaste un año bisiesto" : "El año ingresado no es bisiesto");
        
    }
    
    // Ejercicio 2
    public static void numeroMayor() {
        int numero_mayor = Integer.MIN_VALUE;
        for (int i = 0;i < 3;i++) {
           System.out.println("Ingresa el numero " + (i+1) + ": ");
           
           // Validacion de numero entero         
           if (!teclado.hasNextInt()) {
               System.out.println("Error: Debes ingresar un número entero.");
               teclado.next();
               return;
           }

           int numero_ingresado = teclado.nextInt();
           
           if (numero_mayor < numero_ingresado) {
               numero_mayor = numero_ingresado;
           }
        }
        
        System.out.println("El mayor es: " + numero_mayor);
    }
    
    // Ejercicio 3
    public static void clasificarEdad() {
        System.out.println("Ingrese su edad: ");
        
        // Validacion de numero entero   
        if (!teclado.hasNextInt()) {
            System.out.println("Error: Debes ingresar un número entero.");
            teclado.next();
            return;
        }
        
        int edad = teclado.nextInt();
        
        if (edad < 0) {
            System.out.println("Error: Debes ingresar una edad valida.");
            teclado.next();
            return;
        }
        
        if (edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad <= 17) {
            System.out.println("Eres un dolescente");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }
    }
    
    // Ejercicio 4
    public static void calculadoraDescuento() {

        System.out.println("Ingrese precio: ");

        // Validacion de numero entero   
        if (!teclado.hasNextDouble()) {
            System.out.println("Error: Debes ingresar un precio valido.");
            return;
        }
                
        double precio = teclado.nextDouble();
        
        System.out.println("Ingrese categoria del producto  (A/B/C): ");
        
        String categoria = teclado.next().toUpperCase();
        
        if (!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C")) {
            System.out.println("Categoria inválida");
            return;
        }
        
        double total;
        double descuento = switch (categoria) {
            case "A" -> 0.10;
            case "B" -> 0.15;
            case "C" -> 0.20;
            default -> 0;
        };

        total = precio - (precio * descuento);

        System.out.println("Precio ingresado: " + precio);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + total);
        
    }
    
    //Estructuras de Repetición
    //Ejercicio 5
    public static void sumarPares() {
        int suma_numeros = 0;
        int numero_ingresado = 1;
        
        while (numero_ingresado != 0) {
           System.out.println("Ingresa un número (0 para terminar)");
           numero_ingresado = teclado.nextInt();
           
           if (numero_ingresado % 2 == 0) {
               suma_numeros += numero_ingresado;
           }
        }
        
        System.out.println("La suma de los números pares es: " + suma_numeros);
    }
    
    //Ejercicio 6
    public static void clasificadorDeNumeros() {
        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        for (int i = 1;i < 11;i++) {
            System.out.println("Ingresa el numero " + (i) + ": ");
           
            // Validacion de numero entero       
            if (!teclado.hasNextInt()) {
                System.out.println("Error: Debes ingresar números enteros.");
                teclado.next();
                return;
            }
            

            int numero_ingresado = teclado.nextInt();
            
            if (numero_ingresado < 0) {
                negativo += 1;
            } else if (numero_ingresado > 0) {
                positivo += 1;
            } else {
                cero += 1;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + cero);
    }
    //Ejercicio 7
    private static void notaValida() {
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");

            // Validar que sea un número entero
            while (!teclado.hasNextInt()) {
                System.out.println("Error: Debes ingresar un número entero.");
                teclado.next();
                System.out.print("Ingrese una nota (0-10): ");
            }

            nota = teclado.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente: " + nota);
    }
    
    //Ejercicio 8
    private static void calcularPrecioFinalMain() {
        
        System.out.println("Ingrese el precio: ");
        double precio = teclado.nextDouble();
        
        System.out.println("Ingrese el porcentaje de impuesto: ");
        double impuesto = teclado.nextDouble() / 100.0;
        
        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = teclado.nextDouble() / 100.0;
        
        
        double precio_final = calcularPrecioFinal(precio, impuesto, descuento);
        
        System.out.println("El precio final del producto es: " + precio_final);
    }
    
    private static double calcularPrecioFinal(double precio, double impuesto, double descuento) {
        return precio + (precio * impuesto) - (precio * descuento);
    }
    
    //Ejercicio 9
    private static void calcularCostoEnvioMain() {
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        
        System.out.println("Ingrese el peso del paquete: ");
        double peso = teclado.nextDouble();
        
        teclado.nextLine();
        
        String zona;

        do {
            System.out.println("Ingrese zona de envío: (I = Internacional, N = Nacional)");
            zona = teclado.nextLine().toUpperCase();
        } while (!zona.equals("N") && !zona.equals("I"));
        
        
        double costo = calcularCostoEnvio(peso, zona);
        
        double precio_final = calcularTotalCompra(precio, costo);
        
        System.out.println("El costo de envío es: " + costo);
        System.out.println("El total a pagar es: " + precio_final);

    }

    public static double calcularCostoEnvio(double peso, String zona) {
        Map<String, Double> costos = new HashMap<>();
        costos.put("N", 5.0);
        costos.put("I", 10.0);
        
        return peso * costos.get(zona);
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
    
    //Ejercicio 10
    private static void contadorStock() {
        System.out.println("Ingrese stock actual del producto: ");
        int stock = teclado.nextInt();
        
        System.out.println("Ingrese cantidad vendida del producto: ");
        int cantidad_vendida = teclado.nextInt();
        
        System.out.println("Ingrese cantidad recibida del producto: ");
        int cantidad_recibida = teclado.nextInt();
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stock, cantidad_vendida, cantidad_recibida));
    }
    
    public static int actualizarStock (int stockActual, int stockVendido, int stockIngresado) {
        return stockActual - stockVendido + stockIngresado;
    }
    
    //Ejercicio 11
    private static void descuentoEspecialMain() {
        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        
        double precio_final = calcularDescuentoEspecial(precio);
        
        System.out.println("El precio final con desceunto es: " + precio_final);
        
    }
    
    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        
        return precio - descuentoAplicado;
    }
    
    //Ejercicio 12
    public static void modificarPreciosMain() {
        double[] precios = { 100.50, 40, 200.65 };
        
        System.out.println("Precios originales");
        for(double n: precios) {
           System.out.println("$" + n);
        }
        
        precios[1] = 400.40;
        
        System.out.println("Precios modificados");
        for(double n: precios) {
           System.out.println("$" + n);
        }
    }
    
    // Ejercicio 13
    public static void modificarPreciosRecursivoMain() {
        double[] precios = { 100.50, 40, 200.65 };
        
        imprimirListaPrecios("Precios originales", precios);
        
        precios[1] = 400.40;
        
        imprimirListaPrecios("Precios modificados", precios);
    }
    
    public static void imprimirListaPrecios(String titulo, double[] lista) {
        System.out.println(titulo);
        for (double n: lista) {
            System.out.println("$" + n);
        }
    }
    
    
    
}
