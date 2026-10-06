package comportamiento.chainOfResponsibility;

//manejador especifico para solicitudes de nivel avanzado
public class Nivel3Handler extends Handler {
    @Override
    public void handle(String request) {
        //verifica si este manejador puede resolver la peticion
        if (request.equalsIgnoreCase("avanzado")) {
            System.out.println("Nivel 3: Atendido y resuelto.");
        } 
        //si no puede resolver la peticion, pasa la solicitud al siguiente manejador en la cadena
        else if (nextHandler != null) {
            nextHandler.handle(request);
        } 
        //si no hay un siguiente manejador, indica que la solicitud no pudo ser procesada
        else {
            System.out.println("Nadie pudo procesar la solicitud: " + request);
        }
    }
    
}
