package Proxy;

// Clase ImagenReal que implementa la interfaz Imagen. Esta es la clase real a la que el Proxy proporciona acceso.
public class ImagenReal implements Imagen {
    private String nombreArchivo;

    public ImagenReal(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco(){
        System.out.println("Cargando " + nombreArchivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + nombreArchivo);
    }
}
