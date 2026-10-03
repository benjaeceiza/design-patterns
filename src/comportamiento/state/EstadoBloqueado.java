package comportamiento.state;

public class EstadoBloqueado implements EstadoTelefono {
    @Override
    public void presionarBotonEncendido(Telefono telefono) {
        System.out.println("🌑 Apagando la pantalla... (Sigue bloqueado)");
    }

    @Override
    public void presionarBotonInicio(Telefono telefono) {
        System.out.println("🔓 Desbloqueando teléfono... Pasando a estado DESBLOQUEADO.");
        telefono.setEstado(new EstadoDesbloqueado());
    }
}