public class Main {

    public static void main(String[] args) {
       IComponent house = new House("basement", 500, 2, true, false, true);
       System.out.println(house.setNumberOfWindows(10));
       house.setMaterials("brick");
       house.setMaterials("wood");
       System.out.println(house.getMaterials());
    }
}