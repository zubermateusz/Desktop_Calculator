import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        int liczba = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean flaga = false;
        if(weekend && liczba >= 15 && liczba <= 25) flaga = true;
        if(!weekend && liczba >= 10 && liczba <= 20) flaga = true;

        System.out.println(flaga);
    }
}