package comportamiento.interpreter;

public class ExpresionSuma implements Expresion {
    private Expresion izquierda;
    private Expresion derecha;

    public ExpresionSuma(Expresion izquierda, Expresion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    @Override
    public int interpretar(Contexto contexto) {
        return izquierda.interpretar(contexto) + derecha.interpretar(contexto);
    }
}
