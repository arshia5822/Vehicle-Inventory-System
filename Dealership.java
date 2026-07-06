import java.util.ArrayList;
import java.util.Collections;

public class Dealership {
    private String dealershipName;
    private ArrayList<Vehicle> vehicles;

    /*
     * Creates a dealership with an empty vehicle inventory.
     */
    public Dealership(String dealershipName) {
        this.dealershipName = dealershipName;
        vehicles = new ArrayList<>();
    }

    /*
     * Returns the dealership name.
     */
    public String getDealershipName() {
        return dealershipName;
    }

    /*
     * Changes the dealership name.
     */
    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    /*
     * Adds a vehicle to the inventory.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    /*
     * Removes a vehicle from the inventory.
     */
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    /*
     * Prints all vehicles in the dealership.
     */
    public void displayVehicles() {
        System.out.println("Vehicles at " + dealershipName + ":");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    /*
     * Prints only vehicles that have not been sold.
     */
    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                System.out.println(vehicle);
            }
        }
    }

    /*
     * Returns the total number of vehicles.
     */
    public int getTotalVehicles() {
        return vehicles.size();
    }

    /*
     * Searches for a vehicle by make and model.
     */
    public Vehicle findVehicle(String make, String model) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(make)
                    && vehicle.getModel().equalsIgnoreCase(model)) {
                return vehicle;
            }
        }

        return null;
    }

    /*
     * Sorts the vehicles from cheapest to most expensive.
     */
    public void sortByPrice() {
        Collections.sort(vehicles);
    }

    /*
     * Calculates the total value of all available vehicles.
     */
    public double getAvailableInventoryValue() {
        double total = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                total = total + vehicle.getPrice();
            }
        }

        return total;
    }

    /*
     * Counts how many vehicles are still available.
     */
    public int countAvailableVehicles() {
        int count = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable()) {
                count++;
            }
        }

        return count;
    }
}