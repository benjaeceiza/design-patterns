package estructurales.decorator;

public abstract class BebidaDecorator implements Bebida {
    protected final Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() { return bebida.getDescripcion(); }

    @Override
    public double getCosto() { return bebida.getCosto(); }
}