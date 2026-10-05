package creacionales.abstractfactory;

// Fábrica abstracta: crea una FAMILIA de productos que corresponden a la misma clase de cabina
public interface FabricaClase {
    Asiento crearAsiento();

    ServicioAbordo crearServicioAbordo();
}
