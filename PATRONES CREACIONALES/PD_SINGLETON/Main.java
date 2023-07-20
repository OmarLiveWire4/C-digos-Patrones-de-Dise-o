package PD_SINGLETON;

/*
Singleton. Este patrón de diseño garantiza que una clase solo tenga una única instancia
 y proporciona un punto de acceso global a ella. Esto es útil cuando necesitamos que solo exista
 un objeto de una clase, por ejemplo, un servicio de música en esta situación.


 */

public class Main {
    public static void main(String [] args) {
        // Aquí se están creando dos usuarios
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Aquí el usuario1 está reproduciendo una canción
        user1.playSong("Song A");
        // Aquí se imprime la canción que está escuchando el usuario1
        user1.getCurrentSong();
        // Aquí se imprime la canción que está escuchando el usuario2
        // Como la instancia de MusicService es la misma para todos los usuarios,
        // el usuario2 también está escuchando la canción que reprodujo el usuario1
        user2.getCurrentSong();

        System.out.println("---------------------------------------------------");

        // Aquí el usuario2 está reproduciendo una canción
        user2.playSong("Song B");
        // Como la instancia de MusicService es la misma para todos los usuarios,
        // cuando el usuario2 reproduce una nueva canción, esta también se actualiza para el usuario1
        user1.getCurrentSong();
        user2.getCurrentSong();
    }
}



