package estructurales.adapter;
public class PasarelaAdapter implements Pago {
    private PasarelaVieja pasarela;

    public PasarelaAdapter(PasarelaVieja pasarela) {
        this.pasarela = pasarela;
    }

    @Override
    public void pagar(double monto) {
        int centavos = (int) (monto * 100);
        pasarela.realizarTransaccion(centavos);
    }
}