package Bridge;

// Abstracción
// Esta es la interfaz de abstracción que se utiliza para interactuar con las implementaciones concretas.
abstract class Vehiculo {
    protected Motor motor;

    protected Vehiculo(Motor motor) {
        this.motor = motor;
    }

    abstract void mover();
}

