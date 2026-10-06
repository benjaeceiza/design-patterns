package estructurales.facade;

// Subcomponente 4: Control del reproductor
public class ReproductorVideo {
    public void encender() {
        System.out.println("Reproductor de video encendido.");
    }

    public void reproducir(String pelicula) {
        System.out.println("Reproduciendo la película: \"" + pelicula + "\".");
    }

    public void detener() {
        System.out.println("Reproducción detenida.");
    }

    public void apagar() {
        System.out.println("Reproductor de video apagado.");
    }
}
