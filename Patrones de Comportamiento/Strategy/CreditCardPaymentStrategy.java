package Strategy;

// Implementación concreta de la interfaz Strategy para pagar con tarjeta de crédito
public class CreditCardPaymentStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Pago realizado con tarjeta de crédito. Monto: " + amount);
    }
}

