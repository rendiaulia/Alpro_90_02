package ch03;

import java.util.Scanner;


public class TigaVariabel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai X = ");
        int X = in.nextInt();
        System.out.print("Masukkan Nilai Y = ");
        int Y = in.nextInt();
        System.out.print("Masukkan Nilai Z = ");
        int Z = in.nextInt();

        if (X > Y) {
            if (X > Z) {
                System.out.print("Maka Nilai Terbesarnya Adalah X = " + X);
            } else {
                System.out.print("Maka Nilai Terbesarnya Adalah Z = " + Z);
            }
        } else if (Y > X) {
            if (Y > Z) {
                System.out.print("Maka Nilai Terbesarnya Adalah Y = " + Y);
            } else  {
                System.out.print("Maka Nilai Terbesarnya Adalah Z = " + Z);
            }

        }
    }
}
