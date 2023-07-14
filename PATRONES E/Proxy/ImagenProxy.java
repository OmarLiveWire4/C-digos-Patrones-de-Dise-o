package Proxy;

// Clase ImagenProxy que implementa la interfaz Imagen. Esta es la clase Proxy que controla el acceso a la ImagenReal.
public class ImagenProxy implements Imagen {
    private ImagenReal imagenReal;
    private String nombreArchivo;

    public ImagenProxy(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void mostrar() {
        if(imagenReal == null){
            imagenReal = new ImagenReal(nombreArchivo);
        }
        imagenReal.mostrar();
    }
}
