public class ProjectOneTester {

    /*
     * This program models a car dealership system. The problem being solved is that
     * a dealership needs to store vehicles, display available vehicles, sell vehicles
     * to customers, search the inventory, and compare vehicles by price. The Vehicle
     * class represents a general vehicle and implements Comparable so vehicles can be
     * sorted by price. The SportsCar class is a specific kind of Vehicle and adds
     * horsepower and convertible information. The Customer class stores customer
     * information and the vehicle a customer bought. The Dealership class stores all
     * vehicles using an ArrayList and contains methods for adding, displaying,
     * searching, sorting, and calculating inventory value. This main method shows the
     * basic behaviour of the whole program.
     */

    public static void main(String[] args) {

        Dealership dealership = new Dealership("TMU Auto");

        Vehicle car1 = new Vehicle("Toyota", "Corolla", 2021, 22000);
        Vehicle car2 = new Vehicle("Honda", "Civic", 2022, 25000);

        SportsCar car3 = new SportsCar("Ford", "Mustang", 2023, 48000, 450, true);
        SportsCar car4 = new SportsCar("Chevrolet", "Camaro", 2022, 46000, 430);

        dealership.addVehicle(car1);
        dealership.addVehicle(car2);
        dealership.addVehicle(car3);
        dealership.addVehicle(car4);

        dealership.displayVehicles();

        System.out.println();

        System.out.println("Sorting vehicles by price:");
        dealership.sortByPrice();
        dealership.displayVehicles();

        System.out.println();

        Customer customer = new Customer("Arshia", "647-123-4567");
        customer.buyVehicle(car3);

        System.out.println("Customer purchase:");
        System.out.println(customer);

        System.out.println();

        dealership.displayAvailableVehicles();

        System.out.println();

        System.out.println("Searching for Toyota Corolla:");
        Vehicle foundVehicle = dealership.findVehicle("Toyota", "Corolla");

        if (foundVehicle != null) {
            System.out.println("Vehicle found: " + foundVehicle);
        } else {
            System.out.println("Vehicle was not found.");
        }

        System.out.println();

        System.out.println("Comparing prices:");
        if (car1.compareTo(car2) < 0) {
            System.out.println(car1.getModel() + " is cheaper than " + car2.getModel());
        } else if (car1.compareTo(car2) > 0) {
            System.out.println(car1.getModel() + " is more expensive than " + car2.getModel());
        } else {
            System.out.println(car1.getModel() + " and " + car2.getModel() + " have the same price.");
        }

        System.out.println();

        System.out.println("Checking equality:");
        System.out.println("car1 equals car2: " + car1.equals(car2));

        System.out.println();

        System.out.println("Sports car check:");
        System.out.println(car4.getModel() + " high performance: " + car4.isHighPerformance());

        System.out.println();

        System.out.println("Total vehicles: " + dealership.getTotalVehicles());
        System.out.println("Available vehicles: " + dealership.countAvailableVehicles());
        System.out.println("Available inventory value: $" + dealership.getAvailableInventoryValue());
    }
}