package estructurales.composite;

// Hoja: un pasaje individual
public class Pasaje implements ItemReserva {
    private final String descripcion;
    private final double precio;

    public Pasaje(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "- Pasaje: " + descripcion + " (USD " + precio + ")");
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
