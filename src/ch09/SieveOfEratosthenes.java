package ch09;

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Algoritma Sieve Of Eratosthenes");
        System.out.print("Masukkan Limit Bilangan = ");
        System.out.print(" ");
        int num = sc.nextInt();
        boolean[] bool = new boolean[num];

        for (int x = 0; x< bool.length; x++) {
            bool[x] = true;
        }
        for (int x = 2; x< Math.sqrt(num); x++) {
            if(bool[x] == true) {
                for(int y = (x*x); y<num; y = y+x) {
                    bool[y] = false;
                }
            }
        }
        System.out.print("Bilangan Prima Dari Limit Diatas = ");
        for (int x = 2; x< bool.length; x++) {
            if(bool[x]==true) {
                System.out.print(" ");
                System.out.print(x);
            }
        }
    }
}