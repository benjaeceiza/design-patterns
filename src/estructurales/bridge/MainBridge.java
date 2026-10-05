package estructurales.bridge;

// 1. Implementor: interfaz que definen los dispositivos
interface Dispositivo {
    boolean estaEncendido();
    void encender();
    void apagar();
    int getVolumen();
    void setVolumen(int volumen);
    int getCanal();
    void setCanal(int canal);
}

// 2. Implementaciones concretas
class Televisor implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 30;
    private int canal = 1;

    @Override
    public boolean estaEncendido() { return encendido; }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Televisor apagado");
    }

    @Override
    public int getVolumen() { return volumen; }

    @Override
    public void setVolumen(int volumen) {
        this.volumen = Math.max(0, Math.min(100, volumen));
        System.out.println("Televisor - volumen: " + this.volumen);
    }

    @Override
    public int getCanal() { return canal; }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;
        System.out.println("Televisor - canal: " + this.canal);
    }
}

class Radio implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 20;
    private int emisora = 1;

    @Override
    public boolean estaEncendido() { return encendido; }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Radio encendida");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Radio apagada");
    }

    @Override
    public int getVolumen() { return volumen; }

    @Override
    public void setVolumen(int volumen) {
        this.volumen = Math.max(0, Math.min(100, volumen));
        System.out.println("Radio - volumen: " + this.volumen);
    }

    @Override
    public int getCanal() { return emisora; }

    @Override
    public void setCanal(int canal) {
        this.emisora = canal;
        System.out.println("Radio - emisora: " + this.emisora);
    }
}

// 3. Abstracción: usa un Dispositivo a través del "puente" (composición)
class ControlRemoto {
    protected Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void alternarEncendido() {
        if (dispositivo.estaEncendido()) {
            dispositivo.apagar();
        } else {
            dispositivo.encender();
        }
    }

    public void subirVolumen() {
        dispositivo.setVolumen(dispositivo.getVolumen() + 10);
    }

    public void bajarVolumen() {
        dispositivo.setVolumen(dispositivo.getVolumen() - 10);
    }

    public void canalSiguiente() {
        dispositivo.setCanal(dispositivo.getCanal() + 1);
    }

    public void canalAnterior() {
        dispositivo.setCanal(dispositivo.getCanal() - 1);
    }
}

// 4. Abstracción refinada: agrega funciones sin tocar los dispositivos
class ControlRemotoAvanzado extends ControlRemoto {

    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
        dispositivo.setVolumen(0);
    }
}

// 5. Cliente
public class MainBridge  {
    public static void main(String[] args) {
        System.out.println("--- Control básico + Televisor ---");
        ControlRemoto control = new ControlRemoto(new Televisor());
        control.alternarEncendido();
        control.subirVolumen();
        control.canalSiguiente();

        System.out.println("--- Control avanzado + Radio ---");
        ControlRemotoAvanzado controlAvanzado = new ControlRemotoAvanzado(new Radio());
        controlAvanzado.alternarEncendido();
        controlAvanzado.subirVolumen();
        controlAvanzado.canalSiguiente();
        controlAvanzado.silenciar();
        controlAvanzado.alternarEncendido();
    }
}