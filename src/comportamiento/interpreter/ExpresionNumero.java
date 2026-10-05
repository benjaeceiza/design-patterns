package comportamiento.interpreter;

public class ExpresionNumero implements Expresion {
    private int numero;

    public ExpresionNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpretar(Contexto contexto) {
        return this.numero; 
    }
}
