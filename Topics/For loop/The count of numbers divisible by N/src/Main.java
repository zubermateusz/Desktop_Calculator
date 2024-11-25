import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int poczatek = scanner.nextInt();
        int koniec = scanner.nextInt();
        int n = scanner.nextInt();
        int ilosc = 0;
        for ( int i = poczatek; i <= koniec; i++){
            if (i%n == 0) ilosc++;
        }
        System.out.println(ilosc);
    }
}