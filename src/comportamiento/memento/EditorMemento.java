package comportamiento.memento;

// Snapshot 
public class EditorMemento {
    private final String contenido;

    public EditorMemento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}
