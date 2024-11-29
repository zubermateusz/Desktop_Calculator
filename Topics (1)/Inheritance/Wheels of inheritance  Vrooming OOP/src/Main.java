import java.util.Scanner;

public class Main {

    public static class Vehicle {
        public String brand;
        public int year;

        public void displayInfo(){}
    }

    public static class Car extends Vehicle {
        public int numDoors;

        public Car(String brand, int year, int numDoors){
            this.brand = brand;
            this.year = year;
            this.numDoors = numDoors;
        }

        @Override
        public void displayInfo() {
            System.out.println(brand + " (" + year + ")");
            System.out.println("Number of doors: " + numDoors);
        }
    }

    public static class Motorcycle extends Vehicle{
        public boolean hasSidecar;

        public Motorcycle(String brand, int year, boolean hasSidecar) {
            this.brand = brand;
            this.year = year;
            this.hasSidecar = hasSidecar;
        }

        public void displayInfo() {
            System.out.println(brand + " (" + year + ")");
            System.out.println("Has sidecar: " + hasSidecar);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Implement the Vehicle class

        // TODO: Implement the Car class (extends Vehicle)

        // TODO: Implement the Motorcycle class (extends Vehicle)

        // Read input and create appropriate vehicle object
        String vehicleType = scanner.nextLine();
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());

        if (vehicleType.equals("Car")) {
            int numDoors = Integer.parseInt(scanner.nextLine());
            new Car(brand, year, numDoors).displayInfo();
        } else if (vehicleType.equals("Motorcycle")) {
            boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());
            new Motorcycle(brand, year, hasSidecar).displayInfo();
        }

        scanner.close();
    }
}