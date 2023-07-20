
// // Este es el Director. Crea un objeto usando el Builder.
// DeviceDirector es el Director en nuestro patrón. Tiene un método para construir
// cada tipo de dispositivo. Cada método construye un dispositivo paso a paso y finalmente
// llama al método build() para obtener el dispositivo final.


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