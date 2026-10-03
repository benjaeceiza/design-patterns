package comportamiento.mediator;

public abstract class Avion {
    protected Mediador mediador; // El atributo clave (Conoce a la torre)
    protected String identificador;

    public Avion(String identificador) {
        this.identificador = identificador;
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }

    // Métodos abstractos que cada tipo de avión implementará a su manera
    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
}