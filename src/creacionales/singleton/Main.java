package creacionales.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Prueba del Patrón Singleton ---");
        
        // Intentamos crear dos instancias con distintos valores
        System.out.println("Creando la primera instancia...");
        Singleton singleton1 = Singleton.getInstance("BASE_DE_DATOS_A");
        
        System.out.println("Intentando crear una segunda instancia...");
        Singleton singleton2 = Singleton.getInstance("BASE_DE_DATOS_B");
        
        // Comprobamos qué valor tienen
        System.out.println("\nValor del singleton1: " + singleton1.getValor());
        System.out.println("Valor del singleton2: " + singleton2.getValor());
        
        // Verificamos si son exactamente el mismo objeto en memoria
        System.out.println("\n¿Son el mismo objeto en memoria?");
        if (singleton1 == singleton2) {
            System.out.println("¡Éxito! Ambas variables contienen la misma instancia.");
        } else {
            System.out.println("Fallo. Son instancias diferentes.");
        }
    }
}