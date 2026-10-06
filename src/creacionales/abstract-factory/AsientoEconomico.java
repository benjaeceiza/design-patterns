package creacionales.abstractfactory;

public class AsientoEconomico implements Asiento {
    @Override
    public void describir() {
        System.out.println("Asiento estándar, 79 cm de espacio, reclinable 10°");
    }
}
