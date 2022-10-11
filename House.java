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
        private String paintColor;

        // constructor
        public Bedroom(String bed, String color) {
            this.bedType = bed;
            this.paintColor = color;
        }

        // getters
        public String getBedType() {
            return this.bedType;
        }  

        public String getPaintColor() {
            return this.paintColor;
        }

        // setters
        public void setPrimaryColor(String b) {
            this.bedType = b;
        }

        public void setSecondaryColor(String c) {
            this.paintColor = c;
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