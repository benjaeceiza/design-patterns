package estructurales.composite;

// Hoja: un servicio adicional (equipaje, menú especial, seguro, etc.)
public class ServicioExtra implements ItemReserva {
    private final String nombre;
    private final double precio;

    public ServicioExtra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "- Extra: " + nombre + " (USD " + precio + ")");
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
