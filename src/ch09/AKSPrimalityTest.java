package ch09;

import java.util.Scanner;

public class AKSPrimalityTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Algoritma AKS Primality Test");
        System.out.print("Masukkan Bilangan = ");
        int n = in.nextInt();
        if (isPrime(n))
            System.out.println(n +" Adalah Bilangan Prima");
        else
            System.out.println(n + " Bukan Bilangan Prima");
    }

    public static long x[] = new long[1000];
    public static void coef(int n) {
        x[0] = 1;
        for (int i = 0; i < n; x[0] = -x[0], i++) {
            x[1 + i] = 1;

            for (int j = i; j > 0; j--)
                x[j] = x[j - 1] - x[j];
        }
    }

    public static boolean isPrime(int n) {
        coef(n);
        x[0]++;
        x[n]--;
        int i = n;
        while ((i--) > 0 && x[i] % n == 0) ;
        return i < 0;
    }
}