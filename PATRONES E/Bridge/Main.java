package Bridge;


// Motor es la interfaz de implementación que define los métodos necesarios.
// MotorElectrico y MotorGasolina son las implementaciones concretas de esta interfaz.
//
//Vehiculo es la interfaz de abstracción que utiliza los métodos de la interfaz Motor. C
// oche y Motocicleta son las abstracciones refinadas que implementan la interfaz Vehiculo.
//
//En la clase Main, se crean instancias de Coche y Motocicleta utilizando diferentes tipos de motores.
// Esto muestra cómo el patrón Bridge permite que las abstracciones e implementaciones varíen independientemente.

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche(new MotorElectrico());
        coche.mover();

        Vehiculo motocicleta = new Motocicleta(new MotorGasolina());
        motocicleta.mover();
    }
}
