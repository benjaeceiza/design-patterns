package estructurales.decorator;

public class TeSimple implements Bebida {
    @Override
    public String getDescripcion() { return "Té"; }

    @Override
    public double getCosto() { return 1200; }
}