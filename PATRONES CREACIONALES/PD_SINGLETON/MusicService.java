package PD_SINGLETON;


// Esta es la clase MusicService donde se aplica el patrón Singleton
public class MusicService {
    // Esta es la única instancia de MusicService
    private static MusicService instance;

    // Esta es una variable de instancia que almacena la canción actual
    private String currentSong;

    // Este es el constructor privado de la clase MusicService
    // Es privado para prevenir la creación de nuevas instancias de esta clase
    private MusicService() {
        currentSong = null;
    }

    // Este método retorna la única instancia de MusicService
    // Si la instancia aún no ha sido creada, se crea aquí
    public static MusicService getInstance() {
        if (instance == null) {
            instance = new MusicService();
        }
        return instance;
    }

    // Este método permite reproducir una nueva canción
    public void playSong(String song) {
        // Aquí se está actualizando la canción actual
        currentSong = song;
        System.out.println("Now playing: " + currentSong);
    }

    // Este método retorna la canción actual
    public String getCurrentSong() {
        return currentSong;
    }
}


