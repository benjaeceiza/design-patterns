package creacionales.abstractfactory;

public class AsientoBusiness implements Asiento {
    @Override
    public void describir() {
        System.out.println("Asiento cama, 150 cm de espacio, totalmente reclinable");
    }
}
