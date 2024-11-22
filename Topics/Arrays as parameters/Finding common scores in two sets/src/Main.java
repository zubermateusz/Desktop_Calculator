import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take two integers n and m – the number of scores in each set
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Take two arrays a and b – the score sets
        int[] a = new int[n];
        int[] b = new int[m];

        for(int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        int commonScores = findCommonScores(a, b);

        // Print out the number of common scores
        System.out.println(commonScores);
    }

    public static int findCommonScores(int []a, int[] b) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && a[i] != 0) {
                    ++result;
                    a[i] = 0;
                    b[j] = 0;
                }
            }
        }
        return result;
    }
    // Declare method findCommonScores here
    // This method takes two arrays as parameters and returns an integer
    // This method should contain the logic to find common elements in two arrays

}