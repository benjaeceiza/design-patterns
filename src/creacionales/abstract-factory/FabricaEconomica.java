package creacionales.abstractfactory;

// Fábrica concreta: todos sus productos son de clase económica
public class FabricaEconomica implements FabricaClase {
    @Override
    public Asiento crearAsiento() {
        return new AsientoEconomico();
    }

    @Override
    public ServicioAbordo crearServicioAbordo() {
        return new ServicioAbordoEconomico();
    }
}
