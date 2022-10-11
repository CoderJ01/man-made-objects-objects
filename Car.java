public class Car extends MotorVehicle {
    // variables
    private String make;
    private String model;
    private String color;
    private int wheels;

    public Car (String brake, String emission, String engine, String steering, String transmission, int mileage, String make, String model, String color, int wheels) {
        super(brake, emission, engine, steering, transmission, mileage);
        this.make = make;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
    }
}