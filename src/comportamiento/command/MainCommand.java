package comportamiento.command;

public class MainCommand {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        Operador operador = new Operador();

        // Creamos la acción de confirmar un vuelo para vos
        Comando confirmarIsa = new ComandoConfirmar(sistema, "Isaías Calabrin");

        System.out.println("--- TURNO DEL OPERADOR ---");
        // El operador ejecuta la acción
        operador.ejecutarComando(confirmarIsa);

        System.out.println("\n--- ERROR DEL OPERADOR ---");
        System.out.println("El operador se dio cuenta de que se equivocó de pasajero.");
        
        // Magia del patrón Command: Deshacer
        operador.deshacerUltimaAccion();
    }
}