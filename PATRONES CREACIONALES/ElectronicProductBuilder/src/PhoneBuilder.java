
public class PhoneBuilder implements DeviceBuilder {
    private String brand;
    private String model;
    private String capacity;
    private double screenSize;

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

    public ElectronicDevice build() {
        return new ElectronicDevice(brand, model, capacity, screenSize);
    }

}