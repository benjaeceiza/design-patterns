package comportamiento.command;

public class ComandoConfirmar implements Comando {
    private SistemaReservas sistema;
    private String pasajero;

    public ComandoConfirmar(SistemaReservas sistema, String pasajero) {
        this.sistema = sistema;
        this.pasajero = pasajero;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando comando: Confirmar...");
        sistema.confirmarVuelo(pasajero);
    }

    @Override
    public void deshacer() {
        System.out.println("Deshaciendo comando (Revirtiendo confirmación)...");
        sistema.cancelarVuelo(pasajero);
    }
}