public class Car {
    String manufacturer_name;
    String model_name;
    String transmission;
    String color;
    int odometer_value;
    public Car() {
        this.manufacturer_name = "";
        this.model_name = "";
        this.transmission = "";
        this.color = "";
        this.odometer_value = 0;
    }

    public Car(String manufacturer_name, String model_name, String transmission, String color, int odometer_value) {
        this.manufacturer_name = manufacturer_name;
        this.model_name = model_name;
        this.transmission = transmission;
        this.color = color;
        this.odometer_value = odometer_value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer_name='" + manufacturer_name + '\'' +
                ", model_name='" + model_name + '\'' +
                ", transmission='" + transmission + '\'' +
                ", color='" + color + '\'' +
                ", odometer_value=" + odometer_value +
                '}';
    }
}
