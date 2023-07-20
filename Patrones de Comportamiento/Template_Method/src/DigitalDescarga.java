package Template_Method.src;

/*
El patrón de diseño Template Method es un patrón de comportamiento que define el esqueleto de
 un algoritmo en la superclase pero permite a las subclases sobrescribir ciertos pasos de este
 algoritmo sin cambiar su estructura general. En el código que proporcionaste, la clase abstracta
  OrdenProcesar define un método (también llamado OrdenProcesar) que establece un flujo de trabajo
  general para procesar una orden, y las subclases DigitalDescarga, ProductoFisico y Suscripcion proporcionan
  implementaciones específicas de ciertos pasos de este flujo de trabajo.
 */
// Esta es una subclase de OrdenProcesar y proporciona una implementación específica
// de los pasos necesarios para procesar un pedido de descarga digital.
public class DigitalDescarga extends  OrdenProcesar{

    @Override
    // Este método valida el pedido de descarga digital.
    protected void validarOrden() {
        System.out.println("Validando el pedido de descarga digital...");
    }

    @Override
    // Este método prepara el pedido de descarga digital.
    protected void prepararOrden() {
        System.out.println("Preparando el pedido de descarga digital...");
    }

    @Override
    // Este método genera el enlace de descarga.
    protected void pasosAdicionales() {
        System.out.println("Generando el enlace de descarga...");
    }
}

