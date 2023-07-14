package Adapter;


// Para resolver esta incompatibilidad, creamos un Adaptador:

class MotorElectricoAdaptador implements Motor {

    // Referencia al objeto adapter
    private MotorElectrico motorElectrico;

    public MotorElectricoAdaptador(MotorElectrico motorElectrico) {
        // En el constructor recibe el objeto a adaptar
        this.motorElectrico = motorElectrico;
    }

    // Implementa el nuevo método de la interfaz Motor
    public void conectar() {
        // Llama al método equivalente del objeto adapter
        motorElectrico.encenderMotor();
    }

    // Implementa el nuevo método de la interfaz Motor
    public void desconectar() {
        // Llama al método equivalente del objeto adapter
        motorElectrico.apagarMotor();
    }
}

