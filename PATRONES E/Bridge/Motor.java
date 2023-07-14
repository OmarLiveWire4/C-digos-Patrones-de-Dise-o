package Bridge;

// El patrón de diseño Bridge,  es un patrón estructural que se utiliza para
// desacoplar una abstracción de su implementación, de modo que ambos pueden variar independientemente.
// Esto se logra dividiendo la lógica en clases de abstracción y de implementación.
// La abstracción define la interfaz de alto nivel, mientras que la implementación hace el trabajo real.
//
//Aquí hay un ejemplo de un programa en Java que utiliza el patrón Bridge.
// Este programa trata sobre la creación de diferentes tipos de vehículos con diferentes tipos de motores.
// Interfaz Implementor
// Esta es la interfaz de implementación que define los metodos que la abstraccion necesita.
interface Motor {
    void encender();
    void apagar();
}


