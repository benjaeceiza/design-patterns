package comportamiento.memento;
//Originator  (El Editor de texto que crea y usa los mementos)
public class EditorDeTexto {
    private String contenido = "";

    public void escribir(String texto) {
        this.contenido += texto;
    }

    public String getContenido() {
        return this.contenido;
    }

    // Guarda el estado actual en un Memento
    public EditorMemento guardar() {
        return new EditorMemento(this.contenido);
    }

    // Restaura el estado a partir de un Memento
    public void restaurar(EditorMemento memento) {
        this.contenido = memento.getContenido();
    }
}
