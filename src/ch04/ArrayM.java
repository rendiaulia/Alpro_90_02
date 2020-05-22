package ch04;

public class ArrayM {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih;
        int hasil;

        selisih = 0;
        hasil = 0;
        System.out.print("Selisih Angka dengan Angka Setelahnya Adalah = ");
        for (int x = 0; x < bil.length - 1; x++){
            if (bil.length - 1 < bil.length) {
                selisih = bil[x] - bil[x + 1];

                hasil+= selisih;
            }
            System.out.print(" ");
            System.out.print(selisih);
        }
        System.out.println(" ");
        System.out.print("Jumlah Seluruh Selisih Adalah = ");
        System.out.print(hasil);
    }
}
