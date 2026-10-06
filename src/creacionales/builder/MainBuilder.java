package creacionales.builder;

public class MainBuilder {
    public static void main(String[] args) {
        AgenciaDeVuelos director = new AgenciaDeVuelos();
        ReservaBuilder builder = new ReservaBuilder();

        // 1. El Director arma un paquete Premium
        director.construirPaquetePremium(builder, "Buenos Aires", "Madrid");
        ReservaDeVuelo reservaPremium = builder.getResult();
        System.out.println("Reserva VIP creada por la Agencia:");
        reservaPremium.mostrarDetalles();

        // 2. El Director arma un paquete Económico
        director.construirPaqueteEconomico(builder, "Córdoba", "Mendoza");
        ReservaDeVuelo reservaEcon = builder.getResult();
        System.out.println("Reserva Económica creada por la Agencia:");
        reservaEcon.mostrarDetalles();

        // 3. Uso libre del Builder sin el Director (Reserva a Medida)
        builder.reset();
        builder.setOrigen("San Luis");
        builder.setDestino("Bariloche");
        builder.setClaseAsiento("Turista");
        builder.setEquipajeExtra(true); // Solo quiere extra equipaje, menú normal
        builder.setMenuEspecial("Sin TACC");
        
        ReservaDeVuelo reservaPersonalizada = builder.getResult();
        System.out.println("Reserva Personalizada (sin director):");
        reservaPersonalizada.mostrarDetalles();
    }
}