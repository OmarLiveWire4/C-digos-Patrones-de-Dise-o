package Strategy;

// Implementación concreta de la interfaz Strategy para pagar en efectivo
public class CashPaymentStrategy implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Pago realizado en efectivo. Monto: " + amount);
    }
}

