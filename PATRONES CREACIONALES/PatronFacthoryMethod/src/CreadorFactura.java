// Clase concreta para los creadores de facturas
// Esta es una subclase de CreadorDocumento que crea una Factura
public class CreadorFactura extends CreadorDocumento {
    // Sobrescribe el método abstracto para devolver una Factura
    public Documento crearDocumento() {
        return new Factura();
    }
}
