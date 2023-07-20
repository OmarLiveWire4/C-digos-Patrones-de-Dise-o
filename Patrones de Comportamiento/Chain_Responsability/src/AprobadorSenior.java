package Chain_Responsability.src;

// Los aprobadores específicos AprobadorJunior y AprobadorSenior heredan de AprobadorBase
// y proporcionan implementaciones concretas para verificar si pueden procesar una solicitud.

// Clase de aprobador senior, puede aprobar solicitudes hasta un monto de 5000
public class AprobadorSenior extends AprobadorBase {
    @Override
    protected boolean puedeAprobar(Solicitud solicitud) {
        return solicitud.getMonto() <= 5000;  // Verifica si puede aprobar la solicitud
    }

    @Override
    protected String getNombre() {
        return "Aprobador Senior";  // Devuelve el nombre del aprobador
    }
}

