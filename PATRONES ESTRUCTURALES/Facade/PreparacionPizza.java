package Facade;

// El patrón de diseño Facade es un patrón estructural que proporciona una interfaz
// simplificada para un sistema de clases, biblioteca o marco complejo.
// Básicamente, este patrón oculta la complejidad del sistema y proporciona una
// interfaz al cliente desde donde el cliente puede acceder al sistema.
//
// ejemplo, en el que tenemos un sistema para una pizzería
// que maneja varios aspectos como la preparación de la pizza, la entrega y el cobro.
// se usara el patrón de diseño Facade para proporcionar una interfaz simplificada a este sistema.
// Clase de preparación de pizza
class PreparacionPizza {
    public void prepararPizza() {
        System.out.println("Preparando pizza...");
    }
}
