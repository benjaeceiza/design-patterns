package estructurales.proxy;
public class ImagenReal implements Imagen {
    private String archivo;

    public ImagenReal(String archivo) {
        this.archivo = archivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {
        System.out.println("Cargando " + archivo + " desde el disco (operación costosa)...");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + archivo);
    }
}