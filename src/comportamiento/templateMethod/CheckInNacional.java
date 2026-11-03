package comportamiento.templateMethod;

public class CheckInNacional extends ProcesoCheckIn {
    @Override
    protected void verificarDocumentos() {
        System.out.println("Vuelo Nacional: Verificando únicamente el DNI del pasajero.");
    }
}