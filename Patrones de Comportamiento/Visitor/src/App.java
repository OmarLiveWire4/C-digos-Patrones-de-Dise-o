package Visitor.src;

/*
El patrón de diseño Visitor permite realizar operaciones en objetos de diferentes
clases sin modificar su código. Este patrón es útil cuando necesitas agregar funcionalidades
a las clases sin cambiar su implementación.

 */


// En la clase `App`, se crea una instancia de cada tipo de obra de arte,
// se agregan a la colección y se utilizan dos tipos de visitantes para realizar operaciones
// en todas las obras de arte. Este es el lugar donde se aplica realmente el patrón de diseño de visitante.

//Resumiendo, el patrón Visitor se utiliza en este código para permitir que las operaciones
// definidas en los objetos `VisitorPriceCalculator` y `VisitorStyleAnalyzer` se apliquen
// a los objetos de las clases `Painting` y `Sculpture`. Cada uno de estos objetos "acepta"
// el objeto visitante, que luego realiza su operación en el objeto visitado. Esto se hace sin modificar
// el código de las clases `Painting` y `Sculpture`, lo que demuestra la principal ventaja del patrón
// de diseño Visitor: permite agregar nuevas operaciones a las clases existentes sin modificarlas.

public class App {

    public static void main(String[] args) {
        Artwork painting = new Painting();
        Artwork sculpture = new Sculpture();

        ArtworkCollection artworkCollection = new ArtworkCollection();
        artworkCollection.addArtwork(painting);
        artworkCollection.addArtwork(sculpture);

        ArtworkVisitor priceCalculator = new VisitorPriceCalculator();
        ArtworkVisitor styleAnalyzer = new VisitorStyleAnalyzer();

        artworkCollection.accept(priceCalculator);

        System.out.println();

        artworkCollection.accept(styleAnalyzer);
    }
}