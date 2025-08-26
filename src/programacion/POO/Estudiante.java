
package programacion.POO;

/**
 *
 * @author gastonlell
 */
public class Estudiante {
    String nombre, apellido;
    String curso;
    Double calificacion;

    public Estudiante(String nombre, String apellido, String curso, Double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("\n=== INFORMACIÓN DEL ESTUDIANTE===");
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Nota: " + calificacion);
        System.out.println("El alumno: " + (calificacion >= 6 ? "Aprobó" : "Desaprobó"));
        System.out.println("==============================");
    }
    
    public void subirCalificacion(Double puntos) {
        Double nuevaCalificacion = calificacion + puntos;
        
        if (!calificacionValida(nuevaCalificacion)) {
            System.out.println("No es posible cambiar la calificación");
            return;
        }
        
        calificacion = nuevaCalificacion;
    }
    
    public void bajarCalificacion(Double puntos) {
        Double nuevaCalificacion = calificacion - puntos;
        
        if (!calificacionValida(nuevaCalificacion)) {
            System.out.println("No es posible cambiar la calificación");
            return;
        }
        
        calificacion = nuevaCalificacion;
    }
    
    private boolean calificacionValida(Double calificacion) {
        return calificacion > 0 || calificacion < 10;        
    }
}
