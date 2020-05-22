package ch05;

import java.util.Scanner;

public class Euclidean {
        public static void main(String[] args) {
            int m,n,r;

            Scanner dataInput = new Scanner(System.in);

            System.out.print("Masukkan Nilai m : ");
            m = dataInput.nextInt();
            System.out.print("Masukkan Nilai n : ");
            n = dataInput.nextInt();


            r = n % m;

            while (r != 0){
                m = n ;
                n = r ;
                r = m % n ;
            }
            System.out.println("FBP = "+n);
        }
    }