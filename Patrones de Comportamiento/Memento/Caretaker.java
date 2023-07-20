package Memento;

import java.util.ArrayList;


// Caretaker que administra los estados de la base de datos (Mementos)
public class Caretaker {
    private ArrayList<ArrayList<Registro>> backup;

    // Constructor de la clase
    public Caretaker() {
        this.backup = new ArrayList<ArrayList<Registro>>();
    }

    // Guarda una copia de la lista actual de registros
    public void setBackup(ArrayList<Registro> bd){
        ArrayList<Registro> lista = new ArrayList<Registro>();
        for (Registro registro: bd){
            lista.add(registro);
        }
        backup.add(lista);
    }

    // Devuelve una copia de la lista de registros en la posición i
    public ArrayList<Registro> getBackup(int i){
        return backup.get(i);
    }

    // Devuelve el tamaño de la lista de copias de seguridad
    public int getSize(){
        return backup.size();
    }
}