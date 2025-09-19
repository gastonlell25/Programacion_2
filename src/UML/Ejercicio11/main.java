package UML.Ejercicio11;

public class main {
    public static void main(String[] args) {
        
        //Crear artista
        Artista luis = new Artista("Luis", "Romanticos");
        
        // Crear cancion
        Cancion cancion1 = new Cancion("Despacito");
        
        // Asociación unidireccional: Cancion -> Artista
        cancion1.setArtista(luis);
        
        // Crear reproductor
        Reproductor tocadisco = new Reproductor();
        
        // Reproducir cancion
        tocadisco.reproducir(cancion1);
    }
}
