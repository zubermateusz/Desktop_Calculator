import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int poczatek = scanner.nextInt();
        int koniec = scanner.nextInt();
        float sum = 0;
        int iloscLiczb = 0;
        for(int i = poczatek; i <= koniec; i++) {
            if(i%3 == 0) {sum += i; iloscLiczb++;}

        }
        System.out.println((float)sum/iloscLiczb);
    }
}