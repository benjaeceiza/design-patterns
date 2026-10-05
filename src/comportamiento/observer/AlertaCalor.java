package comportamiento.observer;

// OBSERVADOR CONCRETO: reacciona solo si la temperatura supera el umbral.

public class AlertaCalor implements Observador {
    private final double umbral;
    private int alertas = 0;

    public AlertaCalor(double umbral) {
        this.umbral = umbral;
    }

    @Override
    public void actualizar(double temperatura, double humedad) {
        if (temperatura > umbral) {
            alertas++;
            System.out.println("[ALERTA] " + temperatura + " C supera el umbral de " + umbral);
        }
    }

    public int getAlertas() {
        return alertas;
    }
}
