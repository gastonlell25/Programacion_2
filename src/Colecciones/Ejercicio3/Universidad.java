package Colecciones.Ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Curso> cursos;
    private List<Profesor> profesores;
    
    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList();
        this.cursos = new ArrayList();
    }
    
    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos en la universidad " + nombre);
            return;
        }

        System.out.println("Cursos de la universidad: " + nombre);
        
        for (Curso c : cursos) {
            c.mostrarInfo();
        }        
    }

    public void agregarCurso(Curso curso) {
        if (obtenerCursoPorCodigo(curso.getCodigo()) != null) {
            System.out.println("El curso ya está registrado en la universidad");
        } else {
            cursos.add(curso);
        }
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores en la universidad " + nombre);
            return;
        }
        System.out.println("Profesores de la universidad: " + nombre);
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void agregarProfesor(Profesor profesor) {
        if (obtenerProfesorPorId(profesor.getId()) != null) {
            System.out.println("El profesor ya está registrado en la universidad");
        } else {
            profesores.add(profesor);
        }
    }

    
    public boolean asignarProfesorACurso(String profesorId, String codigoCurso) {
        Profesor profesor = obtenerProfesorPorId(profesorId);
        Curso curso = obtenerCursoPorCodigo(codigoCurso);
        
        if (Arrays.asList(profesor, curso).contains(null)) {
            System.out.println("Error al asignar profesor");
            return false;
        }
        
    
        profesor.agregarCurso(curso);
        
        return true;
    }
    
    public List<Profesor> obtenerProfesores(){
        return Collections.unmodifiableList(profesores);
    }
    
    public Profesor obtenerProfesorPorId(String profesorId) {
        return profesores.stream()
            .filter(p -> p.getId().equals(profesorId))
            .findFirst()
            .orElse(null);        
    }

    public Curso obtenerCursoPorCodigo(String codigoCurso) {
        return cursos.stream()
            .filter(p -> p.getCodigo().equals(codigoCurso))
            .findFirst()
            .orElse(null);        
    }
    
    public boolean eliminarCurso(String codigo){
        Curso curso = obtenerCursoPorCodigo(codigo);
        
        if (curso == null) {
            System.out.println("Error al eliminar curso");
            return false;
        }

        if(curso.getProfesor() != null) {
            Profesor profesor = obtenerProfesorPorId(curso.getProfesor().getId());
            profesor.eliminarCurso(curso);
        }

        cursos = cursos.stream()
                .filter(c -> !c.getCodigo().equals(codigo))
                .toList();
        
        return true;
    }
    
    public boolean eliminarProfesor(String id){
        Profesor profesor = obtenerProfesorPorId(id);
        
        if (profesor == null) {
            System.out.println("Error al eliminar profesor");
            return false;
        }
        
        List<Curso> cursosDelProfesor = profesor.obtenerCursos();
        
        if(!cursosDelProfesor.isEmpty()) {
            for (Curso curso : cursosDelProfesor) {
                curso.desasignarProfesor();
            }
        }

        profesores = profesores.stream()
                .filter(p -> !p.getId().equals(id))
                .toList();
        
        return true;
    }
}

