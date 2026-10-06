package comportamiento.strategy;

public class Carrito {
    private Descuento descuento;

    public Carrito(Descuento descuento) {
        this.descuento = descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public double calcularTotal(double monto) {
        return descuento.aplicar(monto);
    }
}