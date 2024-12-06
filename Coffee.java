
// Nathan Humphrey

public class Coffee {
    // instance variables
    private String name;
    private int caffeineContent;

    // default constructor that sets default values
    public Coffee() {
        this.name = "none";
        this.caffeineContent = 50;  // default caffeine content is 50 mg
    }

    // constructor that allows setting name and caffeine content
    public Coffee(String name, int caffeineContent) {
        setName(name);
        setCaffeineContent(caffeineContent);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public int getCaffeineContent() {
        return caffeineContent;
    }

    // mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setCaffeineContent(int caffeineContent) {
        if (caffeineContent >= 50 && caffeineContent <= 300) {
            this.caffeineContent = caffeineContent;
        } else {
            System.out.println("Caffeine content must be between 50 and 300 mg.");
        }
    }

    // RiskyAmount method - calculates the number of cups before it becomes dangerous
    public double riskyAmount() {
        return 180.0 / ((caffeineContent / 100.0) * 6.0);
    }

    // Equals method - compares two Coffee objects
    public boolean equals(Coffee other) {
        return this.name.equals(other.name) && this.caffeineContent == other.caffeineContent;
    }
}

    
 

