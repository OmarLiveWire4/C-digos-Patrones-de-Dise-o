package Bridge;

class Motocicleta extends Vehiculo {
    public Motocicleta(Motor motor) {
        super(motor);
    }

    public void mover() {
        System.out.println("La motocicleta está en movimiento.");
        motor.encender();
    }
}

