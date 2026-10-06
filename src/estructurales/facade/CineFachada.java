package estructurales.facade;

// Esta clase actúa como Fachada.
// Oculta la complejidad de interactuar con Luces, Proyector, EquipoSonido y Reproductor.
public class CineFachada {
    private Luces luces;
    private Proyector proyector;
    private EquipoSonido sonido;
    private ReproductorVideo reproductor;

    // El constructor recibe o inicializa todas las dependencias complejas del subsistema
    public CineFachada(Luces luces, Proyector proyector, EquipoSonido sonido, ReproductorVideo reproductor) {
        this.luces = luces;
        this.proyector = proyector;
        this.sonido = sonido;
        this.reproductor = reproductor;
    }

    // Método simplificado 1: Prepara todo el entorno para ver una película
    public void verPelicula(String pelicula) {
        System.out.println("=== Preparando el cine para ver una película ===");
        luces.atenuar(20);
        proyector.encender();
        proyector.modoModoCine();
        sonido.encender();
        sonido.setVolumen(15);
        reproductor.encender();
        reproductor.reproducir(pelicula);
        System.out.println("================================================");
    }

    // Método simplificado 2: Apaga ordenadamente todos los equipos
    public void terminarPelicula() {
        System.out.println("\n=== Apagando el sistema de cine ===");
        reproductor.detener();
        reproductor.apagar();
        sonido.apagar();
        proyector.apagar();
        luces.encender();
        System.out.println("====================================");
    }
}
