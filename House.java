public class House extends Building {
    // primative variables
    private boolean hasBasement;
    private boolean hasAttic;
    private boolean hasBackyard;

    // constructor
    public House(String foundation, int area, int rooms, boolean basement, boolean attic, boolean backyard) {
        super(foundation, area, rooms);
        this.hasBackyard = basement;
        this.hasAttic = attic;
        this.hasBackyard = backyard;
    }

    // getters
    public boolean hasBasement() {
        return this.hasBasement;
    }

    public boolean hasAttic() {
        return this.hasAttic;
    }

    public boolean hasBackyard() {
        return this.hasBackyard;
    }

    // setters
    public void setBasement(boolean b) {
        this.hasBasement = b;
    }

    public void setAttic(boolean a) {
        this.hasAttic = a;
    }

    public void setBackyard(boolean b) {
        this.hasBackyard = b;
    }
}