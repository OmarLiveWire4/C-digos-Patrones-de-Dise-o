package Decorator;


// Clase Main
public class PizzaStore {
    public static void main(String[] args) {
        MargheritaPizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " Costo: " + pizza.getCost());

        PizzaDecorator pizzaWithCheese = new CheesePizzaDecorator(pizza);
        System.out.println(pizzaWithCheese.getDescription() + " Costo: " + pizzaWithCheese.getCost());
    }
}

