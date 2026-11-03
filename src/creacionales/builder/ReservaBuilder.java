package creacionales.builder;

public class ReservaBuilder implements Builder {
    private ReservaDeVuelo reserva;

    public ReservaBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.reserva = new ReservaDeVuelo();
    }

    @Override
    public void setOrigen(String origen) {
        reserva.setOrigen(origen);
    }

    @Override
    public void setDestino(String destino) {
        reserva.setDestino(destino);
    }

    @Override
    public void setClaseAsiento(String clase) {
        reserva.setClaseAsiento(clase);
    }

    @Override
    public void setEquipajeExtra(boolean extra) {
        reserva.setEquipajeExtra(extra);
    }

    @Override
    public void setMenuEspecial(String menu) {
        reserva.setMenuEspecial(menu);
    }

    // Método exclusivo del builder para retornar el producto final
    public ReservaDeVuelo getResult() {
        ReservaDeVuelo productoTerminado = this.reserva;
        this.reset(); // Prepara el builder para crear uno nuevo
        return productoTerminado;
    }
}