import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int poczatek = scanner.nextInt();;
        int koniec = scanner.nextInt();

        for(int i = poczatek; i <= koniec; i++){
            if (i%3 == 0 && i%5 ==0 ) System.out.println("FizzBuzz");
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i%5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}