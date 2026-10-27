package comportamiento.command;
import java.util.Stack;

public class Operador {
    private Stack<Comando> historial = new Stack<>();

    public void ejecutarComando(Comando comando) {
        comando.ejecutar();
        historial.push(comando);
    }

    public void deshacerUltimaAccion() {
        if (!historial.isEmpty()) {
            Comando ultimoComando = historial.pop();
            ultimoComando.deshacer();
        } else {
            System.out.println("No hay acciones para deshacer.");
        }
    }
}