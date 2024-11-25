import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int line = scanner.nextInt();
        int shipped =0;// ==0
        int fixed =0;// ==1
        int removed =0;// ==-1
    
        for(int i = 0; i< line; i++){
            int product = scanner.nextInt();
            if (product == 0) shipped ++;
            if (product == 1) fixed++;
            if (product == -1) removed++;
            }
        System.out.println();
        System.out.println(shipped + " " + fixed + " " + removed);
    }
}
