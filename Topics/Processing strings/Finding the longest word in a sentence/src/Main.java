import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        // Your code here
        String[] sentenceSplit = sentence.split(" ");
        String longestWord = sentenceSplit[0];
        for(int i = 1; i < sentenceSplit.length; i++){
            if(sentenceSplit[i].length() > longestWord.length()){
                longestWord = sentenceSplit[i];
            }
        }
        System.out.println(longestWord);
    }
}