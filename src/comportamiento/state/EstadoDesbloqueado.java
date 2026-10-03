package comportamiento.state;

public class EstadoDesbloqueado implements EstadoTelefono {
    @Override
    public void presionarBotonEncendido(Telefono telefono) {
        System.out.println("🔒 Bloqueando teléfono... Pasando a estado BLOQUEADO.");
        telefono.setEstado(new EstadoBloqueado());
    }

    @Override
    public void presionarBotonInicio(Telefono telefono) {
        System.out.println("🏠 Yendo a la pantalla principal (Home).");
    }
}