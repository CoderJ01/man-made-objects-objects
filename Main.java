public class Main {

    public static void main(String[] args) {
        // Car test
        Car car = new Car("parking brake", "exhaust emissions", "air cooling", "fully electric power steering", "manuel transmission", 100000, "Honda", "Civic", "dark blue", 4);
        System.out.println(car.getColor());
        System.out.println(car.getBrakeType());
        car.setColor("black");
        System.out.println(car.getColor());
    }
}