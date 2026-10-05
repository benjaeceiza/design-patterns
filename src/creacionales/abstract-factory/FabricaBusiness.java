package creacionales.abstractfactory;

// Fábrica concreta: todos sus productos son de clase business
public class FabricaBusiness implements FabricaClase {
    @Override
    public Asiento crearAsiento() {
        return new AsientoBusiness();
    }

    @Override
    public ServicioAbordo crearServicioAbordo() {
        return new ServicioAbordoBusiness();
    }
}
