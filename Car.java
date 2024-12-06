//Nathan Humphrey
// car class that extends Vehicle
public class Car extends Vehicle {
    private double gasMileage; // in gallons
    private int numPassengers;

    // default constructor
    public Car() {
        super(); // Calls the Vehicle's default constructor
        this.gasMileage = 0.0;
        this.numPassengers = 0;
    }

    // parameterized constructor
    public Car(String manufacturerName, int numCylinders, String ownerName, double gasMileage, int numPassengers) {
        super(manufacturerName, numCylinders, ownerName); // Calls Vehicle's parameterized constructor
        setGasMileage(gasMileage);
        setNumPassengers(numPassengers);
    }

    // accessors
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    // Mutators
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            this.gasMileage = 0.0; // Default value
        }
    }

    public void setNumPassengers(int numPassengers) {
        if (numPassengers >= 0) {
            this.numPassengers = numPassengers;
        } else {
            this.numPassengers = 0; // Default value
        }
    }

    // equals method
    public boolean equals(Car c) {
        return super.equals(c) && this.gasMileage == c.gasMileage && this.numPassengers == c.numPassengers;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Gas Mileage: " + gasMileage + " gallons\n" +
               "Number of Passengers: " + numPassengers;
    }
}
