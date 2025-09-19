package UML.Ejercicio9;

public class main {
    public static void main (String[] args) {
        // Crear paciente
        Paciente pepito = new Paciente("Pepito", "Sancor 3000");
        
        // Crear profesional
        Profesional DrOchoa = new Profesional("Ochoa", "Traumatólogo");
        
        // Crear turno medico
        CitaMedica turnoConTrauma = new CitaMedica("23/11/2025", "15:00Hs");
        
        // Asociación unidireccional con paciente
        turnoConTrauma.setPaciente(pepito);

        // Asociación unidireccional con profesional
        turnoConTrauma.setProfesional(DrOchoa);
        
        System.out.println(turnoConTrauma);
    }
}
