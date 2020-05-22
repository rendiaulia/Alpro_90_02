package ch03;

import java.util.Scanner;

public class PembagiTerkecil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bil;
        System.out.print("Masukkan Angka Yang Ingin Dibagi = ");
        bil = in.nextInt();

        for (int x = 3 ; x < bil ; x++){
            if (bil % x == 0){
                System.out.print("Maka Pembagi Terkecilnya Adalah = "+x);
                break;
            }
        }
    }
}
