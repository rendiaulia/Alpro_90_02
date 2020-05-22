package ch08;

import java.util.Scanner;

public class LongestCommonSubstringProblem {
    public static int lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        int max = 0;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (X.charAt(i) == Y.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }

                    if (max < dp[i][j])
                        max = dp[i][j];
                }

            }
        }

        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String X;
        String Y;

        System.out.println("Algoritma Longest Common Substring Problem");
        System.out.print("Masukkan Karakter A = ");
        X = in.nextLine();
        System.out.print("Masukkan Karakter B = ");
        Y = in.nextLine();

        System.out.println(lcs(X,Y));

    }
}