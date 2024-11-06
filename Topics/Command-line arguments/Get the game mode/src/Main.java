import java.util.Scanner;

class Problem {
    public static void main(String[] args) {
        boolean isModeSetValue = false;
        for (int i = 0; i < args.length; i+=2) {
            if (args[i].contains("mode")) {
                System.out.println(args[i+1]);
                isModeSetValue = true;
                break;
            }
        }
        if (!isModeSetValue) {
            System.out.println("default");
        }

    }
}