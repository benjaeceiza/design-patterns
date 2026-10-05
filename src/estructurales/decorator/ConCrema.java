package estructurales.decorator;

public class ConCrema extends BebidaDecorator {
    public ConCrema(Bebida bebida) { super(bebida); }

    @Override
    public String getDescripcion() { return super.getDescripcion() + " + crema"; }

    @Override
    public double getCosto() { return super.getCosto() + 500; }
}