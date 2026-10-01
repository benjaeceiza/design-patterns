package creacionales.singleton;

public class Singleton {
    // La instancia estática que guarda la única copia de la clase
    private static Singleton instancia;
    
    // Un dato de prueba para verificar que es la misma instancia en memoria
    private String valor;

    // 1. Constructor privado para evitar que hagan un "new Singleton()" desde afuera
    private Singleton(String valor) {
        // Simulamos un tiempo de carga (ej. conectarse a la base de datos)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }

    // 2. Método estático que actúa como punto de acceso global
    public static Singleton getInstance(String valor) {
        if (instancia == null) {
            instancia = new Singleton(valor); // Solo se crea la primera vez
        }
        return instancia; // Las demás veces devuelve la ya creada
    }

    public String getValor() {
        return valor;
    }
}