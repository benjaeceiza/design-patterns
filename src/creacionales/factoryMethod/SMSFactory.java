package creacionales.factoryMethod;

// Creador concreto para notificaciones por SMS
public class SMSFactory extends NotificacionFactory {
    @Override
    public Notificacion crearNotificacion() {
        // Decide instanciar una NotificacionSMS
        return new NotificacionSMS();
    }
}