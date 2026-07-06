public class SportsCar extends Vehicle {
    private int horsePower;
    private boolean convertible;

    /*
     * Creates a sports car with horsepower and convertible information.
     */
    public SportsCar(String make, String model, int year, double price, int horsePower, boolean convertible) {
        super(make, model, year, price);
        this.horsePower = horsePower;
        this.convertible = convertible;
    }

    /*
     * Creates a sports car that is not convertible by default.
     */
    public SportsCar(String make, String model, int year, double price, int horsePower) {
        super(make, model, year, price);
        this.horsePower = horsePower;
        this.convertible = false;
    }

    /*
     * Returns the horsepower.
     */
    public int getHorsePower() {
        return horsePower;
    }

    /*
     * Changes the horsepower.
     */
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    /*
     * Returns if the car is convertible.
     */
    public boolean isConvertible() {
        return convertible;
    }

    /*
     * Changes whether the car is convertible.
     */
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    /*
     * Checks if the sports car is high performance.
     */
    public boolean isHighPerformance() {
        return horsePower >= 400;
    }

    /*
     * Adds horsepower to the sports car.
     */
    public void upgradeHorsePower(int amount) {
        if (amount > 0) {
            horsePower = horsePower + amount;
        }
    }

    /*
     * Returns sports car information as a String.
     */
    public String toString() {
        return super.toString() + " - Horsepower: " + horsePower + " - Convertible: " + convertible;
    }
}