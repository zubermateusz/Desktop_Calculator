import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = scanner.nextInt();
        scanner.nextLine();
        String line;

        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int  i = 0; i < count; i++) {
            line = scanner.nextLine();
            if (line.equals("A")) {
                a++;
            }
            if (line.equals("B")) {
                b++;
            }
            if (line.equals("C")) {
                c++;
            }
            if (line.equals("D")) {
                d++;
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
