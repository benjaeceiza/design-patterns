package creacionales.builder;

public class AgenciaDeVuelos {
    
    public void construirPaqueteEconomico(Builder builder, String origen, String destino) {
        builder.reset();
        builder.setOrigen(origen);
        builder.setDestino(destino);
        builder.setClaseAsiento("Turista");
        builder.setEquipajeExtra(false);
        builder.setMenuEspecial("Estándar");
    }

    public void construirPaquetePremium(Builder builder, String origen, String destino) {
        builder.reset();
        builder.setOrigen(origen);
        builder.setDestino(destino);
        builder.setClaseAsiento("Business / Primera Clase");
        builder.setEquipajeExtra(true);
        builder.setMenuEspecial("Gourmet / Opciones Veganas");
    }
}