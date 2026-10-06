package creacionales.builder;

public interface Builder {
    void reset();
    void setOrigen(String origen);
    void setDestino(String destino);
    void setClaseAsiento(String clase);
    void setEquipajeExtra(boolean extra);
    void setMenuEspecial(String menu);
}