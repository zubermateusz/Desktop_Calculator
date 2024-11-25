import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = 1;
        for(;a<b; a++){
            temp *= a;
            //System.out.println(temp * a);
        }
        System.out.println(temp);
    }
}