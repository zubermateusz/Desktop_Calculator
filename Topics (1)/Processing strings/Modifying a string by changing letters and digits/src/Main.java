import java.util.Scanner;

public class Main {
    public static String transformString(String s) {
        // implement your string processing here
        StringBuilder sAfterChanged = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c > '0' && c <= '9') {
                sAfterChanged.append(--c);
                continue;
            }
            if (c == '0') {
                sAfterChanged.append("9");
                continue;
            }
            if (c >= 'a' && c < 'z') {
                sAfterChanged.append(++c);
                continue;
            }
            if (c == 'z') {
                sAfterChanged.append("a");
            }
        }
        return sAfterChanged.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(transformString(s));
    }
}