package creacionales.factoryMethod;

// Clase abstracta creadora.
// Contiene la lógica de negocio principal y declara el Factory Method abstracto.
public abstract class NotificacionFactory {

    // Método abstracto que las subclases deben implementar (Factory Method)
    public abstract Notificacion crearNotificacion();

    // Método de la lógica de negocio que utiliza el producto creado
    public void procesarYEnviar(String mensaje) {
        // La creación se delega al Factory Method implementado por la subclase
        Notificacion notificacion = crearNotificacion();
        
        // Operación sobre el producto creado
        System.out.println("Preparando el envío de la notificación...");
        notificacion.enviar(mensaje);
    }
}