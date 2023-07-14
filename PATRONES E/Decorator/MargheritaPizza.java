package Decorator;

//El patrón Decorator, se utiliza para añadir nuevas funcionalidades a un objeto de una manera
// que es transparente para su operación. Los decoradores proporcionan una alternativa flexible
// a la herencia para extender la funcionalidad. En esencia, el patrón Decorator implica una
// serie de decoradores que se utilizan para envolver objetos concretos. Los decoradores r
// eflejan el mismo tipo de objeto que están decorando. No solo pueden añadir comportamientos y estados,
// sino que también pueden llamar a métodos del objeto decorado.
//
// Este ejemplo será sobre cómo decorar una pizza con diferentes ingredientes.

// Componente Concreto
public class MargheritaPizza {
    public String getDescription() {
        return "Pizza Margherita"; // Describe la pizza base
    }

    public double getCost() {
        return 10.0; // Costo base de la pizza
    }
}
