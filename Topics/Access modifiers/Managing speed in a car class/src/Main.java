import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate a Car object here and use the drive method
        // Use displaySpeed to print the current speed
        Car car = new Car();
        car.displaySpeed();
    }
}

class Car {
    private int speed;

    public Car() {
        // Initialize the speed field here
        Scanner scanner = new Scanner(System.in);
        drive(scanner.nextInt());
    }

    public void drive(int increase) {
        // Write a method that takes an integer as argument 
        // and adds it to the 'speed'.
        // Use a condition to check if the speed becomes greater than 200
        // if so, cap the speed at 200
        this.speed += increase;
        if (this.speed > 200) {
            this.speed = 200;
        }
    }

    public void displaySpeed() {
        // Write a method that prints the current speed
        System.out.println(this.speed);
    }
}