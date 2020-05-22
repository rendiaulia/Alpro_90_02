package ch04;

public class ArrayL {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Jumlah Angka Genap dengan Angka Genap Setelahnya ");
        for (int x = 0; x < bil.length - 1; x++){

        }
        int hasil = bil[0] + bil[1];
        System.out.println("Angka Sebelum : " + bil[0]);
        System.out.println("Angka Sesudah : " + bil[1]);
        System.out.println("Jumlah : " + hasil);


        int hasil1 = bil[7] + bil[8];
        System.out.println("Angka Sebelum : " + bil[7]);
        System.out.println("Angka Sesudah : " + bil[8]);
        System.out.println("Jumlah : " + hasil1);


        int hasil2 = bil[10] + bil[11];
        System.out.println("Angka Sebelum : " + bil[10]);
        System.out.println("Angka Sesudah : " + bil[11]);
        System.out.println("Jumlah : " + hasil2);

    }
}
