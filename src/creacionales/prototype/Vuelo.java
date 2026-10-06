package creacionales.prototype;

// Prototipo concreto: un vuelo que sabe copiarse a sí mismo
public class Vuelo implements Prototipo<Vuelo> {
    private String codigo;
    private String origen;
    private String destino;
    private String fecha;
    private int asientosDisponibles;
    private Tarifa tarifa;

    public Vuelo(String codigo, String origen, String destino, String fecha,
                 int asientosDisponibles, Tarifa tarifa) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.asientosDisponibles = asientosDisponibles;
        this.tarifa = tarifa;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    @Override
    public Vuelo clonar() {
        // Copia profunda: la tarifa también se clona, así el clon NO comparte tarifa con el original
        return new Vuelo(codigo, origen, destino, fecha, asientosDisponibles, tarifa.clonar());
    }

    @Override
    public String toString() {
        return codigo + " " + origen + " -> " + destino + " | " + fecha
                + " | asientos: " + asientosDisponibles + " | tarifa: " + tarifa;
    }
}
