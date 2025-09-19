/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.Ejercicio11;

/**
 *
 * @author gastonlell
 */
public class Cancion {
    // =======================
    // Propiedades privadas
    // =======================    
    private String titulo;
    private Artista artista;
    
    // =======================
    // Constructor
    // =======================
    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    // =======================
    // Metodos getters y setters
    // =======================

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    
    // =======================
    // Metodos utilitarios
    // =======================

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
}
