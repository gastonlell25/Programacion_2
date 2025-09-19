package UML.Ejercicio9;


public class CitaMedica {
    // =======================
    // Propiedades privadas
    // =======================
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    // =======================
    // Constructores
    // =======================
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    // =======================
    // Metodos getters y setters
    // =======================
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    // =======================
    // Metodos utilitarios
    // =======================
    @Override
    public String toString() {
        String str = "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + '}';
        
        if (paciente != null) {
            str += "\n -" + paciente;
        } else {
            str += "\n - Sin paciente asignado";
        }
        
        if (profesional != null) {
            str += "\n -" + profesional;
        } else {
            str += "\n - Sin profesional asignado";
        }
        return str;
    }

}
