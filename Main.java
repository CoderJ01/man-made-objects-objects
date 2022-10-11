public class Main {

    public static void main(String[] args) {
        // Car test
        Car car = new Car("parking brake", "exhaust emissions", "air cooling", "fully electric power steering", "manuel transmission", 100000, "Honda", "Civic", "dark blue", 4);
        System.out.println(car.getColor());
        System.out.println(car.getBrakeType());
        car.setColor("black");
        System.out.println(car.getColor());
        System.out.println("");

        // House test
        House house = new House("concrete slab", 1500, 5, true, false, true);
        House.Bedroom bedroom = house.new Bedroom("twin-sized");
        System.out.println(house.getFoundationType());
        System.out.println(bedroom.getBedType());
        bedroom.setPaintColors("royal blue");
        bedroom.setPaintColors("dim gray");
        System.out.println(bedroom.getPaintColors());

    }
}