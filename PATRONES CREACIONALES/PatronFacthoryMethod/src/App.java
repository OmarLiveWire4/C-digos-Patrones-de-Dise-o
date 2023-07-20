
/*
El patrón Factory Method es un patrón de diseño creacional que proporciona una interfaz para la
creación de objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crearán.

En el código el patrón Factory Method se utiliza para crear diferentes tipos de documentos.

Cada subclase de CreadorDocumento (es decir, CreadorInforme, CreadorFactura, CreadorCarta)
implementa el método crearDocumento() para devolver un tipo concreto de Documento.
Este es el núcleo del patrón Factory Method: delegar la responsabilidad de la creación de objetos en las subclases.
 */

public class App {
    public static void main(String[] args) {
        // Crea un creador de informes
        CreadorDocumento creador = new CreadorInforme();
        // Usa el creador de informes para crear y usar un informe
        creador.usarDocumento();

        // Crea un creador de facturas
        creador = new CreadorFactura();
        // Usa el creador de facturas para crear y usar una factura
        creador.usarDocumento();

        // Crea un creador de cartas
        creador = new CreadorCarta();
        // Usa el creador de cartas para crear y usar una carta
        creador.usarDocumento();
    }
}
