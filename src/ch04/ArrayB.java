package ch04;

import java.util.Scanner;

public class ArrayB {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        search(bil);

    }
    public static void search(int [] y) {
        int x;
        int xx = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai Array : ");

        x = in.nextInt();
        for (int i = 0; i < y.length; i++) {
            if (y[i] == x) {
                System.out.println("Bilangan "+ x + " Ditemukan Pada Posisi : " + i);
                xx = 1;
            }
        }
        if (xx == 0) {
            System.out.println("Bilangan " + x + " Tidak Ditemukan Di Dalam Array");
        }
    }

}