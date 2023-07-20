package State;

public class GreenLightState implements State {
    public void handle(Context context) {
        System.out.println("Green Light");
        context.setState(new YellowLightState()); // Cambia al próximo estado
    }
}
