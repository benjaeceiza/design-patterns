package creacionales.factoryMethod;

// Producto concreto 2: Notificación por mensaje de texto
public class NotificacionSMS implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
