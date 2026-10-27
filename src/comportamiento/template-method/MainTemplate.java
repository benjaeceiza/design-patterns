package comportamiento.templateMethod;

public class MainTemplate {
    public static void main(String[] args) {
        System.out.println("--- PASAJERO VIAJANDO A MENDOZA ---");
        ProcesoCheckIn checkInNacional = new CheckInNacional();
        checkInNacional.realizarCheckIn();

        System.out.println("--- PASAJERO VIAJANDO A MIAMI ---");
        ProcesoCheckIn checkInInternacional = new CheckInInternacional();
        checkInInternacional.realizarCheckIn();
    }
}