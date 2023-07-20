package FactoryMethod2;


/*
En este código, Creator es la clase abstracta que define el método factoryMethod().
Este método es el que se encarga de la creación de objetos, pero no especifica el tipo exacto de
 objeto que se creará, eso se deja a las subclases.

Las subclases ConcreteCreatorA y ConcreteCreatorB implementan el método factoryMethod() y especifican
qué tipo de objeto se debe crear. En este caso, ConcreteCreatorA crea ConcreteProductA y ConcreteCreatorB
crea ConcreteProductB.

El patrón Factory Method se utiliza en el método factoryMethod() de la clase abstracta Creator y en sus
subclases. Este patrón permite que el código sea flexible y extensible, ya que puedes agregar nuevos tipos
de productos y creadores sin cambiar el código existente.
 */
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();  // Debería imprimir: "Soy el Producto A"

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();  // Debería imprimir: "Soy el Producto B"
    }
}


