package Chain_Responsability.src;

// Los aprobadores específicos AprobadorJunior y AprobadorSenior heredan de AprobadorBase
// y proporcionan implementaciones concretas para verificar si pueden procesar una solicitud.

// Clase de aprobador junior, puede aprobar solicitudes hasta un monto de 1000
public class AprobadorJunior extends AprobadorBase{
    @Override
    protected boolean puedeAprobar(Solicitud solicitud) {
        return solicitud.getMonto() <= 1000;  // Verifica si puede aprobar la solicitud
    }

    @Override
    protected String getNombre() {
        return "Aprobador Junior";  // Devuelve el nombre del aprobador
    }
}

