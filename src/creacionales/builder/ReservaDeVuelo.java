package creacionales.builder;

public class ReservaDeVuelo {
    private String origen;
    private String destino;
    private String claseAsiento;
    private boolean equipajeExtra;
    private String menuEspecial;

    // Setters
    public void setOrigen(String origen) { this.origen = origen; }
    public void setDestino(String destino) { this.destino = destino; }
    public void setClaseAsiento(String claseAsiento) { this.claseAsiento = claseAsiento; }
    public void setEquipajeExtra(boolean equipajeExtra) { this.equipajeExtra = equipajeExtra; }
    public void setMenuEspecial(String menuEspecial) { this.menuEspecial = menuEspecial; }

    public void mostrarDetalles() {
        System.out.println("--- Ticket de Vuelo ---");
        System.out.println("Ruta: " + origen + " -> " + destino);
        System.out.println("Clase: " + claseAsiento);
        System.out.println("Equipaje Extra: " + (equipajeExtra ? "Sí" : "No"));
        System.out.println("Menú Especial: " + menuEspecial);
        System.out.println("-----------------------\n");
    }
}