package State;

/*
En este código, State es la interfaz que define un método handle().
Las clases RedLightState, GreenLightState, y YellowLightState son los estados concretos que
implementan esta interfaz y definen el comportamiento para cada estado.

Context es la clase que mantiene una referencia al estado actual y puede cambiar
de estado llamando a setState(). Cuando se llama al método request(), se delega la llamada
al método handle() del estado actual.

En la clase Main, creamos un nuevo Context y repetimos el cambio de estado 10 veces. Cada vez
que se llama a context.request(), el semáforo cambia de estado y se imprime el estado actual.

En este ejemplo, el patrón State se aplica para controlar el cambio de estado del semáforo,
eliminando la necesidad de una serie de condicionales if o switch para controlar el comportamiento en
cada estado, y haciendo que el código sea más fácil de leer, de entender y de mantener.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // Cambia los estados
        for (int i = 0; i < 10; i++) {
            context.request();
        }
    }
}

