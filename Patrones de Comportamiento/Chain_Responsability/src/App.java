package Chain_Responsability.src;

import Chain_Responsability.src.*;

/*
Primero se crean dos aprobadores: AprobadorJunior y AprobadorSenior. Luego, se configura la cadena de responsabilidad
 al establecer AprobadorSenior como el siguiente aprobador después de AprobadorJunior con la
 llamada junior.setSiguiente(senior). Esto significa que, si AprobadorJunior no puede aprobar una solicitud, la
 pasará a AprobadorSenior.

Finalmente, se crea una solicitud con un monto de 2000 y se procesa a través de la cadena
de responsabilidad con la llamada junior.procesarSolicitud(solicitud). Como AprobadorJunior no puede aprobar
solicitudes por encima de 1000, la solicitud se pasa a AprobadorSenior, quien puede aprobar solicitudes hasta 5000,
por lo que la solicitud se aprueba.

--------

El patrón Chain of Responsibility permite que una solicitud se pase a través de una cadena
de objetos que pueden manejarla. En este caso, la cadena de responsabilidad se compone de aprobadores,
cada uno de los cuales tiene un límite de monto que puede aprobar. Si un aprobador no puede manejar una solicitud,
la pasa al siguiente aprobador en la cadena.
 */

public class App {
    public static void main(String[] args) {
        // Creamos los aprobadores
        Aprobador junior = new AprobadorJunior();
        Aprobador senior = new AprobadorSenior();

        // Configuramos la cadena de responsabilidad
        junior.setSiguiente(senior);  // El aprobador junior pasa las solicitudes al aprobador senior si no puede aprobarlas

        // Creamos una solicitud
        Solicitud solicitud = new Solicitud(2000);  // Solicitud con un monto de 2000

        // Procesamos la solicitud
        junior.procesarSolicitud(solicitud);  // La solicitud es procesada por la cadena de responsabilidad
    }
}

