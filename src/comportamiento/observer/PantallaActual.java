package comportamiento.observer;

// OBSERVADOR CONCRETO: muestra siempre los datos recibidos.

public class PantallaActual implements Observador {
    @Override
    public void actualizar(double temperatura, double humedad) {
        System.out.println("[Pantalla] " + temperatura + " C, humedad " + humedad + "%");
    }
}