package State;

public class YellowLightState implements State {
    public void handle(Context context) {
        System.out.println("Yellow Light");
        context.setState(new RedLightState()); // Vuelve al estado inicial
    }
}

