package Visitor.src;

// Interfaz que define las operaciones que los visitantes pueden realizar.


// Aquí, ArtworkVisitor es una interfaz que define los métodos que los objetos visitor
// deben implementar. Los métodos de visitante son sobrecargados, es decir, tienen
// el mismo nombre pero diferentes parámetros de tipo.
public interface ArtworkVisitor {
    void visit(Painting painting);
    void visit(Sculpture sculpture);
}

