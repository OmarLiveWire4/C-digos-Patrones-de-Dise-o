

// ConcreteCommand es una implementación concreta de la interfaz Command.
// Esta clase tiene una referencia a la clase Receiver para poder invocar
// el método action() de la clase Receiver.
public class ConcreteCommand implements Command {
    private Receiver receiver;

    // Inicializa la referencia a la clase Receiver
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    // Implementa el método execute() de la interfaz Command
    // invocando el método action() de la clase Receiver.
    @Override
    public void execute() {
        receiver.action();
    }
}
