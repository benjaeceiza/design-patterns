package creacionales.factoryMethod;

// Producto concreto 1: Notificación por correo electrónico
public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}
