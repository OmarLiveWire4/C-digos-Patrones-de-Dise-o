package PD_PROTOTYPE;

import java.util.ArrayList;
import java.util.List;

/*
El patrón Prototype es un patrón de diseño de creación que permite clonar objetos existentes
sin hacer que el código dependa de sus clases. En este caso, el patrón se está utilizando
para clonar una instancia de Sandwich y luego añadir ingredientes específicos.

El patrón Prototype se utiliza en la línea donde llamamos a baseSandwich.clone().
Este método crea un nuevo objeto Sandwich que tiene los mismos ingredientes que baseSandwich.
Luego, se pueden agregar ingredientes adicionales a la copia sin cambiar el baseSandwich original.
 */


// Interface Prototipo
interface SandwichPrototype {
    SandwichPrototype clone(); // Método para clonar
}

// Prototipo Concreto
class Sandwich implements SandwichPrototype {
    private List <String> ingredients; // Los ingredientes del sandwich

    public Sandwich() {
        ingredients = new ArrayList<>(); // Inicialización de la lista de ingredientes
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient); // Método para agregar un ingrediente
    }

    public List<String> getIngredients() {
        return ingredients; // Método para acceder a los ingredientes
    }

    // Implementación del método clone
    @Override
    public SandwichPrototype clone() {
        Sandwich sandwichClone = new Sandwich();
        for (String ingredient : this.ingredients) {
            sandwichClone.addIngredient(ingredient); // Clonamos cada ingrediente
        }
        return sandwichClone; // Retornamos el nuevo sandwich clonado
    }

    // Método toString para imprimir la lista de ingredientes del sandwich
    @Override
    public String toString() {
        return "Sandwich with ingredients: " + ingredients.toString();
    }
}

