package comportamiento.mediator;

public interface Mediador {
    void enviarMensaje(String mensaje, Avion emisor);
    void registrarAvion(Avion avion);
}