import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int iloscLiczb = scanner.nextInt();
        int tempLiczba = scanner.nextInt();
        int liczbaPodzielen = tempLiczba % 4 == 0 ? tempLiczba / 4 : 0;//zapisana ilość podzielen przez 4
        for(int i = 0; i < iloscLiczb-1; i++){
            int liczbaScanner = scanner.nextInt();
            if(liczbaScanner % 4 == 0  && liczbaScanner / 4 > liczbaPodzielen)
                    liczbaPodzielen = liczbaScanner / 4;
        }
        System.out.println(liczbaPodzielen * 4);
    }
}