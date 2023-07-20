
/*
El patrón Builder es un patrón de diseño creacional que proporciona una forma de construir
un objeto paso a paso. Este patrón permite producir diferentes tipos y representaciones de un
objeto utilizando el mismo código de construcción. En este patrón, se utiliza un objeto Director y
 un objeto Builder. El objeto Builder construye la parte del objeto complejo paso a paso y el objeto
 Director especifica el orden en el que se ejecutan los pasos de construcción.
 */

// Este es el interface que define los métodos que deben implementar los Builders.

// Aquí definimos la interfaz DeviceBuilder, que es la interfaz de Builder en nuestro patrón.
// Esta interfaz define los métodos que se utilizarán para construir partes del objeto ElectronicDevice.
public interface DeviceBuilder {
    DeviceBuilder setBrand(String brand);
    DeviceBuilder setModel(String model);
    DeviceBuilder setCapacity(String capacity);
    DeviceBuilder setScreenSize(double screenSize);
    ElectronicDevice build();
}