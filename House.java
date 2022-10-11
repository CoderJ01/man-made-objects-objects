import java.util.ArrayList;
import java.util.List;

public class House extends Building {
    // primative variables
    private boolean hasBasement;
    private boolean hasAttic;
    private boolean hasBackyard;
    private int basementArea;
    private int atticArea;
    private int backyardArea;

    // constructor
    public House(String foundation, int area, int rooms, boolean basement, boolean attic, boolean backyard) {
        super(foundation, area, rooms);
        this.hasBackyard = basement;
        this.hasAttic = attic;
        this.hasBackyard = backyard;
    }

    // inner class for House color scheme
    public class Bedroom {
        // variables
        private String bedType;
        private List<String> paintColors = new ArrayList<>();

        // constructor
        public Bedroom(String bed) {
            this.bedType = bed;
            this.paintColors = new ArrayList<>();
        }

        // getters
        public String getBedType() {
            return this.bedType;
        }  

        public List<String> getPaintColors() {
            return this.paintColors;
        }

        // setters
        public void setBedType(String bedType) {
            this.bedType = bedType;
        }

        public void setPaintColors(String color) {
            this.paintColors.add(color);
        }
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

    public int getBasementArea() {
        return this.basementArea;
    }

    public int getAtticArea() {
        return this.atticArea;
    }

    public int getBackyardArea() {
        return this.backyardArea;
    }

    // setters
    public void setBasement(boolean basement) {
        this.hasBasement = basement;
    }

    public void setAttic(boolean attic) {
        this.hasAttic = attic;
    }

    public void setBackyard(boolean backyard) {
        this.hasBackyard = backyard;
    }

    public void setBasementArea(int basementArea) {
        if(hasBasement() == true) {
            this.basementArea = basementArea;
        }
        else {
            System.out.println("Basement does not exist");
        }
    }

    public void setAtticArea(int atticArea) {
        if(hasAttic() == true) {
            this.atticArea = atticArea;
        }
        else {
            System.out.println("Attic does not exist");
        }
    }

    public void setBackyardArea(int backyardArea) {
        if(hasBackyard() == true) {
            this.backyardArea = backyardArea;
        }
        else {
            System.out.println("Backyard does not exist");
        }
    }
}