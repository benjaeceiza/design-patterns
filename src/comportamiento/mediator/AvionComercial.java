package comportamiento.mediator;

public class AvionComercial extends Avion {
    
    public AvionComercial(String identificador) {
        super(identificador);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("✈️ Comercial [" + identificador + "] envía a la torre: " + mensaje);
        mediador.enviarMensaje(mensaje, this); // NO habla con otros aviones, le avisa a la torre
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("   -> Comercial [" + identificador + "] escucha por radio: " + mensaje);
    }
}