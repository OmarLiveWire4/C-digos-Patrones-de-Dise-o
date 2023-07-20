package Visitor.src;

import java.util.ArrayList;
import java.util.List;

// Clase que representa una colección de obras de arte y permite a los visitantes realizar
// operaciones en todas las obras de arte.

// ArtworkCollection es una clase que representa una colección de obras de arte.
// Tiene un método accept() que permite a los visitantes realizar operaciones en todas las obras
// de arte de la colección.

class ArtworkCollection {
    private List<Artwork> artworks = new ArrayList<>();

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork) {
        artworks.remove(artwork);
    }

    public void accept(ArtworkVisitor visitor) {
        for (Artwork artwork : artworks) {
            artwork.accept(visitor);
        }
    }
}

