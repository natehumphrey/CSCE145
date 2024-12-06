//Nathan Humphrey
// CruiseShip.java
public class CruiseShip extends Ship {
    // instance variables
    private int passengerCapacity;
    private int crewMembers;

    // constructor
    public CruiseShip(String name, String launchDate, int passengerCapacity, int crewMembers) {
        super(name, launchDate);  // Call the superclass constructor
        this.passengerCapacity = passengerCapacity;
        this.crewMembers = crewMembers;
    }

    // accessors (getters)
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCrewMembers() {
        return crewMembers;
    }

    // mutators (setters)
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setCrewMembers(int crewMembers) {
        this.crewMembers = crewMembers;
    }

    // override toString method
    @Override
    public String toString() {
        return "Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity + "\nCrew: " + crewMembers;
    }
}


