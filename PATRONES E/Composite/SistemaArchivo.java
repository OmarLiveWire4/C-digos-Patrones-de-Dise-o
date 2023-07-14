package Composite;
// El patrón de diseño Composite se utiliza para simplificar el uso de grupos de objetos.
// Este patrón permite tratar un grupo de objetos de la misma manera que se trataría a
// un objeto individual. El patrón Composite consta de componentes, hojas y compuestos.
//
//Componente: Es la base de la composición. Define la interfaz común para los objetos en la composición.
//Hoja: Son los objetos individuales en la composición.
//Compuesto: Son los objetos que tienen subobjetos. Los compuestos implementan métodos
// definidos en la interfaz del componente.

// Este ejemplo muestra
// cómo se podría usar para representar un sistema de archivos.

// Componente
public abstract class SistemaArchivo {
    public abstract String getNombre();
    public abstract int getTamaño();
}
