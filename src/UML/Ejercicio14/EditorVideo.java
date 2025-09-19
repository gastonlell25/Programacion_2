package UML.Ejercicio14;

public class EditorVideo {
    // =======================
    // Metodos utilitarios
    // =======================
    
    public void exportar(String formato, Proyecto proyecto){
        
        // Crear proyecto
        Render render = new Render(formato);
        
        // asociar Proyecto a Render
        render.setProyecto(proyecto);
        
        System.out.println(render);
    };
}
