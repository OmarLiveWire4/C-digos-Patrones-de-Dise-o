package FactoryMethod2;

/*
El patrón de diseño Factory Method es un patrón de diseño creacional que proporciona una
interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crean.

En resumen, el Factory Method sugiere que se debería llamar a un método especial de fábrica
 en lugar de llamar directamente al constructor para crear un objeto. El tipo de objeto resultante puede depender de:

- Los valores de los parámetros del método de fábrica.
- La configuración actual de la aplicación.
- El entorno actual del sistema operativo.
 */

// Creador o Factory
public abstract class Creator {
    abstract Product factoryMethod();

    // Algunas operaciones que podrían usar el producto creado
    public void someOperation() {
        Product product = factoryMethod();
        product.operation();
    }
}

