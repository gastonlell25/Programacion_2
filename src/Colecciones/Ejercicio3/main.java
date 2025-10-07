package Colecciones.Ejercicio3;

public class main {
    public static void main(String[] args) {
        // Crear universidad
        Universidad uni = new Universidad("UTN");
        
        //1.  Crear profesores y cursos
        Profesor prof1 = new Profesor("P1", "Juan Pérez", "Matemáticas");
        Profesor prof2 = new Profesor("P2", "Laura Gómez", "Programación");
        Profesor prof3 = new Profesor("P3", "Carlos Díaz", "Historia");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Java Básico");
        Curso c3 = new Curso("C3", "Base de Datos");
        Curso c4 = new Curso("C4", "Historia Antigua");
        Curso c5 = new Curso("C5", "Lógica");

        //2. Agregar profesores y cursos
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);
        
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
        

        //3. Asignar profesores a cursos
        uni.asignarProfesorACurso(prof1.getId(), c1.getCodigo()); // Juan → Álgebra
        uni.asignarProfesorACurso(prof1.getId(), c5.getCodigo()); // Juan → Lógica
        uni.asignarProfesorACurso(prof2.getId(), c2.getCodigo()); // Laura → Java
        uni.asignarProfesorACurso(prof2.getId(), c3.getCodigo()); // Laura → Base de Datos
        uni.asignarProfesorACurso(prof3.getId(), c4.getCodigo()); // Carlos → Historia

        // 4. Listar cursos con su profesor
        System.out.println("\n=== Cursos con su profesor ===");
        uni.listarCursos();

        System.out.println("\n=== Profesores con sus cursos ===");
        uni.listarProfesores();

        // 5. Cambiar profesor de un curso
        System.out.println("\n=== Cambiar profesor del curso C3 (Base de Datos) ===");
        uni.asignarProfesorACurso(prof1.getId(), c3.getCodigo()); // Ahora Base de Datos pasa de Laura a Juan
        uni.listarCursos();

        // 6. Eliminar un curso y verificar que ya no este en la lista
        System.out.println("\n=== Eliminar curso C5 (Lógica) ===");
        uni.eliminarCurso(c5.getCodigo());
        uni.listarCursos();
        
        // 7. Eliminar profesor
        System.out.println("\n=== Eliminar profesor P3 (Carlos Díaz) ===");
        uni.eliminarProfesor(prof3.getId());
        // listar profesores y cursos para verificar correcta eliminacion
        uni.listarProfesores();
        uni.listarCursos();
        
        //8. Reporte de cursos por profesor
        System.out.println("\n=== Reporte de Cursos por Profesor ===");
        for (Profesor p : uni.obtenerProfesores()) {
            System.out.println("\nProfesor: " + p.getNombre());
            System.out.println("Especialidad: " + p.getEspecialidad());
            System.out.println("Cursos que dicta:");
            if (p.obtenerCursos().isEmpty()) {
                System.out.println("  - No tiene cursos asignados.");
            } else {
                p.obtenerCursos().forEach(c -> System.out.println("  - " + c.getNombre()));
            }
        }
    }
}