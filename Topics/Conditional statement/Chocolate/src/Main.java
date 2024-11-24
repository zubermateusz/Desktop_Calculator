import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt(); //length
        int m = scanner.nextInt(); //width
        int k = scanner.nextInt(); //segments to cut

        boolean flagaPodzielnosci = false;

        for (int i = 0; i < n; i++) {
            if (i * m == k) {
                flagaPodzielnosci = true;
            }
            if (i * n == k) {
                flagaPodzielnosci = true;
            }
        }
        if (flagaPodzielnosci) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
