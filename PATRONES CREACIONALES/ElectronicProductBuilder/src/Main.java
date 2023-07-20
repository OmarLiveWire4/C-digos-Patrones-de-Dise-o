
// En la clase Main, primero creamos los objetos Builder y los usamos para crear objetos
// ElectronicDevice a través del objeto DeviceDirector. Luego, imprimimos los detalles de los dispositivos.
//
//En resumen, el patrón Builder se utiliza en este código para construir
// objetos ElectronicDevice. El patrón se implementa a través de la interfaz DeviceBuilder,
// la clase DeviceDirector y las clases de Builder concretas como PhoneBuilder y LaptopBuilder.

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