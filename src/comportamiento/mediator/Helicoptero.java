package comportamiento.mediator;

public class Helicoptero extends Avion {

    public Helicoptero(String identificador) {
        super(identificador);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("🚁 Helicóptero [" + identificador + "] envía a la torre: " + mensaje);
        mediador.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("   -> Helicóptero [" + identificador + "] escucha por radio: " + mensaje);
    }
}