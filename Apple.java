//Nathan Humphrey
public class Apple {
    // instance variables
    private String type;
    private double weight;
    private double price;

    // default constructor
    public Apple() {
        this.type = "Gala";
        this.weight = 0.5;  
        this.price = 0.88;  
    }

    // parameterized constructor
    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    // accessors 
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // mutators with validation
    public void setType(String type) {
        // Valid apple types
        if (type.equals("Red Delicious") || type.equals("Golden Delicious") || 
            type.equals("Gala") || type.equals("Granny Smith")) {
            this.type = type;
        } else {
            System.out.println("Invalid apple type. Setting to default (Gala).");
            this.type = "Gala";  
        }
    }

    public void setWeight(double weight) {
        if (weight >= 0 && weight <= 2) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight. Setting to default (0.5 kg).");
            this.weight = 0.5;  // Default weight
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Setting to default ($0.88).");
            this.price = 0.88;  // Default price
        }
    }

    // Method to display the output
    public void writeOutput() {
        System.out.println("Apple Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
    }
}
