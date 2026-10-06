package creacionales.abstractfactory;

public class ServicioAbordoEconomico implements ServicioAbordo {
    @Override
    public void servir() {
        System.out.println("Servicio: snack y bebida sin cargo");
    }
}
