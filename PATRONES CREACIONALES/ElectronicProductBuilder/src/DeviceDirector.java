public class DeviceDirector {
    private DeviceBuilder builder;

    public DeviceDirector(DeviceBuilder builder) {
        this.builder = builder;
    }


    public ElectronicDevice constructPhoneDevice() {
        return builder.setBrand("Samsung")
                .setModel("Galaxy 7")
                .setCapacity("256GB")
                .setScreenSize(6.1)
                .build();
    }

    public ElectronicDevice constructLaptopDevice() {
        return builder.setBrand("Acer")
                .setModel("Nitro 5")
                .setCapacity("1TB")
                .setScreenSize(15.6)
                .build();
    }
}