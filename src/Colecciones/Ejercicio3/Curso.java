package Colecciones.Ejercicio3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor != profesor) {
            this.profesor = profesor;
        }
    }
    
    public void desasignarProfesor() {
        this.profesor = null;
    }
    
    public void mostrarInfo(){
        String info = "Curso: " + nombre + 
                           " | codigo: " + codigo;
        
        info += " | Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar" );
        
        System.out.println(info);
    }
}
