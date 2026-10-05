package estructurales.decorator;

public class ConAzucar extends BebidaDecorator {
    public ConAzucar(Bebida bebida) { super(bebida); }

    @Override
    public String getDescripcion() { return super.getDescripcion() + " + azúcar"; }

    @Override
    public double getCosto() { return super.getCosto() + 100; }
}