import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        if( a > 0 && b > 0 && c > 0 ) {
            if (a + b > c && a + c > b && b + c > a) System.out.println("YES");
            else System.out.println("NO");
        } else System.out.println("NO");
    }
}