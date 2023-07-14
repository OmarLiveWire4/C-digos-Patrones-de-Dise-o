package Composite;

// Compuesto
import java.util.ArrayList;
import java.util.List;

public class Carpeta extends SistemaArchivo {
    private String nombre;
    private List<SistemaArchivo> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(SistemaArchivo archivo) {
        archivos.add(archivo);
    }

    public void remover(SistemaArchivo archivo) {
        archivos.remove(archivo);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamaño() {
        int total = 0;
        for (SistemaArchivo archivo : archivos) {
            total += archivo.getTamaño();
        }
        return total;
    }
}
