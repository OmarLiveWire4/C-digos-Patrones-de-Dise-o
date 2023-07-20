package Mediator;

// Interfaz IUsuarioChat que define los métodos que debe implementar un Usuario
public interface IUsuarioChat {
    // Método para recibir un mensaje de otro usuario
    public void recibe(String de, String mensaje);

    // Método para enviar un mensaje a otro usuario
    public void envia(String a, String mensaje);
}

