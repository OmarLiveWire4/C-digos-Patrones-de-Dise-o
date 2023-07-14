package Decorator;

// Decorador Abstracto
public abstract class PizzaDecorator {
    protected MargheritaPizza pizza;

    public PizzaDecorator(MargheritaPizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
    public abstract double getCost();
}

