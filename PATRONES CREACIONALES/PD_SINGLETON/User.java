package PD_SINGLETON;

public class User {
    // Esta es una variable de instancia que almacena el nombre del usuario
    private String name;

    // Este es el constructor de la clase User
    public User(String name) {
        // Aquí se inicializa la variable de instancia name
        this.name = name;
    }

    // Este método permite al usuario reproducir una canción
    public void playSong(String song) {
        // Aquí se está obteniendo la única instancia de MusicService (Singleton)
        // y se está llamando a su método playSong
        MusicService.getInstance().playSong(song);
    }

    // Este método imprime la canción que está escuchando el usuario
    public void getCurrentSong() {
        // Aquí se está obteniendo la única instancia de MusicService (Singleton)
        // y se está llamando a su método getCurrentSong
        System.out.println(name + " is listening to: " + MusicService.getInstance().getCurrentSong());
    }
}

