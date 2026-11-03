package creacionales.objectPool;
import java.util.ArrayList;
import java.util.List;

// Administra la creación, préstamo y devolución de los objetos
public class ConexionPool {
    private List<ConexionBD> disponibles = new ArrayList<>();
    private List<ConexionBD> enUso = new ArrayList<>();
    private int maxConexiones;
    private int contadorConexiones = 0;

    // Define el tamaño máximo de objetos que puede contener el pool
    public ConexionPool(int maxConexiones) {
        this.maxConexiones = maxConexiones;
    }

    // Solicitar un objeto del pool (Acquire)
    public synchronized ConexionBD obtenerConexion() {
        // 1. Si hay un objeto libre en el pool, se reutiliza
        if (!disponibles.isEmpty()) {
            ConexionBD conexion = disponibles.remove(0);
            enUso.add(conexion);
            System.out.println(" Reutilizando conexión existente [" + conexion.getId() + "]");
            return conexion;
        }

        // 2. Si no hay disponibles pero no superamos el límite, creamos uno nuevo
        if (enUso.size() < maxConexiones) {
            contadorConexiones++;
            ConexionBD nuevaConexion = new ConexionBD("DB-Conn-" + contadorConexiones);
            enUso.add(nuevaConexion);
            return nuevaConexion;
        }

        // 3. Si el pool alcanzó su límite, no se entregan más conexiones
        System.out.println(" Error: No hay conexiones disponibles en el pool.");
        return null;
    }

    // Devolver un objeto al pool (Release)
    public synchronized void liberarConexion(ConexionBD conexion) {
        if (conexion != null && enUso.remove(conexion)) {
            disponibles.add(conexion);
            System.out.println(" Conexión [" + conexion.getId() + "] devuelta al pool.");
        }
    }
}