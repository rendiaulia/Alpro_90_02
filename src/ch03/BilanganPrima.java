package ch03;

import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int Angka = in.nextInt();

        int bil;
        boolean prima = true;

        for (int bagi = 2; bagi <= Angka / 2; bagi++){
            bil = Angka % bagi;

            if (bil == 0){
                prima = false;
                break;
            }
        }
        if(prima && ((Angka > 0 )&&(Angka !=1)))
            System.out.println(Angka + " Adalah Bilangan Prima");
        else
            System.out.println(Angka + " Bukan Bilangan Prima");
    }
}