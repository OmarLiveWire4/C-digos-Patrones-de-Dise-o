package Strategy;

// Clase de contexto que utiliza una estrategia para realizar una operación
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // El contexto recibe una estrategia a través del constructor
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Método para cambiar la estrategia en tiempo de ejecución
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Método que utiliza la estrategia para realizar el pago
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
