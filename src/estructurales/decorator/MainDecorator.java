package estructurales.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Bebida cafe = new CafeSimple();
        mostrar(cafe);

        Bebida cafeConLecheYAzucar = new ConAzucar(new ConLeche(new CafeSimple()));
        mostrar(cafeConLecheYAzucar);

        Bebida teCompleto = new ConCrema(new ConAzucar(new ConLeche(new TeSimple())));
        mostrar(teCompleto);

        // Los decoradores se pueden repetir: doble azúcar
        Bebida dobleAzucar = new ConAzucar(new ConAzucar(new CafeSimple()));
        mostrar(dobleAzucar);
    }

    private static void mostrar(Bebida bebida) {
        System.out.printf("%s -> $%.2f%n", bebida.getDescripcion(), bebida.getCosto());
    }
}