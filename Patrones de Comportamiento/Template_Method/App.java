package Template_Method;
import java.lang.System;
import Template_Method.src.*;

/*
El patrón Template Method se está utilizando en el método OrdenProcesar
de la clase abstracta OrdenProcesar. Este método define un flujo de trabajo general
para procesar un pedido, y las subclases proporcionan implementaciones específicas de ciertos
 pasos de este flujo de trabajo. Esto permite variaciones en cómo se procesan los pedidos sin
 cambiar la estructura general del flujo de trabajo.
 */

// Este es el método principal que crea instancias de las diferentes subclases
// y ejecuta el método de plantilla en cada una de ellas.

public class App {
    public static void main(String[] args) {
    OrdenProcesar physicalProductOrder = new ProductoFisico();
        System.out.println("******************************************************************************+");
        physicalProductOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");

    OrdenProcesar digitalDownloadOrder = new DigitalDescarga();
        digitalDownloadOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");

    OrdenProcesar  subscriptionOrder = new Suscripcion();
        subscriptionOrder.OrdenProcesar();

        System.out.println("******************************************************************************+");
    }
}

