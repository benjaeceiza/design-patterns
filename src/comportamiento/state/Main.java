package comportamiento.state;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Prueba del Patrón State ---");
        Telefono miCelu = new Telefono(); // Arranca apagado

        miCelu.presionarBotonInicio();    // ❌ No pasa nada
        miCelu.presionarBotonEncendido(); // 📱 Se enciende y queda bloqueado
        miCelu.presionarBotonInicio();    // 🔓 Se desbloquea
        miCelu.presionarBotonInicio();    // 🏠 Va al Home
        miCelu.presionarBotonEncendido(); // 🔒 Se bloquea de nuevo
    }
}