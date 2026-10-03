package comportamiento.mediator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Prueba del Patrón Mediator ---\n");

        // 1. Creamos el Mediador
        TorreDeControl torre = new TorreDeControl();

        // 2. Creamos los objetos (Colegas)
        Avion boeing = new AvionComercial("Boeing 747");
        Avion airbus = new AvionComercial("Airbus A320");
        Avion apache = new Helicoptero("Apache 01");

        // 3. Registramos los aviones en la torre
        torre.registrarAvion(boeing);
        torre.registrarAvion(airbus);
        torre.registrarAvion(apache);

        // 4. Los aviones se comunican a través de la torre
        boeing.enviar("Solicito permiso para aterrizar.");
        
        System.out.println("\n-----------------------------------\n");
        
        apache.enviar("Manteniendo altura a 500 pies, esperando mi turno.");
    }
}