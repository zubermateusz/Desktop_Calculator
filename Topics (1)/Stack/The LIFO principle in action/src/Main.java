import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Deque<Integer> stack = new ArrayDeque();
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        while (numberOfElements > 0) {
            stack.push(scanner.nextInt());
            numberOfElements--;
        }
        scanner.close();
        for (int n : stack) {
            System.out.println(stack.pop());
        }
    }
}