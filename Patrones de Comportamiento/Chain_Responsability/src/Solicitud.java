package Chain_Responsability.src;

// Clase que representa una solicitud de aprobación.
public class Solicitud {
    private double monto;  // El monto de la solicitud

    public Solicitud(double monto) {
        this.monto = monto;  // Asigna el monto a la solicitud
    }

    public double getMonto() {
        return monto;  // Devuelve el monto de la solicitud
    }
}
