package UML.Ejercicio1;

public class Foto {
    // =======================
    // Propiedades privadas
    // =======================
    String imagen;
    String formato;
    
    // =======================
    // Constructor
    // =======================
    public Foto(String imagen, String formato){
        this.imagen = imagen;
        this.formato = formato;
    }
    
    // =======================
    // Metodos getters y setters
    // =======================
    
    
    public String getImagen() {
        return imagen;
    };
    
    public void setImagen(String imagen){
        this.imagen = imagen;
    };
    
    public String getFormato() {
        return formato;
    };
    
    public void setFormato(String formato){
        this.formato = formato;
    };
    
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Foto{imagen=" + imagen +
                ", formato='" + formato + '\'' +
              "}";
    }
}
