package comportamiento.memento;

public class MainMemento {
    public static void main(String[] args) {
        EditorDeTexto editor = new EditorDeTexto();
        Historial historial = new Historial();

        

        // Escribimos algo y guardamos el estado
        editor.escribir("Hola ");
          System.out.println("Texto actual: " + editor.getContenido()); 
        historial.guardarEstado(editor); // Se guarda "Hola "
  
        // Escribimos más cosas y volvemos a guardar
        editor.escribir("vuens "); // Se escribe "Hola vuens" en vez de buenas 
        historial.guardarEstado(editor); // Se guarda "Hola vuens"
           System.out.println("Texto actual: " + editor.getContenido()); 

           editor.escribir("****Error****");
        // Escribimos otro mensaje (pero NO lo guardamos en el historial,
        //  porque no vamos a seguir escribiendo despues de estos errores)
                System.out.println("Texto actual: " + editor.getContenido()); 
        // Imprime: "Hola vuens ****Error****"

        //  Deshacemos la última acción   
        historial.deshacer(editor);
        System.out.println("Después de deshacer 1: " + editor.getContenido()); 
        // Imprime: "Hola vuens "

        // Deshacemos otra vez
        historial.deshacer(editor);
        System.out.println("Después de deshacer 2: " + editor.getContenido()); 
        // Imprime: "Hola "

       
    }
}
