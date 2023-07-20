package PD_PROTOTYPE;
public class SandwichShop {
    public static void main(String[] args) {
        // Creamos el sandwich base con ingredientes comunes
        Sandwich baseSandwich = new Sandwich();
        baseSandwich.addIngredient("Bread");
        baseSandwich.addIngredient("Lettuce");
        baseSandwich.addIngredient("Tomato");

        // El cliente 1 quiere un sandwich con queso
        Sandwich customer1Sandwich = (Sandwich) baseSandwich.clone(); // Clonamos el sandwich base
        customer1Sandwich.addIngredient("Cheese"); // Agregamos el queso al sandwich del cliente 1
        System.out.println("Customer 1: " + customer1Sandwich); // Imprimimos los ingredientes del sandwich

        // El cliente 2 quiere un sandwich con jamón
        Sandwich customer2Sandwich = (Sandwich) baseSandwich.clone(); // Clonamos el sandwich base
        customer2Sandwich.addIngredient("Ham"); // Agregamos el jamón al sandwich del cliente 2
        System.out.println("Customer 2: " + customer2Sandwich); // Imprimimos los ingredientes del sandwich

        // El cliente 3 quiere un sandwich con queso y jamón
        Sandwich customer3Sandwich = (Sandwich) baseSandwich.clone(); // Clonamos el sandwich base
        customer3Sandwich.addIngredient("Cheese"); // Agregamos el queso al sandwich del cliente 3
        customer3Sandwich.addIngredient("Ham"); // Agregamos el jamón al sandwich del cliente 3
        System.out.println("Customer 3: " + customer3Sandwich); // Imprimimos los ingredientes del sandwich
    }
}


