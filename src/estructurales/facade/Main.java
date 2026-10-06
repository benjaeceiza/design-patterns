package estructurales.facade;

// El cliente utiliza la Fachada para interactuar con todo el sistema
// sin necesidad de conocer los detalles de cada componente individual.
public class Main {
    public static void main(String[] args) {
        // 1. Se instancian los componentes del subsistema
        Luces luces = new Luces();
        Proyector proyector = new Proyector();
        EquipoSonido sonido = new EquipoSonido();
        ReproductorVideo reproductor = new ReproductorVideo();

        // 2. Se crea la Fachada pasando los componentes
        CineFachada cine = new CineFachada(luces, proyector, sonido, reproductor);

        // 3. El cliente invoca operaciones complejas con una sola línea
        cine.verPelicula("Matrix");

        // Simulación de tiempo transcurrido...

        // 4. Se apaga todo mediante un solo llamado
        cine.terminarPelicula();
    }
}