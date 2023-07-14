package Facade;


// proporciona una interfaz simplificada (la clase PizzeriaFacade) a un sistema complejo
// (las clases PreparacionPizza, EntregaPizza y CobroPizza). En lugar de tener que interactuar
// directamente con cada una de estas clases, el cliente solo necesita interactuar con la fachada.
// Esto simplifica la interacción del cliente con el sistema, ya que no necesita conocer todos
// los detalles del sistema.

public class Main {
    public static void main(String[] args) {
        // El cliente interactúa solo con la fachada.
        PizzeriaFacade pizzeria = new PizzeriaFacade();
        pizzeria.ordenarPizza();
    }
}
