// Clase concreta para los creadores de cartas
// Esta es una subclase de CreadorDocumento que crea una Carta

public class CreadorCarta extends CreadorDocumento {
    // Sobrescribe el método abstracto para devolver una Carta
    public Documento crearDocumento() {
        return new Carta();
    }
}