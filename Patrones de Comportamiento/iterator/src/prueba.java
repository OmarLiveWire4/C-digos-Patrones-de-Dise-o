import java.util.Iterator;
import java.util.List;

/*
El patrón de diseño Iterator, también conocido como Iterador, proporciona una forma de acceder a
 los elementos de un objeto agregado secuencialmente sin exponer su representación subyacente.
 En otras palabras, permite recorrer una colección de objetos sin revelar los detalles de implementación
 de la colección.

En Java, el patrón Iterator está implementado utilizando las interfaces Iterable e Iterator. La interfaz
Iterable tiene un único método, iterator(), que devuelve un objeto Iterator. Por otro lado, la interfaz
 Iterator tiene dos métodos principales, hasNext() y next(), que permiten recorrer la colección.
 */


// Esta es tu interfaz personalizada para un iterador.
interface Iterador<T> {
    boolean tieneSiguiente(); // Método para comprobar si hay más elementos en la colección.
    T siguiente(); // Método para obtener el siguiente elemento de la colección.
}

// Esta es la clase concreta que implementa tanto la interfaz de Java Iterator como la interfaz personalizada Iterador.
class MiIterador<T> implements Iterator<T>, Iterador<T> {
    private List<T> elementos; // Lista de elementos a iterar.
    private int indice; // Índice actual en la lista de elementos.

    public MiIterador(List<T> elementos) {
        this.elementos = elementos; // Inicializa la lista de elementos.
        this.indice = 0; // Inicializa el índice a 0.
    }

    @Override
    public boolean hasNext() { // Este método comprueba si hay más elementos en la lista.
        return indice < elementos.size(); // Devuelve true si el índice es menor que el tamaño de la lista.
    }

    @Override
    public T next() { // Este método obtiene el siguiente elemento de la lista.
        if (hasNext()) { // Comprueba si hay más elementos.
            T elemento = elementos.get(indice); // Obtiene el elemento actual de la lista.
            indice++; // Incrementa el índice.
            return elemento; // Devuelve el elemento actual.
        }
        return null; // Si no hay más elementos, devuelve null.
    }

    @Override
    public boolean tieneSiguiente() { // Este método es equivalente a hasNext().
        return hasNext();
    }

    @Override
    public T siguiente() { // Este método es equivalente a next().
        return next();
    }
}

// Esta es la clase concreta que implementa la interfaz Iterable de Java.
class MiColeccion<T> implements Iterable<T> {
    private List<T> elementos; // Lista de elementos en la colección.

    public MiColeccion(List<T> elementos) {
        this.elementos = elementos; // Inicializa la lista de elementos.
    }

    @Override
    public Iterator<T> iterator() { // Este método devuelve un iterador para la colección.
        return new MiIterador<T>(elementos); // Crea y devuelve un nuevo iterador para la lista de elementos.
    }
}


