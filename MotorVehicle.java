public abstract class MotorVehicle {
    // variables
    private String brakeSystemType;
    private String emissionSystemType;
    private String engineCoolingSystemType;
    private String steeringType;
    private String transmissionType;
    private int mileage;

    // constructor
    public MotorVehicle(String brake, String emission, String engine, String steering, String transmission, int mileage) {
        this.brakeSystemType = brake;
        this.emissionSystemType = emission;
        this.engineCoolingSystemType = engine;
        this.steeringType = steering;
        this.transmissionType = transmission;
        this.mileage = mileage;
    }

    // getters
    public String getBrakeType() {
        return this.brakeSystemType;
    }

    public String getEmitType() {
        return this.emissionSystemType;
    }

    public String getCoolingType() {
        return this.engineCoolingSystemType;
    }

    public String getSteeringType() {
        return this.steeringType;
    }

    public String getTransmissionType() {
        return this.transmissionType;
    }

    public int getMileage() {
        return this.mileage;
    }

    // setters
    public void setBrakeType(String b) {
        this.brakeSystemType = b;
    }

    public void setEmitType(String e) {
        this.emissionSystemType = e;
    }

    public void setCoolingType(String e) {
        this.engineCoolingSystemType = e;
    }

    public void setSteeringType(String s) {
        this.steeringType = s;
    }

    public void setTransmissionType(String t) {
        this.transmissionType = t;
    }

    public void setMileage(int m) {
        this.mileage = m;
    }
}