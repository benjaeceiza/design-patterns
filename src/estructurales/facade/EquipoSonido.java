package estructurales.facade;

// Subcomponente 3: Control del sistema de audio
public class EquipoSonido {
    public void encender() {
        System.out.println("Equipo de sonido encendido.");
    }

    public void setVolumen(int nivel) {
        System.out.println("Volumen ajustado a " + nivel + ".");
    }

    public void apagar() {
        System.out.println("Equipo de sonido apagado.");
    }
}
