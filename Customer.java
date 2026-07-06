public class Customer {
    private String name;
    private String phoneNumber;
    private Vehicle purchasedVehicle;

    /*
     * Creates a customer without a purchased vehicle.
     */
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.purchasedVehicle = null;
    }

    /*
     * Creates a customer who already has a purchased vehicle.
     */
    public Customer(String name, String phoneNumber, Vehicle purchasedVehicle) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.purchasedVehicle = purchasedVehicle;
    }

    /*
     * Returns the customer's name.
     */
    public String getName() {
        return name;
    }

    /*
     * Changes the customer's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Returns the customer's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*
     * Changes the customer's phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*
     * Returns the vehicle the customer bought.
     */
    public Vehicle getPurchasedVehicle() {
        return purchasedVehicle;
    }

    /*
     * Changes the customer's purchased vehicle.
     */
    public void setPurchasedVehicle(Vehicle purchasedVehicle) {
        this.purchasedVehicle = purchasedVehicle;
    }

    /*
     * Allows a customer to buy a vehicle.
     */
    public void buyVehicle(Vehicle vehicle) {
        if (vehicle != null && vehicle.isAvailable()) {
            purchasedVehicle = vehicle;
            vehicle.sellVehicle();
        }
    }

    /*
     * Checks if the customer owns a vehicle.
     */
    public boolean ownsVehicle() {
        return purchasedVehicle != null;
    }

    /*
     * Returns customer information as a String.
     */
    public String toString() {
        if (purchasedVehicle == null) {
            return name + " (" + phoneNumber + ") has not purchased a vehicle.";
        }

        return name + " (" + phoneNumber + ") purchased: "
                + purchasedVehicle.getMake() + " " + purchasedVehicle.getModel();
    }
}