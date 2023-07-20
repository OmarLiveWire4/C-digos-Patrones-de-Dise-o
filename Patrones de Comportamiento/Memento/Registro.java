package Memento;

// Clase Registro que representa los datos almacenados en la base de datos
public class Registro {

    private String nombre;
    private int edad;
    private boolean esActivo;

    // Constructor de la clase
    public Registro(String n, int e, boolean a) {
        this.nombre = n;
        this.edad = e;
        this.esActivo = a;
    }

    // Método para imprimir los datos del registro
    public void getRegistro(){
        System.out.print("Nombre: "+this.nombre+", ");
        System.out.print("Edad: "+this.edad+", ");
        System.out.print("Activo: "+this.esActivo+". \n");
    }
}