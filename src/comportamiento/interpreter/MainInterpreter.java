package comportamiento.interpreter;

public class MainInterpreter {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        contexto.setVariable("x", 10);
        contexto.setVariable("y", 5);
        contexto.setVariable("z", 2);

        Expresion x = new ExpresionVariable("x");
        Expresion y = new ExpresionVariable("y");
        Expresion sumaXY = new ExpresionSuma(x, y);

        Expresion z = new ExpresionVariable("z");
        Expresion formulaCompleta = new ExpresionResta(sumaXY, z);

        int resultado = formulaCompleta.interpretar(contexto);
        
        System.out.println("El resultado de x + y - z es: " + resultado); 
    }
}
