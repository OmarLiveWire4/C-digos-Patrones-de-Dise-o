package State;

// Implementa los estados concretos
public class RedLightState implements State {
    public void handle(Context context) {
        System.out.println("Red Light");
        context.setState(new GreenLightState()); // Cambia al próximo estado
    }
}

