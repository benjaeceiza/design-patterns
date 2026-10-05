package creacionales.abstractfactory;

public class ServicioAbordoBusiness implements ServicioAbordo {
    @Override
    public void servir() {
        System.out.println("Servicio: menú de tres pasos, vino y sala VIP");
    }
}
