package creacionales.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        // Vuelo plantilla: la configuración de la ruta se carga UNA sola vez
        Vuelo plantilla = new Vuelo("AV101", "Buenos Aires", "Mendoza", "Lunes 05/10",
                180, new Tarifa("Económica", 120));
        System.out.println("Plantilla: " + plantilla);

        // La semana siguiente: clonamos y cambiamos solo lo que cambia
        Vuelo proximaSemana = plantilla.clonar();
        proximaSemana.setFecha("Lunes 12/10");
        proximaSemana.getTarifa().setPrecio(90); // promoción solo para este vuelo

        System.out.println("Clon:      " + proximaSemana);
        System.out.println("Plantilla: " + plantilla); // sigue en USD 120 -> copia profunda OK

        // Catálogo de rutas: pedimos vuelos nuevos por ruta
        CatalogoVuelos catalogo = new CatalogoVuelos();
        catalogo.registrar("BUE-MDZ", plantilla);

        Vuelo v1 = catalogo.programar("BUE-MDZ");
        Vuelo v2 = catalogo.programar("BUE-MDZ");
        v2.setCodigo("AV102");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("¿v1 y v2 son el mismo objeto? " + (v1 == v2)); // false
    }
}
