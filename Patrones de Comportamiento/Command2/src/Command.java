
/*
El patrón de diseño Command es un patrón de comportamiento que convierte una solicitud en un objeto independiente
que contiene toda la información sobre la solicitud. Esto permite parametrizar los métodos con diferentes
solicitudes, retrasar o poner en cola la ejecución de una solicitud, y soportar operaciones que se pueden deshacer.

En este código Java, tenemos cuatro clases principales: Receiver, Invoker, ConcreteCommand, y
Command(que es una interfaz).
 */


// La interfaz Command declara un método execute()
public interface Command {
    void execute();
}
