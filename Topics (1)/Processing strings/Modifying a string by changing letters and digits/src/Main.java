import java.util.Scanner;

public class Main {
    public static String transformString(String s) {
        // implement your string processing here
        String sAfterChanged = "";
        for (char c : s.toCharArray()) {
            if (c > '0' && c <= '9') {
                sAfterChanged += --c;
                continue;
            }
            if (c == '0') {
                sAfterChanged += "9";
                continue;
            }
            if (c >= 'a' && c < 'z') {
                sAfterChanged += ++c;
                continue;
            }
            if (c == 'z') {
                sAfterChanged += "a";
            }
        }
        return sAfterChanged;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(transformString(s));
    }
}