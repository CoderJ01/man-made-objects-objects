public class Main {

    public static void main(String[] args) {
       IComponent house = new House("basement", 500, 2, true, false, true);
       System.out.println(house.setNumberOfWindows(10));
       System.out.println(house.setMaterial("brick"));
    }
}