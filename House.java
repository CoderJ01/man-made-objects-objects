import java.util.ArrayList;
import java.util.List;

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
        public void setBedType(String b) {
            this.bedType = b;
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