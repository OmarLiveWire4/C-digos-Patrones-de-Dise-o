package Composite;

// Hoja
public class Archivo extends SistemaArchivo {
    private String nombre;
    private int tamaño;

    public Archivo(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamaño() {
        return tamaño;
    }
}