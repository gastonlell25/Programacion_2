package Colecciones.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    // constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList();
    }

    // getters y setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> obtenerCursos() {
        return Collections.unmodifiableList(cursos);
    }
    
    public void agregarCurso(Curso nuevoCurso){
        Curso cursoExiste = cursos.stream()
                .filter(c -> c.getCodigo().equals(nuevoCurso.getCodigo()))
                .findFirst()
                .orElse(null);
        
        if (cursoExiste != null) {
            System.out.println("El curso ya se encuentra registrado.");
        } else {
            cursos.add(nuevoCurso);
            System.out.println("Curso registrado con éxito!");
        }
        
        if (nuevoCurso.getProfesor() != this) {
            nuevoCurso.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso curso) {
        Curso cursoExiste = cursos.stream()
            .filter(c -> c.getCodigo().equals(curso.getCodigo()))
            .findFirst()
            .orElse(null);

        if (cursoExiste == null) {
            System.out.println("El curso ya no se encuentra registrado.");
        } else {
            cursos.remove(curso);
            System.out.println(getNombre() + " ya no dicta este curso.");
        }
        
        if (curso.getProfesor() == this) {
            curso.desasignarProfesor();
        }
        
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos para mostrar");
        } else {
            System.out.println("Cursos asignados:");
            cursos.forEach(Curso::mostrarInfo);
        }
    }
    
    public void mostrarInfo() {
        String info = "Profesor: " + id + 
                           " | Nombre: " + nombre + 
                           " | Especialidad: " + especialidad +
                           " | Cursos: ";
        
        if (!cursos.isEmpty()) {
            for (Curso c : cursos){
                info += c.getNombre() + ", "; 
            }
        } else {
            info += "Sin asignar";
        }

        System.out.println(info);
    }
    
}
