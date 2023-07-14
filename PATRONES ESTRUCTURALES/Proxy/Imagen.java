package Proxy;


// El patrón de diseño Proxy es un tipo de patrón estructural que proporciona un objeto
// que controla el acceso a otro objeto. El objeto Proxy puede agregar
// funcionalidad al objeto real, como la carga diferida, la protección de acceso y
// la distribución de la carga.
//
//A
// Ejemplo de cómo se puede implementar el patrón proxy en Java.
// Este ejemplo muestra un sistema donde un cliente realiza una petición para ver un archivo de imagen.
// El proxy actúa como intermediario y maneja la carga de la imagen, sólo si es necesario.
// Interfaz Imagen que declara el método mostrar.
public interface Imagen {
    void mostrar();
}

