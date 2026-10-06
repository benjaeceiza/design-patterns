package comportamiento.strategy;
public class StrategyEjemplo {
    public static void main(String[] args) {
        Carrito carrito = new Carrito(new SinDescuento());
        System.out.println("Sin descuento: " + carrito.calcularTotal(1000));

        carrito.setDescuento(new DescuentoPorcentaje(10));
        System.out.println("10% de descuento: " + carrito.calcularTotal(1000));

        carrito.setDescuento(new DescuentoFijo(150));
        System.out.println("Descuento fijo de 150: " + carrito.calcularTotal(1000));
    }
}