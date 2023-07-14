package Bridge;

// Abstracciones Refinadas
// Estas son las abstracciones refinadas que implementan la abstracción y interactúan con la implementación.
class Coche extends Vehiculo {
    public Coche(Motor motor) {
        super(motor);
    }

    public void mover() {
        System.out.println("El coche está en movimiento.");
        motor.encender();
    }
}
