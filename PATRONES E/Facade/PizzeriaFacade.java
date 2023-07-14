package Facade;

/* Esta es nuestra fachada, que proporciona un único punto de acceso a todas las operaciones del sistema.
   En lugar de que el cliente interactúe directamente con las clases de PreparacionPizza, EntregaPizza y
   CobroPizza, interactuará con la fachada. */
class PizzeriaFacade {
    private PreparacionPizza preparacionPizza;
    private EntregaPizza entregaPizza;
    private CobroPizza cobroPizza;

    public PizzeriaFacade() {
        preparacionPizza = new PreparacionPizza();
        entregaPizza = new EntregaPizza();
        cobroPizza = new CobroPizza();
    }

    // Método de la fachada que oculta la complejidad del sistema.
    public void ordenarPizza() {
        preparacionPizza.prepararPizza();
        entregaPizza.entregarPizza();
        cobroPizza.cobrarPizza();
    }
}