public class Main {

    public static void main(String[] args) {
        // CAR
        Car car = new Car("parking brake", "exhaust emissions", "air cooling", "fully electric power steering", "manuel transmission", 100000, "Toyota", "Prius", "silver", 4);
        System.out.println("*****CAR*****");
        // methods from Building (super class)
        System.out.println("Brake Type: " + car.getBrakeType());
        System.out.println("Emission Type....: " + car.getEmitType());
        System.out.println("Cooling Type.....: " + car.getCoolingType());
        System.out.println("Steering Type....: " + car.getSteeringType());
        System.out.println("Transmission Type: " + car.getTransmissionType());
        System.out.println("Mileage..........: " + car.getMileage());
        // methods from Car
        System.out.println("Make.............: " + car.getMake());
        System.out.println("Model............: " + car.getModel());
        System.out.println("Color............: " + car.getColor());
        System.out.println("Number of wheels.: " + car.getNumberOfWheels());
        // methods derived from IComponent (interface)
        System.out.println("Number of windows: " + car.setNumberOfWindows(4));
        car.setMaterials("metal");
        car.setMaterials("glass");
        car.setMaterials("plastic");
        System.out.println("Materials.........: " + car.getMaterials());
    }
}