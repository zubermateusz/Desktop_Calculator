import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();

        boolean check = false;
        if(liczba1 != liczba2 && liczba2 != liczba3 && liczba1 != liczba3){ check = true;}
        System.out.println(check);
    }
}