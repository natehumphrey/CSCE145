//Nathan Humphrey
public class Concert {
    // Instance variables
    private String bandName;
    private int capacity;
    private int numTicketsSoldByPhone;
    private int numTicketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // default Constructor
    public Concert() {
        this.bandName = "No name yet";
        this.capacity = 0;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // constructor with parameters
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) {
        setBandName(bandName);
        setCapacity(capacity);
        setPriceByPhone(priceByPhone);
        setPriceAtVenue(priceAtVenue);
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
    }

    // constructor with parameters 
    // number of tickets sold at the venue, Price by phone, Price at venue
    public Concert(String bandName, int capacity, int numTicketsSoldByPhone, int numTicketsSoldAtVenue,
                   double priceByPhone, double priceAtVenue) {
        setBandName(bandName);
        setCapacity(capacity);
        setNumTicketsSoldByPhone(numTicketsSoldByPhone);
        setNumTicketsSoldAtVenue(numTicketsSoldAtVenue);
        setPriceByPhone(priceByPhone);
        setPriceAtVenue(priceAtVenue);
    }

    // Accessor (Getter) and Mutator (Setter) Methods
    
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        if (bandName != null && !bandName.isEmpty()) {
            this.bandName = bandName;
        } else {
            System.out.println("Band name cannot be empty.");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Capacity must be a positive number.");
        }
    }

    public int getNumTicketsSoldByPhone() {
        return numTicketsSoldByPhone;
    }

    public void setNumTicketsSoldByPhone(int numTicketsSoldByPhone) {
        if (numTicketsSoldByPhone >= 0) {
            this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        } else {
            System.out.println("Tickets sold by phone cannot be negative.");
        }
    }

    public int getNumTicketsSoldAtVenue() {
        return numTicketsSoldAtVenue;
    }

    public void setNumTicketsSoldAtVenue(int numTicketsSoldAtVenue) {
        if (numTicketsSoldAtVenue >= 0) {
            this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        } else {
            System.out.println("Tickets sold at venue cannot be negative.");
        }
    }

    public double getPriceByPhone() {
        return priceByPhone;
    }

    public void setPriceByPhone(double priceByPhone) {
        if (priceByPhone >= 0) {
            this.priceByPhone = priceByPhone;
        } else {
            System.out.println("Price by phone must be a non-negative number.");
        }
    }

    public double getPriceAtVenue() {
        return priceAtVenue;
    }

    public void setPriceAtVenue(double priceAtVenue) {
        if (priceAtVenue >= 0) {
            this.priceAtVenue = priceAtVenue;
        } else {
            System.out.println("Price at venue must be a non-negative number.");
        }
    }

    // method to calculate total number of tickets sold
    public int totalNumberOfTicketsSold() {
        return numTicketsSoldByPhone + numTicketsSoldAtVenue;
    }

    // method to calculate tickets remaining
    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    // method to add tickets sold at the venue
    public void buyTicketsAtVenue(int tickets) {
        if (tickets > 0 && totalNumberOfTicketsSold() + tickets <= capacity) {
            numTicketsSoldAtVenue += tickets;
        } else {
            System.out.println("Cannot sell that many tickets at the venue. Not enough capacity.");
        }
    }

    // method to add tickets sold by phone
    public void buyTicketsByPhone(int tickets) {
        if (tickets > 0 && totalNumberOfTicketsSold() + tickets <= capacity) {
            numTicketsSoldByPhone += tickets;
        } else {
            System.out.println("Cannot sell that many tickets by phone. Not enough capacity.");
        }
    }

    // method to calculate total sales (revenue)
    public double totalSales() {
        return (numTicketsSoldByPhone * priceByPhone) + (numTicketsSoldAtVenue * priceAtVenue);
    }
}

