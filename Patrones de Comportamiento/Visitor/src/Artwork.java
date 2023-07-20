package Visitor.src;

/*
Artwork es una clase abstracta que define el método accept(). Este método toma un objeto
 que implementa la interfaz ArtworkVisitor y se usa para aceptar cualquier objeto que sea un ArtworkVisitor.
 */

// Clase abstracta que define un método de aceptación para los visitantes.
public abstract class Artwork {
    public abstract void accept(ArtworkVisitor visitor);
}


