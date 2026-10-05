package comportamiento.visitor;

import java.util.List;

// 1. Interfaz Visitor: un método visit por cada tipo concreto de elemento
interface Visitor {
    void visitar(Circulo circulo);
    void visitar(Rectangulo rectangulo);
    void visitar(Triangulo triangulo);
}

// 2. Interfaz Elemento: acepta un visitor
interface Figura {
    void aceptar(Visitor visitor);
}

// 3. Elementos concretos: cada uno llama al método visitar que le corresponde (double dispatch)
class Circulo implements Figura {
    private final double radio;

    public Circulo(double radio) { this.radio = radio; }
    public double getRadio() { return radio; }

    @Override
    public void aceptar(Visitor visitor) { visitor.visitar(this); }
}

class Rectangulo implements Figura {
    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public void aceptar(Visitor visitor) { visitor.visitar(this); }
}

class Triangulo implements Figura {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() { return base; }
    public double getAltura() { return altura; }

    @Override
    public void aceptar(Visitor visitor) { visitor.visitar(this); }
}

// 4. Visitor concreto A: calcula el área total
class CalculadorArea implements Visitor {
    private double total = 0;

    @Override
    public void visitar(Circulo c) {
        total += Math.PI * c.getRadio() * c.getRadio();
    }

    @Override
    public void visitar(Rectangulo r) {
        total += r.getBase() * r.getAltura();
    }

    @Override
    public void visitar(Triangulo t) {
        total += (t.getBase() * t.getAltura()) / 2;
    }

    public double getTotal() { return total; }
}

// 5. Visitor concreto B: describe cada figura (otra operación sin modificar las figuras)
class Descriptor implements Visitor {
    @Override
    public void visitar(Circulo c) {
        System.out.println("Círculo de radio " + c.getRadio());
    }

    @Override
    public void visitar(Rectangulo r) {
        System.out.println("Rectángulo de " + r.getBase() + " x " + r.getAltura());
    }

    @Override
    public void visitar(Triangulo t) {
        System.out.println("Triángulo de base " + t.getBase() + " y altura " + t.getAltura());
    }
}

// 6. Cliente
public class MainVisitor {
    public static void main(String[] args) {
        List<Figura> figuras = List.of(
            new Circulo(2),
            new Rectangulo(3, 4),
            new Triangulo(5, 6)
        );

        Descriptor descriptor = new Descriptor();
        CalculadorArea calculador = new CalculadorArea();

        for (Figura f : figuras) {
            f.aceptar(descriptor);
            f.aceptar(calculador);
        }

        System.out.printf("Área total: %.2f%n", calculador.getTotal());
    }
}
