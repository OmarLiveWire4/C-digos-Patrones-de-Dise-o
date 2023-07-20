package Template_Method.src;

// Esta es una clase abstracta que define la estructura general de un algoritmo
// para procesar un pedido. Las subclases deben proporcionar implementaciones
// específicas de los métodos abstractos.
public abstract class OrdenProcesar {

    public void OrdenProcesar() { // Este es el método de plantilla.
        validarOrden();

        // Esto es común para todos los tipos de pedidos.
        prepararOrden();

        // Esto es específico para cada tipo de pedido.
        pasosAdicionales();

        shipOrder();
    }

    // Estos son los métodos que deben ser implementados por las subclases.
    protected abstract void validarOrden();
    protected abstract void prepararOrden();
    protected abstract void pasosAdicionales();

    // Este método es común a todas las subclases y no necesita ser sobrescrito.
    protected void shipOrder() {
        System.out.println("El pedido ha sido enviado.");
    }
}

