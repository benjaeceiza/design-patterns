package estructurales.flyweight;

public class TipoArbol {
    private String nombre;
    private String color;
    private String textura;

    public TipoArbol(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(int x, int y) {
        System.out.println("Dibujando árbol [" + nombre + "] con color " + color + " y textura '" + textura + "' en coordenadas (" + x + ", " + y + ")");
    }
}
