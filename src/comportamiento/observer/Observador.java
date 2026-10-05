package comportamiento.observer;

// Interfaz que implementan todos los observadores.
// Es lo unico que el sujeto conoce de ellos.
public interface Observador {
    void actualizar(double temperatura, double humedad);
}