package UML.Ejercicio3;

public class Libro {
    // =======================
    // Propiedades privadas
    // =======================
    String titulo;
    String isbn;
    Autor autor;
    Editorial editorial;

    // =======================
    // Constructores
    // =======================
    
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Libro{"
                + "isbn" + isbn
                + "titulo" + titulo
                + "}";
        return str;
    }
    
    
}
