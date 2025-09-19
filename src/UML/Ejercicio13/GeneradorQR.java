package UML.Ejercicio13;

public class GeneradorQR {
    
    // =======================
    // Metodos utilitarios
    // =======================
    public void generar(String valor, Usuario usuario){
        CodigoQR codigo = new CodigoQR(valor);
        
        codigo.setUsuario(usuario);
        
        System.out.println("Código QR generado");
        System.out.println(codigo);
    }
}
