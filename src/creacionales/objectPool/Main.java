package creacionales.objectPool;

// Demostración de uso del Object Pool
public class Main {
    public static void main(String[] args) {
        // Se crea un pool con un límite máximo de 2 conexiones simultáneas
        ConexionPool pool = new ConexionPool(2);

        // 1. Solicitar dos conexiones (se crearán por primera vez)
        System.out.println("--- Peticiones Iniciales ---");
        ConexionBD c1 = pool.obtenerConexion();
        ConexionBD c2 = pool.obtenerConexion();

        if (c1 != null) c1.ejecutarConsulta("SELECT * FROM usuarios");
        if (c2 != null) c2.ejecutarConsulta("SELECT * FROM productos");

        // 2. Intentar pedir una tercera conexión (supera el límite del pool)
        System.out.println("\n--- Intento de pedir una 3ra conexión ---");
        ConexionBD c3 = pool.obtenerConexion(); 

        // 3. Liberar la primera conexión para devolverla al pool
        System.out.println("\n--- Liberando una conexión ---");
        pool.liberarConexion(c1);

        // 4. Volver a pedir una conexión (reutilizará la que acabamos de liberar)
        System.out.println("\n--- Reutilizando conexión ---");
        ConexionBD c4 = pool.obtenerConexion();
        if (c4 != null) c4.ejecutarConsulta("UPDATE usuarios SET activo = true");
    }
}
