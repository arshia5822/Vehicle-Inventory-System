public class Vehicle implements Comparable<Vehicle> {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean sold;

    /*
     * Creates a vehicle that starts as available.
     */
    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.sold = false;
    }

    /*
     * Creates a vehicle and lets the sold status be chosen.
     */
    public Vehicle(String make, String model, int year, double price, boolean sold) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.sold = sold;
    }

    /*
     * Returns the make of the vehicle.
     */
    public String getMake() {
        return make;
    }

    /*
     * Changes the make of the vehicle.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /*
     * Returns the model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /*
     * Changes the model of the vehicle.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /*
     * Returns the year of the vehicle.
     */
    public int getYear() {
        return year;
    }

    /*
     * Changes the year of the vehicle.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /*
     * Returns the price of the vehicle.
     */
    public double getPrice() {
        return price;
    }

    /*
     * Changes the price of the vehicle.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /*
     * Returns whether the vehicle is sold.
     */
    public boolean isSold() {
        return sold;
    }

    /*
     * Changes the sold status.
     */
    public void setSold(boolean sold) {
        this.sold = sold;
    }

    /*
     * Marks the vehicle as sold.
     */
    public void sellVehicle() {
        sold = true;
    }

    /*
     * Checks if the vehicle is still available.
     */
    public boolean isAvailable() {
        return !sold;
    }

    /*
     * Lowers the vehicle price by a chosen amount.
     */
    public void reducePrice(double amount) {
        if (amount > 0 && amount < price) {
            price = price - amount;
        }
    }

    /*
     * Compares vehicles by price.
     */
    public int compareTo(Vehicle other) {
        if (this.price < other.price) {
            return -1;
        } else if (this.price > other.price) {
            return 1;
        } else {
            return 0;
        }
    }

    /*
     * Returns vehicle information as a String.
     */
    public String toString() {
        return year + " " + make + " " + model + " - $" + price + " - Sold: " + sold;
    }

    /*
     * Checks if two vehicles are the same based on make, model, and year.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle other = (Vehicle) obj;
            return make.equals(other.make) && model.equals(other.model) && year == other.year;
        }

        return false;
    }
}