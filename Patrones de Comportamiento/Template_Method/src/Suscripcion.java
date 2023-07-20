package Template_Method.src;

// Otras subclases de OrdenProcesar proporcionan implementaciones específicas
// de los pasos necesarios para procesar diferentes tipos de pedidos.
public class Suscripcion extends  OrdenProcesar{

    @Override
    protected void validarOrden() {
        System.out.println("Validando el pedido de suscripción...");
    }

    @Override
    protected void prepararOrden() {
        System.out.println("Preparando el pedido de suscripción...");
    }

    @Override
    protected void pasosAdicionales() {
        System.out.println("Registrando al cliente para la suscripción...");
    }

    @Override
    protected void shipOrder() {
        System.out.println("El pedido de suscripción ha sido activado.");
    }
}
