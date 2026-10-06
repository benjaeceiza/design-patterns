package estructurales.adapter;
public class AdapterEjemplo {
    public static void main(String[] args) {
        Pago pago = new PasarelaAdapter(new PasarelaVieja());
        pago.pagar(25.50);
    }
}