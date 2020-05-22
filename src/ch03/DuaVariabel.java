package ch03;

import java.util.Scanner;

public class DuaVariabel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai X = ");
        int X = in.nextInt();
        System.out.print("Masukkan Nilai Y = ");
        int Y = in.nextInt();

        if (X > Y){
            System.out.print("Maka Nilai Terbesarnya Adalah X = "+X);
        } else {
            System.out.print("Maka Nilai Terbesarnya Adalah Y = "+Y);
        }

    }
}

