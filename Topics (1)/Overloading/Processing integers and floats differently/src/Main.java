import java.util.Scanner;

public class Main {

    // Create a method named 'process' to handle integers
    // Hint: When dealing with integers, you should return the square of the number
    public void process(Integer number) {
        System.out.println(number * number);
    }
    // Create a method named 'process' to handle floats
    // Hint: When dealing with floats, you should return the number rounded to the nearest whole number
    public void process(Float number) {
        if (number.intValue() + 0.5 >= number) {
            System.out.println(number.intValue());
        } else {
            System.out.println(number.intValue() + 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of input from the console
        String input = scanner.nextLine();

        try {
            Integer integerInput = Integer.parseInt(input);
            // Call the 'process' method with the integer input and print the result
            new Main().process(integerInput);
        } catch (NumberFormatException e) {
            Float floatInput = Float.parseFloat(input);
            // Call the 'process' method with the float input and print the result
            new Main().process(floatInput);
        }
    }
}