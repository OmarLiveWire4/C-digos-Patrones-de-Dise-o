package Chain_Responsability.src;

// AprobadorBase es la clase base que proporciona la funcionalidad básica para el patrón Chain of Responsibility.
// Cada aprobador puede tener un aprobador "siguiente" al que puede pasar la solicitud si no puede procesarla.

// Clase base para los aprobadores. Implementa la interfaz Aprobador y proporciona la funcionalidad básica
public abstract class AprobadorBase implements Aprobador {
    private Aprobador siguiente;  // Siguiente aprobador en la cadena de responsabilidad

    @Override
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;  // Establece el siguiente aprobador
    }

    @Override
    public void procesarSolicitud(Solicitud solicitud) {
        if (puedeAprobar(solicitud)) {
            // Si puede aprobar la solicitud, la aprueba y termina el proceso
            System.out.println("La solicitud fue aprobada por " + getNombre());
        } else if (siguiente != null) {
            // Si no puede aprobar la solicitud, la pasa al siguiente aprobador
            siguiente.procesarSolicitud(solicitud);
        } else {
            // Si no hay más aprobadores en la cadena, muestra un mensaje indicando que la solicitud no pudo ser procesada
            System.out.println("Ningún aprobador pudo procesar la solicitud.");
        }
    }

    // Métodos abstractos que deben ser implementados por las clases descendientes
    protected abstract boolean puedeAprobar(Solicitud solicitud);
    protected abstract String getNombre();
}
