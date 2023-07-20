
// // Este es el objeto que estamos construyendo.

// ElectronicDevice es el objeto complejo que estamos construyendo.
// Tiene varios atributos, cada uno de los cuales se establece utilizando el Builder.

public class ElectronicDevice {
    private String brand;
    private String model;
    private String capacity;
    private double screenSize;

    public ElectronicDevice(String brand, String model, String capacity, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.screenSize = screenSize;
    }

    // Métodos getters para los atributos
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCapacity() {
        return capacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getResult (String device){
        StringBuilder sb = new StringBuilder(device+": " + brand + " " + model+"\n");
        sb.append("Capacidad: " + capacity+"\n");
        sb.append("Tamaño de pantalla: " + screenSize + " pulgadas\n");
        return  sb.toString();
    }

}