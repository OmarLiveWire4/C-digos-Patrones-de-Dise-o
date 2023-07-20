package Mediator;

import java.util.HashMap;
// Clase SalonDeChat que implementa la interfaz ISalonDeChat y actúa como mediador
public class SalonDeChat implements ISalonDeChat{
    // Atributo que contiene una lista de los participantes en el salón de chat
    private HashMap<String, Usuario> Participantes = new HashMap<String, Usuario>();

    // Método de la interfaz ISalonDeChat para registrar un usuario en el salón de chat
    @Override
    public void registra(Usuario user) {
        Participantes.put(user.getNombre(), user);  // Añade el usuario al HashMap de participantes
    }

    // Método de la interfaz ISalonDeChat para enviar un mensaje de un usuario a otro
    @Override
    public void enviar(String de, String a, String mensaje) {
        // Si ambos usuarios existen en el salón de chat
        if (Participantes.containsKey(de) && Participantes.containsKey(a)){
            Usuario u = Participantes.get(a);  // Obtiene el usuario destinatario del mensaje
            u.recibe(de, mensaje);  // El usuario destinatario recibe el mensaje
        }
        else {
            System.out.println("No existe el usuario");  // Si uno de los usuarios no existe, imprime un error
        }
    }
}


