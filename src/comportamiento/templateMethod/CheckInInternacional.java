package comportamiento.templateMethod;

public class CheckInInternacional extends ProcesoCheckIn {
    @Override
    protected void verificarDocumentos() {
        System.out.println("Vuelo Internacional: Verificando el Pasaporte y la Visa del pasajero.");
    }
}