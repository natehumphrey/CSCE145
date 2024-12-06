//Nathan Humphrey
// CargoShip.java
public class CargoShip extends Ship {
    // instance variables
    private double tonnage;
    private double maxSpeed;

    // constructor
    public CargoShip(String name, String launchDate, double tonnage, double maxSpeed) {
        super(name, launchDate);  // Call the superclass constructor
        this.tonnage = tonnage;
        this.maxSpeed = maxSpeed;
    }

    // accessors (getters)
    public double getTonnage() {
        return tonnage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // mutators (setters)
    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // override toString method
    @Override
    public String toString() {
        return "Name: " + getName() + "\nTonnage: " + tonnage + " DWT\nMaximum Speed: " + maxSpeed + " mph";
    }
}

