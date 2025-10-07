package Colecciones.Ejercicio1;
import java.util.UUID;

public class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    
    // CONSTRUCTOR
    public Producto(String nombre, Double precio, int cantidadInicial, CategoriaProducto categoria){
        this.id = UUID.nameUUIDFromBytes(nombre.getBytes()).toString();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidadInicial;
        this.categoria = categoria;
    };
    
    // GETTERS Y SETTERS
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + 
                           " | id: " + id + 
                           " | Precio: " + precio + 
                           " | cantidad: " + cantidad);
    }
    
}


