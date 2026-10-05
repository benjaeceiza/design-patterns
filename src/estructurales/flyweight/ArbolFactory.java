package estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static Map<String, TipoArbol> tiposDeArboles = new HashMap<>();

    public static TipoArbol getTipoArbol(String nombre, String color, String textura) {
        TipoArbol resultado = tiposDeArboles.get(nombre);
        if (resultado == null) {
            resultado = new TipoArbol(nombre, color, textura);
            tiposDeArboles.put(nombre, resultado);
            System.out.println(">> Creando nuevo TIPO de árbol en caché: " + nombre);
        }
        return resultado;
    }
}
