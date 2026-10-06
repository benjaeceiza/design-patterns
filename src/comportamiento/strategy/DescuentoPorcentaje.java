package comportamiento.strategy;
public class DescuentoPorcentaje implements Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(double monto) {
        return monto - (monto * porcentaje / 100);
    }
}