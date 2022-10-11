public abstract class Building {
    // variables
    private String foundationType;
    private int area;
    private int numberOfRooms;

    // constructor
    public Building(String foundation, int area, int rooms) {
        this.foundationType = foundation;
        this.area = area;
        this.numberOfRooms = rooms;
    }
}