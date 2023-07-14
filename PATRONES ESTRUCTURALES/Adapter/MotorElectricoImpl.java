package Adapter;

//  Implementación del motor eléctrico
class MotorElectricoImpl implements MotorElectrico {

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo motor eléctrico...");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Apagando motor eléctrico...");
    }

}
