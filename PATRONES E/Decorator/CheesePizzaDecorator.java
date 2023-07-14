package Decorator;

// Decorador Concreto
public class CheesePizzaDecorator extends PizzaDecorator {
    public CheesePizzaDecorator(MargheritaPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", extra queso"; // Agrega "extra queso" a la descripción
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0; // Agrega el costo de "extra queso" al costo de la pizza
    }
}

