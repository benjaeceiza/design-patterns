package comportamiento.chainOfResponsibility;

public abstract class Handler {
    //referencia al siguiente manejador en la cadena de reponsabilidad
    protected Handler nextHandler;

    //configura cual es el siguiente manejador y lo retorna para permitir el encadenamiento de llamadas
    public Handler setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    //metodo abstracto que sera implementado por los manejadores concretos
    public abstract void handle(String request);
}