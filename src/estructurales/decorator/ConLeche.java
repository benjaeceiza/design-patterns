package estructurales.decorator;

public class ConLeche extends BebidaDecorator {
    public ConLeche(Bebida bebida) { super(bebida); }

    @Override
    public String getDescripcion() { return super.getDescripcion() + " + leche"; }

    @Override
    public double getCosto() { return super.getCosto() + 300; }
}