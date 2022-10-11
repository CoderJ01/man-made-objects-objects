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
    public class PaintColor {
        // variables
        private String primaryColor;
        private String secondaryColor;

        // constructor
        public PaintColor(String primary, String secondary) {
            this.primaryColor = primary;
            this.secondaryColor = secondary;
        }

        // getters
        public String getPrimaryColor() {
            return this.primaryColor;
        }  

        public String getSecondaryColor() {
            return this.secondaryColor;
        }

        // setters
        public void setPrimaryColor(String p) {
            this.primaryColor = p;
        }

        public void setSecondaryColor(String s) {
            this.secondaryColor = s;
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