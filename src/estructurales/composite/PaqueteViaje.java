package estructurales.composite;

import java.util.ArrayList;
import java.util.List;

// Compuesto: agrupa pasajes, extras y otros paquetes (ej: una reserva familiar con un paquete por pasajero)
public class PaqueteViaje implements ItemReserva {
    private final String nombre;
    private final List<ItemReserva> items = new ArrayList<>();

    public PaqueteViaje(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ItemReserva item) {
        items.add(item);
    }

    public void eliminar(ItemReserva item) {
        items.remove(item);
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "+ " + nombre + " (total USD " + getPrecio() + ")");
        for (ItemReserva item : items) {
            item.mostrar(sangria + "    "); // delega: no le importa si es hoja o paquete
        }
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ItemReserva item : items) {
            total += item.getPrecio(); // recursivo
        }
        return total;
    }
}
