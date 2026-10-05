package creacionales.prototype;

// Contrato: todo objeto que sepa copiarse a sí mismo
public interface Prototipo<T> {
    T clonar();
}
