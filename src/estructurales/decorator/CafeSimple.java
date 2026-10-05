package estructurales.decorator;

public class CafeSimple implements Bebida {
    @Override
    public String getDescripcion() { return "Café"; }

    @Override
    public double getCosto() { return 1500; }
}
