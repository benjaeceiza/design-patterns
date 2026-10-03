package comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControl implements Mediador {
    // La torre guarda una lista de todos los aviones conectados
    private List<Avion> aviones = new ArrayList<>();

    @Override
    public void registrarAvion(Avion avion) {
        if (!aviones.contains(avion)) {
            aviones.add(avion);
            avion.setMediador(this); // El avión ahora sabe quién es su torre
        }
    }

    @Override
    public void enviarMensaje(String mensaje, Avion emisor) {
        // La torre recibe un mensaje y se lo reenvía a TODOS los demás aviones
        for (Avion avion : aviones) {
            if (avion != emisor) { // Obviamente, no le reenviamos el mensaje al que lo mandó
                avion.recibir(mensaje);
            }
        }
    }
}