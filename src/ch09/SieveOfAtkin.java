package ch09;

import java.util.Scanner;

public class SieveOfAtkin {
    public static void main(String[] args) {
        System.out.println("Algoritma Sieve Of Atkin ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Limit Bilangan = ");
        System.out.print(" ");
        SieveOfAtkin soa = new SieveOfAtkin();
        int n = sc.nextInt();
        soa.getPrimes(n);
    }
    private boolean[] calcPrimes(int limit) {
        boolean[] prime = new boolean[limit + 1];
        prime[2] = true;
        prime[3] = true;

        int root = (int) Math.ceil(Math.sqrt(limit));
        for (int x = 1; x < root; x++){
            for (int y = 1; y < root; y++){
                int n = 4 * x * x + y * y;
                if (n <= limit && (n % 12 == 1 || n % 12 == 5))
                    prime[n] = !prime[n];
                n = 3 * x * x + y * y;
                if (n <= limit && n % 12 == 7)
                    prime[n] = !prime[n];
                n = 3 * x * x - y * y;
                if ((x > y) && (n <= limit) && (n % 12 == 11))
                    prime[n] = !prime[n];
            }
        }
        for (int i = 5; i <= root; i++)
            if (prime[i])
                for (int j = i * i; j < limit; j += i * i)
                    prime[j] = false;
                return prime;
    }

    public void getPrimes(int N) {
        boolean[] primes = calcPrimes(N);
        display(primes);
    }

    public void display(boolean[] primes) {
        System.out.print("Bilangan Prima Dari Limit Diatas = ");
        for (int i = 2; i < primes.length; i++)
            if (primes[i])
                System.out.print(i + " ");
        System.out.println();
    }
}