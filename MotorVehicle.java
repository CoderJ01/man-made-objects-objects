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
        if(mileage < 0) {
            this.mileage = 0;
        }
        else {
            this.mileage = mileage;
        }
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
    public void setBrakeType(String brakeType) {
        this.brakeSystemType = brakeType;
    }

    public void setEmitType(String emisonType) {
        this.emissionSystemType = emisonType;
    }

    public void setCoolingType(String coolingType) {
        this.engineCoolingSystemType = coolingType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public void setTransmissionType(String trasmissionType) {
        this.transmissionType = trasmissionType;
    }

    public void setMileage(int mileage) {
        if(mileage < 0) {
            this.mileage = 0;
        }
        else {
            this.mileage = mileage;
        }
    }
}