package Adapter;


// Ahora queremos reutilizar esta lógica en una nueva
// aplicación pero necesitamos una interfaz diferente para los motores:
interface Motor {
    public void conectar();
    public void desconectar();
}

