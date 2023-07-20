import java.util.List;

/*
El patrón Iterator está aplicado en las clases MiIterador y MiColeccion.
La clase MiIterador implementa la interfaz Iterator de Java y proporciona los métodos hasNext() y next().
La clase MiColeccion implementa la interfaz Iterable de Java y proporciona el método iterator().
Esta implementación permite recorrer los elementos de una instancia de MiColeccion de una manera ordenada
y sin exponer los detalles de su implementación interna.
 */


public class PruebaIterator {
    public static void main(String[] args) {
        List<String> elementos = List.of("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4");

        // Iteración con un bucle for-each. Este bucle utiliza internamente un iterador.
        for (String elemento : elementos) {
            System.out.println(elemento); // Imprime cada elemento.
        }

        // Iteración con un Iterador personalizado.
        Iterador<String> iterador = new MiIterador<String>(elementos); // Crea un nuevo iterador.
        while (iterador.tieneSiguiente()) { // Mientras haya más elementos...
            String elemento = iterador.siguiente(); // Obtiene el siguiente elemento.
            System.out.println(elemento); // Imprime el elemento.
        }
    }
}



