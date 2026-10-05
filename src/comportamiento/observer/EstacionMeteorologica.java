package comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

// SUJETO: guarda el estado y la lista de observadores.
// Cuando el estado cambia, avisa a todos.
public class EstacionMeteorologica {
    private final List<Observador> observadores = new ArrayList<>();
    private double temperatura;
    private double humedad;

    public void suscribir(Observador o) {
        if (!observadores.contains(o)) {
            observadores.add(o);
        }
    }

    public void desuscribir(Observador o) {
        observadores.remove(o);
    }

    // Cambia el estado y notifica
    public void registrarMedicion(double temperatura, double humedad) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        notificar();
    }

    private void notificar() {
        // Se recorre una copia: un observador podria desuscribirse mientras se notifica
        for (Observador o : new ArrayList<>(observadores)) {
            o.actualizar(temperatura, humedad);
        }
    }

    public int cantidadObservadores() {
        return observadores.size();
    }
}