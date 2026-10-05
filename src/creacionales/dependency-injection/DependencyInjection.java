import java.util.ArrayList;
import java.util.List;

public class DependencyInjection {

    // 1) Abstraccion
    interface Notificador {
        void enviar(String destinatario, String mensaje);
    }

    // 2) Implementaciones intercambiables
    static class NotificadorEmail implements Notificador {
        public void enviar(String destinatario, String mensaje) {
            System.out.println("[EMAIL] Para " + destinatario + ": " + mensaje);
        }
    }

    static class NotificadorSMS implements Notificador {
        public void enviar(String destinatario, String mensaje) {
            System.out.println("[SMS] Para " + destinatario + ": " + mensaje);
        }
    }

    static class NotificadorFalso implements Notificador {
        List<String> enviados = new ArrayList<>();
        public void enviar(String destinatario, String mensaje) {
            enviados.add(destinatario + " -> " + mensaje);
        }
    }

    // 3) Clase que RECIBE su dependencia (Constructor Injection)
    static class ServicioPedidos {
        private final Notificador notificador;

        ServicioPedidos(Notificador notificador) {
            this.notificador = notificador;
        }

        void crearPedido(int id, String cliente, double total) {
            notificador.enviar(cliente, "Tu pedido #" + id + " por $" + total + " fue creado");
        }
    }

    // 4) Clase con Setter Injection
    static class ServicioReportes {
        private Notificador notificador;

        void setNotificador(Notificador notificador) {
            this.notificador = notificador;
        }

        void enviarReporte(String destinatario, int cantidad) {
            notificador.enviar(destinatario, "Reporte: " + cantidad + " pedidos");
        }
    }

    // 5) main = composition root: aca se "inyecta" todo
    public static void main(String[] args) {
        ServicioPedidos conEmail = new ServicioPedidos(new NotificadorEmail());
        conEmail.crearPedido(1, "ana@mail.com", 1500.50);

        ServicioPedidos conSms = new ServicioPedidos(new NotificadorSMS());
        conSms.crearPedido(2, "+54 266 4000000", 99.99);

        ServicioReportes reportes = new ServicioReportes();
        reportes.setNotificador(new NotificadorEmail());
        reportes.enviarReporte("jefe@mail.com", 2);

        NotificadorFalso falso = new NotificadorFalso();
        new ServicioPedidos(falso).crearPedido(3, "test@mail.com", 50.0);
        System.out.println(falso.enviados.size() == 1 ? "TEST OK" : "TEST FALLO");
    }
}