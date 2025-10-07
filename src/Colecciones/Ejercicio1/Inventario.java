package Colecciones.Ejercicio1;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.List;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList();
    
    // ------------------- Métodos requeridos -------------------
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("Inventario sin productos disponibles.");
        } else {
            System.out.println("Productos disponibles:");
            productos.forEach(Producto::mostrarInfo);
        }
    }
    
    public Producto buscarProductoPorId(String id) { 
        return productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    public boolean eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        
        if(producto == null) {
            System.out.println("No se encontró el producto");
            return false;
        }
        
        productos.remove(producto);
        System.out.println("Producto eliminado: " + producto.getNombre());

        return true;
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        ListIterator<Producto> iterator = productos.listIterator();

        while(iterator.hasNext()) {
            
            Producto producto = iterator.next();

            if(producto.getId().equals(id)) {
                producto.setCantidad(nuevaCantidad);
            }
        }
    }
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        return productos.stream()
            .filter(p -> p.getCategoria().equals(categoria))
            .collect(Collectors.toUnmodifiableList());
    }
    
    
    public void obtenerTotalStock() {
        List<Producto> productosConStock = productos.stream()
                .filter(p -> p.getCantidad() > 0)
                .collect(Collectors.toList());
        
        if (productosConStock.isEmpty()) {
            System.out.println("No hay productos disponibles");
            return;
        }
        System.out.println("Stock total de productos");
        for (Producto p:productosConStock) {
            System.out.println("Producto: " + p.getNombre() + " Cantidad: " + p.getCantidad());
        }
    }
    
    public List<Producto> obtenerProductoConMayorStock() {
        int maxCantidad = productos.stream()
                .mapToInt(Producto::getCantidad)
                .max()
                .orElseThrow(() -> new RuntimeException("Lista vacía"));
        
        return productos.stream()
                .filter(p -> p.getCantidad() == maxCantidad)
                .collect(Collectors.toUnmodifiableList());
        
    }
    
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
         return productos.stream()
                .filter(p -> p.getPrecio() >= min && p.getPrecio() <= max)
                .collect(Collectors.toUnmodifiableList());
        
    }
    
    public void mostrarCategoriasDisponibles(){
        System.out.println("Categorias disponibles:");
        for(CategoriaProducto categoria : CategoriaProducto.values() ) {
            System.out.println(categoria + "(" + categoria.getDescripcion() + ")");
        }
    }
}
