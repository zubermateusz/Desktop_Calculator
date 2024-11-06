import java.util.Scanner;

public class Main {

    // Base class Polygon
    static class Polygon {
        private int sideLength;

        // Method to set the length of sides
        public void setSideLength(int sideLength) {
            this.sideLength = sideLength;
        }

        // Method to get the length of sides
        public int getSideLength() {
            return sideLength;
        }
    }

    // Derived class Square
    static class Square extends Polygon{
        public int getArea(int length){
            return length * length;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideLength = scanner.nextInt();
        Polygon polygon = new Polygon();
        polygon.setSideLength(sideLength);
        System.out.println(new Square().getArea(polygon.getSideLength()));
        // Create an instance of Square

        // Set the side length

        // Calculate and print the area
    }
}