package comportamiento.command;

public class SistemaReservas {
    public void confirmarVuelo(String pasajero) {
        System.out.println("SISTEMA: Vuelo confirmado exitosamente para el pasajero: " + pasajero);
    }

    public void cancelarVuelo(String pasajero) {
        System.out.println("SISTEMA: Vuelo cancelado para el pasajero: " + pasajero);
    }
}