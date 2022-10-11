public class Car extends MotorVehicle {
    // variables
    private String make;
    private String model;
    private String color;
    private int wheels;

    // constructor
    public Car (String brake, String emission, String engine, String steering, String transmission, int mileage, String make, String model, String color, int wheels) {
        super(brake, emission, engine, steering, transmission, mileage);
        this.make = make;
        this.model = model;
        this.color = color;
        this.wheels = wheels;
    }

    // getters
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getNumberOfWheels() {
        return this.wheels;
    }
}