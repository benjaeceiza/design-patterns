package estructurales.flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();

        System.out.println("--- Plantando árboles ---");
        // Aunque plantamos 5 árboles, sólo se crearán 2 "Tipos" (Pino y Roble) en memoria.
        bosque.plantarArbol(10, 20, "Pino", "Verde oscuro", "TexturaPino.png");
        bosque.plantarArbol(15, 25, "Pino", "Verde oscuro", "TexturaPino.png");
        bosque.plantarArbol(50, 60, "Roble", "Verde claro", "TexturaRoble.png");
        bosque.plantarArbol(55, 65, "Roble", "Verde claro", "TexturaRoble.png");
        bosque.plantarArbol(60, 70, "Pino", "Verde oscuro", "TexturaPino.png");

        System.out.println("\n--- Dibujando bosque ---");
        bosque.dibujar();
    }
}
