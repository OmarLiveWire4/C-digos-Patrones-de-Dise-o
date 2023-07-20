package Memento;

/*
El patrón Memento es un patrón de diseño de software que proporciona la capacidad de restaurar el
estado de un objeto a un estado anterior sin violar el principio de encapsulación.
Este patrón se utiliza generalmente cuando es necesario proporcionar una funcionalidad de deshacer.

Ahora, vamos a explicar el código. Este código define una base de datos simple con una funcionalidad
de copia de seguridad.
 */

import java.util.ArrayList;


// Clase principal que representa la base de datos
public class BaseDeDatos {

    private ArrayList<Registro> listado;
    private Caretaker caretaker;

    // Constructor de la clase
    public BaseDeDatos() {
        listado = new ArrayList<Registro>();
        caretaker = new Caretaker();
    }

    // Agrega un registro a la lista de registros
    public void agregarRegistro(String n, int e, boolean a){
        Registro temp = new Registro(n,e,a);
        listado.add(temp);
    }

    // Limpia la lista de registros
    public void limpiarBD(){
        listado=null;
    }

    // Muestra la lista de registros
    public void mostrarListado(){
        if (listado!=null){
            for (Registro temp: listado){
                temp.getRegistro();
            }
        }else {
            System.out.println("La base de datos se encuentra vacía");
        }
    }

    // Genera una copia de seguridad de la lista de registros
    public void generarBackup(){
        caretaker.setBackup(listado);
    }

    // Restaura la lista de registros a partir de una copia de seguridad
    public void getBackup(int i){
        listado = new ArrayList<>();
        for(Registro temp: caretaker.getBackup(i)){
            listado.add(temp);
        }
    }

    // Devuelve el tamaño de la lista de copias de seguridad
    public int getTamanioBackup(){
        return caretaker.getSize();
    }
}