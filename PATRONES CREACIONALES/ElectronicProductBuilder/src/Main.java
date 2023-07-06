public class Main {
    public static void main(String[] args) {
        DeviceBuilder phoneBuilder = new PhoneBuilder();
        DeviceBuilder laptopBuilder = new LaptopBuilder();
        DeviceDirector directorPhone = new DeviceDirector(phoneBuilder);
        DeviceDirector directorLaptop = new DeviceDirector(laptopBuilder);

        ElectronicDevice phone = directorPhone.constructPhoneDevice();
        ElectronicDevice laptop = directorLaptop.constructLaptopDevice();

        ElectronicDevice phone2 = phoneBuilder.setBrand("Poco")
                .setModel("x5 Pro")
                .setCapacity("256GB")
                .setScreenSize(5)
                .build();



        // Dispositivo teléfono por defecto
        System.out.println(phone.getResult("Teléfono"));
        // Dispositivo generado manualmente
        System.out.println(phone2.getResult("Teléfono"));

        // Dispositivo Laptop por defecto
        System.out.println(laptop.getResult("Laptop"));
    }
}