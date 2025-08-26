package programacion.POO;

/**
 *
 * @author gastonlell
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.setAnioPublicacion(añoPublicacion);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAñoPublicacion() {
        return anioPublicacion;
    }
    
 
    public void setAnioPublicacion(int anioPublicacion) {
        int anioActual = java.time.Year.now().getValue();
        
        if (anioPublicacion > anioActual) {
            System.out.println("Error: Año de publicación inválido");
            return;
        }
        
        this.anioPublicacion = anioPublicacion;
        System.out.println("Año de publicación actualizado correctamente a: " + anioPublicacion);
    }
    
    
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DEL LIBRO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("==============================");
    }
}
