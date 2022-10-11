public class Main {

    public static void main(String[] args) {
        // CAR
        Car car = new Car("parking brake", "exhaust emissions", "air cooling", "fully electric power steering", "manuel transmission", 100000, "Toyota", "Prius", "silver", 4);
        System.out.println("*************CAR*************");
        // methods from MotorVehicle (super class)
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
        System.out.println("Materials........: " + car.getMaterials());

        System.out.println("");  // space

        // HOUSE
        House house = new House("concrete slab", 2000, 6, false, true, true);
        System.out.println("*******************HOUSE*******************");
        // methods from Building (super class)
        System.out.println("Foundation.....................: " + house.getFoundationType());
        System.out.println("Area...........................: " + house.getArea());
        System.out.println("Number of Rooms................: " + house.getNumberOfRooms());
        // methods from House
        System.out.println("T/F - This house has a basement: " + house.hasBasement());
        System.out.println("T/F - This house has an attic..: " + house.hasAttic());
        house.setAtticArea(300);
        System.out.println("Attic Area.....................: " + house.getAtticArea());
        System.out.println("T/F - This house has a backyard: " + house.hasBackyard());
        house.setBackyardArea(450);
        System.out.println("Backyard Area..................: " + house.getBackyardArea());
        // methods from Bedroom (inner class)
        House.Bedroom bedroom = house.new Bedroom("twin-sized");
        System.out.println("BedType........................: " + bedroom.getBedType());
        bedroom.setPaintColors("navy blue");
        bedroom.setPaintColors("dark gray");
        System.out.println("Bedroom colors.................: " + bedroom.getPaintColors());
        // methods derived from IComponent (interface)
        System.out.println("Number of windows..............: " + house.setNumberOfWindows(4));
        house.setMaterials("brick");
        house.setMaterials("cement");
        house.setMaterials("tiles");
        System.out.println("Materials......................: " + house.getMaterials());
    }
}