/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces_y_excepciones.ecommerce;

import interfaces_y_excepciones.ecommerce.Interface.Pago;

/**
 *
 * @author gastonlell
 */
public class PayPal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por $" + monto);
    }
}
