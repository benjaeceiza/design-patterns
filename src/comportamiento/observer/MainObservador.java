package comportamiento.observer;

public class MainObservador {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();
        PantallaActual pantalla = new PantallaActual();
        AlertaCalor alerta = new AlertaCalor(30);

        estacion.suscribir(pantalla);
        estacion.suscribir(alerta);
        System.out.println("Observadores suscriptos: " + estacion.cantidadObservadores());

        System.out.println("\n--- Con 2 observadores ---");
        estacion.registrarMedicion(22.5, 60);
        estacion.registrarMedicion(31.0, 55);

        System.out.println("\n--- Se desuscribe la pantalla ---");
        estacion.desuscribir(pantalla);
        estacion.registrarMedicion(35.0, 40);

        System.out.println("\n--- Verificacion ---");
        System.out.println("Observadores finales: " + estacion.cantidadObservadores());
        boolean ok = estacion.cantidadObservadores() == 1 && alerta.getAlertas() == 2;
        System.out.println(ok ? "TEST OK" : "TEST FALLO");
    }
}