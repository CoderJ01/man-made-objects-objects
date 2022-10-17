import java.util.ArrayList;
import java.util.List;

public class House extends Building implements IComponent {
    // primitive variables
    private boolean hasBasement;
    private boolean hasAttic;
    private boolean hasBackyard;
    private int basementArea;
    private int atticArea;
    private int backyardArea;

    // array of Strings
    private List<String> materials = new ArrayList<>();

    // constructor
    public House(String foundation, int area, int rooms, boolean basement, boolean attic, boolean backyard) {
        super(foundation, area, rooms);
        this.hasBasement = basement;
        this.hasAttic = attic;
        this.hasBackyard = backyard;
    }

    // inner class 
    public class Bedroom {
        // variables
        private String bedType;
        private List<String> paintColors = new ArrayList<>();

        // constructor
        public Bedroom(String bed) {
            this.bedType = bed;
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

    @Override
    public List<String> getMaterials() {
        return this.materials;
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
            this.basementArea = -1;
        }
    }

    public void setAtticArea(int atticArea) {
        if(hasAttic() == true) {
            this.atticArea = atticArea;
        }
        else {
            this.atticArea = -1;
        }
    }

    public void setBackyardArea(int backyardArea) {
        if(hasBackyard() == true) {
            this.backyardArea = backyardArea;
        }
        else {
            this.backyardArea = -1;
        }
    }

    @Override
    public int setNumberOfWindows(int windows) {
        return windows;
    }

    @Override
    public void setMaterials(String material) {
        this.materials.add(material);
    }
}