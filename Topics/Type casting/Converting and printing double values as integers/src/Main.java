import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number as a double.
        // TODO: Write your code here to read a double from the console
        Double numberInDouble = scanner.nextDouble();
        Integer numberInInt = numberInDouble.intValue();

        // Convert and print the number to an integer.

        // TODO: Write your code here to convert the double to an integer and print it out to the console
        System.out.println(numberInInt);
        scanner.close();
    }
}