package creacionales.prototype;

import java.util.HashMap;
import java.util.Map;

// Catálogo de plantillas de vuelo: guarda "vuelos modelo" y entrega copias
public class CatalogoVuelos {
    private final Map<String, Vuelo> plantillas = new HashMap<>();

    public void registrar(String ruta, Vuelo plantilla) {
        plantillas.put(ruta, plantilla);
    }

    public Vuelo programar(String ruta) {
        Vuelo base = plantillas.get(ruta);
        if (base == null) {
            throw new IllegalArgumentException("No existe la ruta: " + ruta);
        }
        return base.clonar(); // siempre devuelve una copia, nunca la plantilla
    }
}
