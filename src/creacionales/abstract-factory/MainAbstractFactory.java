package creacionales.abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        // Elegimos la fábrica UNA sola vez (según la clase que compró el pasajero)
        String clase = "business";
        FabricaClase fabrica = clase.equals("business") ? new FabricaBusiness() : new FabricaEconomica();

        System.out.println("--- Pasajero en clase " + clase + " ---");
        new ExperienciaDeVuelo(fabrica).mostrar();

        // Otra clase = otra fábrica, el resto del código no se toca
        System.out.println("--- Pasajero en clase económica ---");
        new ExperienciaDeVuelo(new FabricaEconomica()).mostrar();
    }
}
