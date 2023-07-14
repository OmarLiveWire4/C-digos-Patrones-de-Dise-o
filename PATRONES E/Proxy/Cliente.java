package Proxy;

// Clase Cliente que utiliza el Proxy.

//  a ImagenReal es un objeto con una operación costosa: cargar una imagen desde el disco.
//  El ImagenProxy es un objeto con la misma interfaz que ImagenReal
//  y se utiliza para controlar el acceso a la ImagenReal. El ImagenProxy mantiene
//  una referencia a la ImagenReal y puede cargar la imagen sólo cuando realmente se necesita,
//  en este caso, cuando su método mostrar() es invocado.
//
//Este ejemplo es un uso válido del patrón Proxy porque el Proxy (ImagenProxy)
// controla el acceso a otro objeto (ImagenReal), proporcionando la misma interfaz (Imagen)
// y añadiendo alguna funcionalidad extra, en este caso, la carga diferida de la imagen.

public class Cliente {

    public static void main(String[] args) {
        Imagen imagen1 = new ImagenProxy("imagen1.jpg");
        Imagen imagen2 = new ImagenProxy("imagen2.jpg");

        // La imagen se carga y muestra aquí.
        imagen1.mostrar();

        // Aquí, como la imagen ya está cargada, el proxy simplemente la muestra sin volver a cargarla.
        imagen1.mostrar();

        // La imagen se carga y muestra aquí.
        imagen2.mostrar();
    }
}
