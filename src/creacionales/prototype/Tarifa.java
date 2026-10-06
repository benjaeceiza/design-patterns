package creacionales.prototype;

// Objeto interno de Vuelo: por eso también hay que clonarlo (copia profunda)
public class Tarifa implements Prototipo<Tarifa> {
    private String clase;
    private double precio; // en USD

    public Tarifa(String clase, double precio) {
        this.clase = clase;
        this.precio = precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public Tarifa clonar() {
        return new Tarifa(clase, precio);
    }

    @Override
    public String toString() {
        return clase + " USD " + precio;
    }
}
