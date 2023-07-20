package FactoryMethod2;

// Creador Concreto A
public class ConcreteCreatorA extends Creator {
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

