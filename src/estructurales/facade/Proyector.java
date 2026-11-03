package estructurales.facade;

// Subcomponente 2: Control del proyector
public class Proyector {
    public void encender() {
        System.out.println("Proyector encendido.");
    }

    public void modoModoCine() {
        System.out.println("Proyector configurado en formato panorámico (16:9).");
    }

    public void apagar() {
        System.out.println("Proyector apagado.");
    }
}
