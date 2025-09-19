package UML.Ejercicio8;

public class Documento {
    // =======================
    // Propiedades privadas
    // =======================
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    // =======================
    // Constructores
    // =======================
    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(); //composicion
        this.firmaDigital.setUsuario(usuario);// agregación
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(FirmaDigital firmaDigital) {
        this.firmaDigital = firmaDigital;
    }
    
 
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Documento{titulo=" + titulo +
                ", contenido='" + contenido + '\'' +
              "}";
    }
}
