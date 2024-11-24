import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();

        boolean flaga = false;
        if(liczba1 >= 1 && liczba2 < 1 && liczba3 < 1) flaga = true;
        if(liczba2 >= 1 && liczba1 < 1 && liczba3 < 1) flaga = true;
        if(liczba3 >= 1 && liczba2 < 1 && liczba1 < 1) flaga = true;

        System.out.println(flaga);
    }
}