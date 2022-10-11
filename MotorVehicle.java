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
}