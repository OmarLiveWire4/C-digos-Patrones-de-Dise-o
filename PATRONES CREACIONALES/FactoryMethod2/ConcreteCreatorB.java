package FactoryMethod2;

// Creador Concreto B
public class ConcreteCreatorB extends Creator {
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}
