package estructurales.composite;

public class MainComposite {
    public static void main(String[] args) {
        // Paquete del padre
        PaqueteViaje juan = new PaqueteViaje("Pasajero: Juan Pérez");
        juan.agregar(new Pasaje("Buenos Aires -> Miami (AV210)", 800));
        juan.agregar(new ServicioExtra("Equipaje extra 23kg", 60));
        juan.agregar(new ServicioExtra("Menú vegetariano", 15));

        // Paquete del hijo
        PaqueteViaje lucas = new PaqueteViaje("Pasajero: Lucas Pérez (menor)");
        lucas.agregar(new Pasaje("Buenos Aires -> Miami (AV210)", 600));
        lucas.agregar(new ServicioExtra("Asiento junto a ventana", 20));

        // La reserva familiar contiene los paquetes + un extra propio del grupo
        PaqueteViaje familia = new PaqueteViaje("Reserva Familia Pérez");
        familia.agregar(juan);
        familia.agregar(lucas);
        familia.agregar(new ServicioExtra("Seguro de viaje familiar", 50));

        // Mismo trato para todo: el cliente solo conoce ItemReserva
        familia.mostrar("");

        System.out.println("\nTotal a pagar por la familia: USD " + familia.getPrecio());
        System.out.println("Total solo de Juan: USD " + juan.getPrecio());
    }
}
