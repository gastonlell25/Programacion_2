package UML.Ejercicio5;


public class Computadora {
    // =======================
    // Propiedades privadas
    // =======================
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    // =======================
    // Constructores
    // =======================

    public Computadora(String marca, String numeroSerie, String modeloPlacaMadre, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlacaMadre, chipset); //composición
    }
    
    // =======================
    // Métodos getters y setters
    // =======================
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        
        if(propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
    

    // =======================
    // Métodos utilitarios
    // =======================

    @Override
    public String toString() {
        String str = "Computadora{"
                + "marca: " + marca + ", "
                + "numeroSerie: " + numeroSerie
                + "}";
        return str;
    }

}
