public interface DeviceBuilder {
    DeviceBuilder setBrand(String brand);
    DeviceBuilder setModel(String model);
    DeviceBuilder setCapacity(String capacity);
    DeviceBuilder setScreenSize(double screenSize);
    ElectronicDevice build();
}