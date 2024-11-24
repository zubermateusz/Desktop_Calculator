import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();
        boolean flaga = false;
        //liczba1 is betwen liczb2 and liczb3 (inclusive)
        if(liczba2 >= liczba3 && liczba1 >= liczba3 && liczba1 <= liczba2) flaga = true;
        if(liczba3 >= liczba2 && liczba1 >= liczba2 && liczba1 <= liczba3) flaga = true;

        System.out.println(flaga);
    }
}