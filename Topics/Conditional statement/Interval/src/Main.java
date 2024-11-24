import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int liczba = scanner.nextInt();
        if ((liczba > -15 && liczba <=12) ||
                (liczba > 14 && liczba < 17) ||
                liczba >= 19 ) System.out.println("True");
        else System.out.println("False");
    }
}