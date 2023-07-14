package Adapter;


// De esta forma, el Adaptador MotorElectricoAdaptador nos permite usar la clase MotorElectrico
// existente a través de la nueva interfaz Motor necesaria en la aplicación actual.
// El adaptador delega las llamadas a los métodos correspondientes de MotorElectrico para
// reutilizar esa funcionalidad.
//
//Esto demuestra cómo el patrón Adapter puede utilizarse para hacer compatible
// una clase existente con una interfaz nueva que se requiere, sin tener que modificar
// la clase original. El adaptador absorbe la incompatibilidad entre las interfaces.

public class Main {

    public static void main(String[] args) {

        // Crear objeto de la implementación legacy
        MotorElectrico motor = new MotorElectricoImpl();

        // Envolverlo en el adaptador
        Motor motorAdaptado = new MotorElectricoAdaptador(motor);

        motorAdaptado.conectar();
        //...
        motorAdaptado.desconectar();
    }

}


