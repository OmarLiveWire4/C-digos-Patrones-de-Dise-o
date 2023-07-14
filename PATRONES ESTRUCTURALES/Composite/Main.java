package Composite;

// Tiene una clase abstracta SistemaArchivo que representa el Componente.
//Tiene una clase Archivo que representa la Hoja.
//Tiene una clase Carpeta que representa el Compuesto.
//Se puede tratar a una Carpeta (que contiene múltiples SistemaArchivo) de
// la misma manera que se trataría a un Archivo individual. Por ejemplo, se puede obtener
// el nombre y el tamaño tanto de un Archivo individual como de una Carpeta.
//El método getTamaño() de la clase Carpeta muestra cómo un compuesto puede delegar operaciones
// a sus subcomponentes y cómo puede combinar los resultados. En este caso, calcula el tamaño
// total sumando los tamaños de todos los SistemaArchivo que contiene.

// Clase principal
public class Main {
    public static void main(String[] args) {
        Archivo archivo1 = new Archivo("Archivo1.txt", 10);
        Archivo archivo2 = new Archivo("Archivo2.txt", 20);

        Carpeta carpeta = new Carpeta("Mis Documentos");
        carpeta.agregar(archivo1);
        carpeta.agregar(archivo2);

        System.out.println("Nombre: " + carpeta.getNombre());
        System.out.println("Tamaño total: " + carpeta.getTamaño());
    }
}
