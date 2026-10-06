package estructurales.proxy;
public class ProxyEjemplo {
    public static void main(String[] args) {
        Imagen imagen = new ImagenProxy("foto.jpg");

        System.out.println("Imagen creada, todavía no se cargó nada.");

        System.out.println("-- Primer mostrar --");
        imagen.mostrar();

        System.out.println("-- Segundo mostrar --");
        imagen.mostrar();
    }
}