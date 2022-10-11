import java.util.ArrayList;
import java.util.List;

public class Car extends MotorVehicle implements IComponent{
    // variables
    private String make;
    private String model;
    private String color;
    private int numberOfWheels;

    // constructor
    public Car (String brake, String emission, String engine, String steering, String transmission, int mileage, String make, String model, String color, int wheels) {
        super(brake, emission, engine, steering, transmission, mileage);
        this.make = make;
        this.model = model;
        this.color = color;
        if(wheels < 0) {
            this.numberOfWheels = 0;
        }
        else {
            this.numberOfWheels = wheels;
        }
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
        return this.numberOfWheels;
    }

    // setters
    public void getMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfWheels(int wheels) {
        if(wheels < 0) {
            this.numberOfWheels = 0;
        }
        else {
            this.numberOfWheels = wheels;
        }
    }

    @Override
    public int setNumberOfWindows(int windows) {
        return windows;
    }

    @Override
    public List<String> setMaterials(String material) {
        List<String> listOfMaterials = new ArrayList<>();
        listOfMaterials.add(material);
        return listOfMaterials;
    }
}