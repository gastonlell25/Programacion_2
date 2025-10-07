package Colecciones.Ejercicio1;

public class main {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();
        
        Producto manzana = new Producto("Manzana", 2040.5, 10, CategoriaProducto.ALIMENTOS);
        Producto televisor = new Producto("Televisor", 350000.0, 5, CategoriaProducto.ELECTRONICA);
        Producto remera = new Producto("Remera", 7500.0, 20, CategoriaProducto.ROPA);
        Producto silla = new Producto("Silla", 15000.0, 12, CategoriaProducto.HOGAR);
        Producto arroz = new Producto("Arroz", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        
        System.out.println("1. Agregando productos...");
        inventario.agregarProducto(manzana);
        inventario.agregarProducto(televisor);
        inventario.agregarProducto(remera);
        inventario.agregarProducto(silla);
        inventario.agregarProducto(arroz);
        
        System.out.println("\n-------------------------------------");
        
        //2. Productos listados
        inventario.listarProductos();
        
        System.out.println("\n-------------------------------------");
       
        //3. Buscando producto por ID
        String idABuscar = arroz.getId();
        Producto buscado = inventario.buscarProductoPorId(idABuscar);
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontró el producto");
        }

        System.out.println("\n-------------------------------------");
        
        //4. Buscando productos por categoria
        System.out.println("Productos con categoria: " + CategoriaProducto.ALIMENTOS);
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS).forEach(Producto::mostrarInfo);
        
        System.out.println("\n-------------------------------------");

        //5. Eliminar producto por ID
        System.out.println("Eliminando producto: " + silla.getNombre());
        inventario.eliminarProducto(silla.getId());
        
        System.out.println("\n-------------------------------------");
        System.out.println("Lista actualizada");
        inventario.listarProductos();
        
        System.out.println("\n-------------------------------------");

        //6. Editando stock producto
        System.out.println("Editar stock de producto: " + manzana.getNombre());
        inventario.actualizarStock(manzana.getId(), 30);    
        
        System.out.println("\n-------------------------------------");

        //7.Mostrar stock disponible
        inventario.obtenerTotalStock();
        
        System.out.println("\n-------------------------------------");

        //8. Producto/s con mayor stock
        System.out.println("Productos con mayor stock");
        inventario.obtenerProductoConMayorStock().forEach(Producto::mostrarInfo);
        
        System.out.println("\n-------------------------------------");
        
        //9. Filtrado de productos por precios
        Double min = 1000.0;
        Double max = 3000.0;
        System.out.println("Productos con precios entre: " + min + " y " + max);
        inventario.filtrarProductosPorPrecio(min, max);
        
        System.out.println("\n-------------------------------------");
        
        System.out.println("10. Categorias disponibles");
        inventario.mostrarCategoriasDisponibles();
        

    }
}
