package comportamiento.templateMethod;

public abstract class ProcesoCheckIn {
    
    // Este es el "Template Method". Es 'final' para que las subclases no puedan alterar el orden de los pasos.
    public final void realizarCheckIn() {
        System.out.println("Iniciando proceso de Check-in...");
        verificarDocumentos();
        pesarEquipaje();
        emitirBoardingPass();
        System.out.println("Check-in finalizado con éxito.\n");
    }

    // Paso que CAMBIA según el tipo de vuelo (Nacional o Internacional)
    protected abstract void verificarDocumentos();

    // Pasos que son IGUALES para cualquier tipo de vuelo
    private void pesarEquipaje() {
        System.out.println("Pesando el equipaje en la balanza. Todo en regla.");
    }

    private void emitirBoardingPass() {
        System.out.println("Imprimiendo la tarjeta de embarque (Boarding Pass).");
    }
}