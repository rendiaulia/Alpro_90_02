package ch04;

public class ArrayI {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int  hasil;

        hasil = 0;
        System.out.println("Selisih Angka dengan Angka Setelahnya = ");
        for (int x = 0; x < bil.length - 1; x++) {
            if (bil.length - 1 < bil.length) {
                hasil = bil[x] - bil[x + 1];
            }

            System.out.println("Angka Sebelum : " + bil[x]);
            System.out.println("Angka Sesudah : " + bil[x + 1]);
            System.out.println("Selisih : " + hasil);
        }

    }
}
