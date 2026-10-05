package creacionales.abstractfactory;

// Cliente: no sabe si el pasajero viaja en económica o business, solo usa la fábrica que le pasan
public class ExperienciaDeVuelo {
    private final Asiento asiento;
    private final ServicioAbordo servicio;

    public ExperienciaDeVuelo(FabricaClase fabrica) {
        this.asiento = fabrica.crearAsiento();
        this.servicio = fabrica.crearServicioAbordo();
    }

    public void mostrar() {
        asiento.describir();
        servicio.servir();
    }
}
