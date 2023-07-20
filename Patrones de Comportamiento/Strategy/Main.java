package Strategy;

/*
El patrón de diseño Strategy es un patrón de comportamiento que permite seleccionar
 un algoritmo en tiempo de ejecución. En lugar de implementar un único algoritmo directamente, el
 código recibe instrucciones de ejecución de diferentes objetos que implementan una estrategia común.

 En este código, PaymentStrategy es la estrategia genérica que define un método pay(int amount).
 Luego, CreditCardPaymentStrategy y CashPaymentStrategy son implementaciones concretas de esta estrategia
 que realizan el pago de una manera específica.

La clase ShoppingCart es el contexto que utiliza una estrategia PaymentStrategy para realizar una
operación. Puede cambiar la estrategia en tiempo de ejecución con el método
 setPaymentStrategy(PaymentStrategy paymentStrategy).

Finalmente, en la clase Main, creamos una instancia de ShoppingCart con una estrategia
CreditCardPaymentStrategy, realizamos un checkout, luego cambiamos la estrategia a CashPaymentStrategy
y realizamos otro checkout.

Este ejemplo muestra cómo el patrón Strategy permite cambiar el comportamiento de un objeto en tiempo de
ejecución. En este caso, podemos cambiar la forma en que se realiza el pago en un carrito de compras.
 */

// Clase principal para probar el patrón Strategy
public class Main {
    public static void main(String[] args) {
        // Crear una instancia del carrito con una estrategia de pago con tarjeta de crédito
        ShoppingCart cart = new ShoppingCart(new CreditCardPaymentStrategy());

        // Realizar el checkout con la estrategia inicial
        cart.checkout(100);

        // Cambiar la estrategia de pago a efectivo
        cart.setPaymentStrategy(new CashPaymentStrategy());

        // Realizar el checkout con la nueva estrategia
        cart.checkout(200);
    }
}
