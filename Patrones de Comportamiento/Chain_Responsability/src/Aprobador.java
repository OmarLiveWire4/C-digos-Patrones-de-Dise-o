package Chain_Responsability.src;

/*
El patrón de diseño Chain of Responsibility (Cadena de Responsabilidad)
es un patrón de comportamiento que permite pasar solicitudes a lo largo de una cadena de manejadores.
Al recibir una solicitud, cada manejador decide procesar la solicitud o pasarla al siguiente manejador en la cadena.

En este código Java, el patrón Chain of Responsibility se utiliza para procesar solicitudes de aprobación.
Cada aprobador tiene un límite de monto que puede aprobar.
 */


// Interfaz para los aprobadores. Define los métodos que deben tener todos los aprobadores
public interface Aprobador {
    void setSiguiente(Aprobador siguiente);
    void procesarSolicitud(Solicitud solicitud);
}
