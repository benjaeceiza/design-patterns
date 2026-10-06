package estructurales.facade;

//subcomponente 1: control de iluminacion
public class Luces {
    public void atenuar(int nivel) {
        System.out.println("Luces atenuadas al " + nivel + "%.");
    }

    public void encender() {
        System.out.println("Luces encendidas a brillo completo.");
    }
}
