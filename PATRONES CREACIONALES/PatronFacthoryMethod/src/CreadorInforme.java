// Clase concreta para los creadores de informes
// Esta es una subclase de CreadorDocumento que crea un Informe
public class CreadorInforme extends CreadorDocumento {
    // Sobrescribe el método abstracto para devolver un Informe
    public Documento crearDocumento() {
        return new Informe();
    }
}