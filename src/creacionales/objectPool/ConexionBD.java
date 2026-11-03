package creacionales.objectPool;

// Representa el objeto costoso de crear que queremos reutilizar
public class ConexionBD {
    private String id;

    public ConexionBD(String id) {
        this.id = id;
        // Simula una operación costosa en tiempo y recursos
        System.out.println(" Creando nueva conexión a la Base de Datos [" + id + "]...");
    }

    public void ejecutarConsulta(String sql) {
        System.out.println("Ejecutando SQL (" + id + "): " + sql);
    }

    public String getId() {
        return id;
    }
}
