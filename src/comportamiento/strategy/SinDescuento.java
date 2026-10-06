package comportamiento.strategy;
public class SinDescuento implements Descuento {
    @Override
    public double aplicar(double monto) {
        return monto;
    }
}