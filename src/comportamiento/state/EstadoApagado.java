package comportamiento.state;

public class EstadoApagado implements EstadoTelefono {
    @Override
    public void presionarBotonEncendido(Telefono telefono) {
        System.out.println("📱 Teléfono encendiéndose... Pasando a estado BLOQUEADO.");
        // Cambia el estado del contexto (el teléfono)
        telefono.setEstado(new EstadoBloqueado());
    }

    @Override
    public void presionarBotonInicio(Telefono telefono) {
        System.out.println("❌ No pasa nada. El teléfono está apagado.");
    }
}