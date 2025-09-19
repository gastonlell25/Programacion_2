package UML.Ejercicio5;

public class PlacaMadre {
    // =======================
    // Propiedades privadas
    // =======================
    private String modelo;
    private String chipset;
    

    // =======================
    // Constructores
    // =======================

    public PlacaMadre(String nombre, String dni) {
        this.modelo = nombre;
        this.chipset = dni;
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
    

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Cliente{"
                + "modelo: " + modelo + ", "
                + "chipset: " + chipset
                + "}";
        return str;
    }

}
