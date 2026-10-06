package comportamiento.strategy;
public class DescuentoFijo implements Descuento {
    private double valor;

    public DescuentoFijo(double valor) {
        this.valor = valor;
    }

    @Override
    public double aplicar(double monto) {
        return Math.max(0, monto - valor);
    }
}