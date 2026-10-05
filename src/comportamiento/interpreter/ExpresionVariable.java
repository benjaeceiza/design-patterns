package comportamiento.interpreter;

public class ExpresionVariable implements Expresion {
    private String nombre;

    public ExpresionVariable(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int interpretar(Contexto contexto) {
        return contexto.getValor(this.nombre);
    }
}
