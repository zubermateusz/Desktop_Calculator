import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String lineOfBrackets = scanner.nextLine();
        Deque<Character> stackOfBracket = new ArrayDeque();
        for (char n : lineOfBrackets.toCharArray()) {
            if (n == '(' || n == '{' || n == '[') {
                stackOfBracket.push(n);
            } else {
                if (!stackOfBracket.isEmpty()) {
                    if (n == ')' && stackOfBracket.peek() == '(') {
                        stackOfBracket.pop();
                    } else {
                        if (n == ']' && stackOfBracket.peek() == '[') {
                         stackOfBracket.pop();
                        } else {
                            if (n == '}' && stackOfBracket.peek() == '{') {
                                stackOfBracket.pop();
                            } else {
                                System.out.println("false");
                                return;
                            }
                        }
                    }
                } else {
                    System.out.println("false");
                    return;
                }
            }
        }
        if (stackOfBracket.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}