package Mediator;
// Clase Usuario que implementa la interfaz IUsuarioChat
public class Usuario implements IUsuarioChat{
    // Atributos de la clase Usuario
    private String nombre;  // Nombre del usuario
    private SalonDeChat salon;  // Referencia al salón de chat, que es el mediador

    // Constructor del Usuario. Se le pasa el salón de chat al cual pertenecerá.
    public Usuario(SalonDeChat salon) {
        this.salon = salon;
    }

    // Método de la interfaz IUsuarioChat para recibir un mensaje de otro usuario
    @Override
    public void recibe(String de, String mensaje) {
        String S = " El usuario: "+de+" te dice: "+mensaje;
        System.out.println(nombre+";"+S);  // Imprime el mensaje recibido
    }

    // Método de la interfaz IUsuarioChat para enviar un mensaje a otro usuario
    @Override
    public void envia(String a, String mensaje) {
        salon.enviar(nombre,a,mensaje);  // Envia el mensaje a través del salón de chat (mediador)
    }

    // Getters y setters para los atributos nombre y salon
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public SalonDeChat getSalon() {
        return salon;
    }

    public void setSalon(SalonDeChat salon) {
        this.salon = salon;
    }
}

