package creacionales.factoryMethod;

// El cliente interactúa con la fábrica abstracta sin depender de clases concretas
public class Main {
    public static void main(String[] args) {
        // 1. Usar la fábrica de Emails
        NotificacionFactory factoryEmail = new EmailFactory();
        factoryEmail.procesarYEnviar("Tu código de verificación es 1234");

        System.out.println("----------------------------------------");

        // 2. Usar la fábrica de SMS
        NotificacionFactory factorySMS = new SMSFactory();
        factorySMS.procesarYEnviar("Tu paquete ha llegado al centro de distribución");
    }
}