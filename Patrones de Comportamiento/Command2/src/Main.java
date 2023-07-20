
/*
El patrón Command se está utilizando para encapsular la solicitud de ejecutar el método action() de la
 clase Receiver en un objeto Command. El Invoker simplemente llama al método execute() del Command
 sin saber qué acción se está realizando realmente. Esto permite cambiar la acción que se realiza
 simplemente cambiando el objeto Command, sin tener que cambiar el Invoker.
 */


// En la clase Main se crea una instancia de Receiver, ConcreteCommand e Invoker.
// Luego se asigna el ConcreteCommand al Invoker y se ejecuta el comando.
public class Main {
    public static void main(String[] args) {
        // Se crea el objeto Receiver
        Receiver receiver = new Receiver();
        // Se crea el objeto ConcreteCommand pasando el Receiver como argumento
        Command command = new ConcreteCommand(receiver);
        // Se crea el objeto Invoker
        Invoker invoker = new Invoker();

        // Se asigna el comando al invoker
        invoker.setCommand(command);
        // Se ejecuta el comando
        invoker.executeCommand();
    }
}

