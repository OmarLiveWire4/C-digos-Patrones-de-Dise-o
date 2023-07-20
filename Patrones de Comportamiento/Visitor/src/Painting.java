package Visitor.src;

// Clases concretas que extienden la clase abstracta Artwork.

//Painting y Sculpture son las clases concretas que extienden Artwork.
// Implementan el método accept() llamando al método visit() del objeto visitante,
// pasándose a sí mismas como argumento.

class Painting extends Artwork {
    @Override
    public void accept(ArtworkVisitor visitor) {
        visitor.visit(this);
    }

    public void displayPainting() {
        System.out.println("Mostrando la pintura");
    }
}