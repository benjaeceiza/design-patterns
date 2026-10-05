package comportamiento.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Contexto {
    private Map<String, Integer> variables = new HashMap<>();

    public void setVariable(String nombre, int valor) {
        variables.put(nombre, valor);
    }

    public int getValor(String nombre) {
        return variables.get(nombre); 
    }
}
