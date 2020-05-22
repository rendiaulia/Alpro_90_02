package ch04;

public class ArrayN {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int hasil;

        hasil = 0;
        for (int x = 0; x < bil.length - 1; x++){
            hasil = hasil + bil[x];
        }
        System.out.println("Menampilkan Jumlah Angka Dalam Array Dengan Seluruh Angka Sebelumnya ");
        System.out.print(hasil + " =");
        for (int x = 0; x < bil.length - 1; x++){
            System.out.print(" ");
            System.out.print(bil[x]);
        }
    }
}