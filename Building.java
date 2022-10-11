public abstract class Building {
    // variables
    private String foundationType;
    private int area;
    private int numberOfRooms;

    // constructor
    public Building(String foundation, int area, int rooms) {
        this.foundationType = foundation;
        if(area < 0) {
            this.area = 0;
        }
        else {
            this.area = area;
        }
        if(rooms < 0) {
            this.numberOfRooms = 0;
        }
        else {
            this.numberOfRooms = rooms;
        }
    }

    // getters
    public String getFoundationType() {
        return this.foundationType;
    }

    public int getArea() {
        return this.area;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    // setters
    public void setFoundationType(String foundationType) {
        this.foundationType = foundationType;
    }

    public void setArea(int area) {
        if(area < 0) {
            this.area = 0;
        }
        else {
            this.area = area;
        }
    }

    public void setNumberOfRooms(int rooms) {
        if(rooms < 0) {
            this.numberOfRooms = 0;
        }
        else {
            this.numberOfRooms = rooms;
        }
    }
}