package comportamiento.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        //se crean los eslabones de la cadena de responsabilidad
        Handler nivel1 = new Nivel1Handler();
        Handler nivel2 = new Nivel2Handler();
        Handler nivel3 = new Nivel3Handler();

        //se establece la cadena de responsabilidad
        nivel1.setNext(nivel2).setNext(nivel3);

        //se realizan las solicitudes a la cadena de responsabilidad
        System.out.println("Enviando peticion 'intermedio':");
        nivel1.handle("intermedio");
    }
}
