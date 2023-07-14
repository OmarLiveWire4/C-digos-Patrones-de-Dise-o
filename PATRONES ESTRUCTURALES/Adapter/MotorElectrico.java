package Adapter;


// El patrón Adapter permite la colaboración entre clases con interfaces incompatibles.
// Su propósito es envolver una clase existente con una nueva interfaz para hacerla compatible
// con otro componente.
//
//Ventajas:
//
//Permite reutilizar código existente.
//Separa la interfaz de la implementación.
//Aísla el código de modificaciones futuras.
//
//
//Tenemos una aplicación legacy que usa la clase MotorElectrico para motores eléctricos en vehículos.
// MotorElectrico tiene la interfaz:

interface MotorElectrico {
    public void encenderMotor();
    public void apagarMotor();
}

