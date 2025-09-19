package UML.Ejercicio14;

public class Render {
    // =======================
    // Propiedades privadas
    // =======================
    private String formato;
    private Proyecto proyecto;
    
    // =======================
    // Constructor
    // =======================
    public Render(String formato) {
        this.formato = formato;
    }
    
    // =======================
    // Metodos getters y setters
    // =======================
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
    // =======================
    // Metodos utilitarios
    // =======================
    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
    
}
