package comportamiento.state;

public class Telefono {
    // Acá guarda el estado actual
    private EstadoTelefono estadoActual;

    public Telefono() {
        // Cuando compras el celu, arranca apagado
        this.estadoActual = new EstadoApagado();
    }

    // Método para cambiar el estado dinámicamente
    public void setEstado(EstadoTelefono nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    // Las acciones del usuario simplemente se las pasa al estado actual
    public void presionarBotonEncendido() {
        estadoActual.presionarBotonEncendido(this);
    }

    public void presionarBotonInicio() {
        estadoActual.presionarBotonInicio(this);
    }
}