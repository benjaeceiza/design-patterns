package creacionales.factoryMethod;

// Creador concreto para notificaciones por Email
public class EmailFactory extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        // Decide instanciar una NotificacionEmail
        return new NotificacionEmail();
    }
}
