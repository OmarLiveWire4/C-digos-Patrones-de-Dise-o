package Mediator;

public class MainMed {
    public static void main(String[] args) {

        SalonDeChat s = new SalonDeChat();  // Crea un nuevo salón de chat
        Usuario u = new Usuario(s);  // Crea un nuevo usuario y lo asigna al salón de chat
        u.setNombre("Juan");  // Asigna el nombre al usuario
        s.registra(u);  // Registra el usuario en el salón de chat

        // Repite los pasos anteriores para dos usuarios más
        Usuario u1 = new Usuario(s);
        u1.setNombre("Paul");
        s.registra(u1);

        Usuario u2 = new Usuario(s);
        u2.setNombre("Raul");
        s.registra(u2);

        // Los usuarios envían mensajes entre sí a través del salón de chat (mediador)
        u.envia("Paul","Hola como estas");
        u1.envia("Juan","Todo bien ¿y tu?");
        u2.envia("Paul","¿Martin esta?");
    }
}




