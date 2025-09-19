package UML.Ejercicio14;

public class main {
    public static void main(String[] args) {
        Proyecto toyStory = new Proyecto("Toy Story 4", 240.0);
        
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("MP4", toyStory);
    }
}
