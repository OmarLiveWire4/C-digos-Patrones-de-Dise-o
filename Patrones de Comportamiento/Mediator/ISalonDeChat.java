package Mediator;


/*
El patrón de diseño Mediator es un patrón de comportamiento que se utiliza para
 disminuir la comunicación directa entre diferentes objetos, y así disminuir la dependencia entre ellos.
 Este patrón se utiliza cuando hay un gran número de objetos que están interactuando entre sí. Si cada objeto
 se comunica directamente con los demás, la complejidad de la interacción puede crecer de manera cuadrática,
  lo cual es poco práctico y difícil de gestionar. En lugar de esto, se introduce un objeto mediador, que se
 encarga de la interacción entre los objetos. Los objetos no se comunican directamente entre sí, sino que
  envían mensajes al mediador, y este se encarga de pasar el mensaje al objeto correspondiente.

En el código proporcionado, el objeto SalonDeChat actúa como mediador en las interacciones entre los objetos Usuario.
 */


// Interfaz ISalonDeChat que define los métodos que debe implementar un SalonDeChat
public interface ISalonDeChat {
    // Método para registrar un usuario en el salón de chat
    public abstract void registra(Usuario participante);

    // Método para enviar un mensaje de un usuario a otro
    public abstract void enviar(String de, String a, String mensaje);
}






