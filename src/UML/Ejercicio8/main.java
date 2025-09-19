/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.Ejercicio8;

/**
 *
 * @author gastonlell
 */
public class main {
    public static void main(String[] args) {
        Usuario gerardo = new Usuario("Gerardo", "gera@gmail.com");
        
        Documento contratoAlquiler = new Documento(
                "Contrato de Alquiler",
                "Este documento establece los términos del contrato...",
                gerardo
        );
        
        System.out.println(contratoAlquiler);
        System.out.println(contratoAlquiler.getFirmaDigital());
        
    }
}
