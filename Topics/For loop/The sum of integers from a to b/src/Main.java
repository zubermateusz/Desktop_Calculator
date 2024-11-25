import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int tempLiczba = 0;

        for( int i = liczba1 ; i <= liczba2; i++){
           tempLiczba += i;
        }

        System.out.println(tempLiczba);
    }
}