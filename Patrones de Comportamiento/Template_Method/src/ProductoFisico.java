package Template_Method.src;

// // Otras subclases de OrdenProcesar proporcionan implementaciones específicas
//// de los pasos necesarios para procesar diferentes tipos de pedidos.
public class ProductoFisico extends OrdenProcesar {

    @Override
    protected void validarOrden() {
        System.out.println("Validando el pedido de producto físico...");
    }

    @Override
    protected void prepararOrden() {
        System.out.println("Preparando el pedido de producto físico...");
    }

    @Override
    protected void pasosAdicionales() {
        System.out.println("Empaquetando el producto físico...");
    }

}
