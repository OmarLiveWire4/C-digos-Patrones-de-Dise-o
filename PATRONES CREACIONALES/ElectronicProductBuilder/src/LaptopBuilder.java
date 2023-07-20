// Implementación de DesktopBuilder (Builder específico para dispositivos de escritorio)


// // Este es un Builder concreto. Implementa la interfaz Builder y construye un tipo específico de dispositivo.
// LaptopBuilder es un Builder concreto. Implementa la interfaz DeviceBuilder y
// define cómo se construye un ElectronicDevice paso a paso.
public class LaptopBuilder implements DeviceBuilder {
    private String brand;
    private String model;
    private String capacity;
    private double screenSize;

    private String fans;
//    private String processor;
//    private int ram;

    public DeviceBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public DeviceBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public DeviceBuilder setCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    public DeviceBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public DeviceBuilder setFans(String fans) {
        this.fans = fans;
        return  this;
    }

    public ElectronicDevice build() {
        return new ElectronicDevice(brand, model, capacity, screenSize);
    }



}
