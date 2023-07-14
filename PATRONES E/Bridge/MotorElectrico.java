package Bridge;

// Implementaciones Concretas
// Estas son las implementaciones concretas que implementan la interfaz Implementor.
class MotorElectrico implements Motor {
    public void encender() {
        System.out.println("Encender motor eléctrico");
    }

    public void apagar() {
        System.out.println("Apagar motor eléctrico");
    }
}
