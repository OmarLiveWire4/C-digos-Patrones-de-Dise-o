

// La clase Invoker es quien inicia la solicitud. No sabe nada sobre la lógica de negocio
// e interactúa con la interfaz Command.
public class Invoker {
    // Se declara una variable de la interfaz Command
    private Command command;

    // Asigna el comando concreto que se ejecutará
    public void setCommand(Command command) {
        this.command = command;
    }

    // Ejecuta el comando asignado
    public void executeCommand() {
        command.execute();
    }
}

