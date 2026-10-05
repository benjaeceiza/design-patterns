package comportamiento.memento;

import java.util.Stack;
// Caretaker (El Historial que mantiene los mementos dentro del stack)
public class Historial {
    private Stack<EditorMemento> pilaMementos = new Stack<>();

    public void guardarEstado(EditorDeTexto editor) {
        pilaMementos.push(editor.guardar());
    }

    public void deshacer(EditorDeTexto editor) {
        if (!pilaMementos.isEmpty()) {
            EditorMemento ultimoEstado = pilaMementos.pop();
            editor.restaurar(ultimoEstado);
        } else {
            System.out.println("No hay nada para deshacer.");
        }
    }
}
