package State;

// Implementa el contexto
public class Context {
    private State state; // Mantiene el estado actual

    public Context() {
        state = new RedLightState(); // El estado inicial es el rojo
    }

    public void setState(State state) {
        this.state = state; // Cambia el estado
    }

    public void request() {
        state.handle(this); // Llama al método handle del estado actual
    }
}
