package ch04;

public class ArrayE {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        String pref1 = "2";


        System.out.print("Array Yang Memiliki Angka 2 Adalah ");
        for (int x = 0; x < bil.length; x++) {
            if (String.valueOf(bil[x]).startsWith(pref1) || String.valueOf(bil[x]).endsWith(pref1)) {
                System.out.print(bil[x] + " ");
            }
        }
        System.out.println();
    }
}