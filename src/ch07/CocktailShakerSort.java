package ch07;

import java.util.Arrays;

public class CocktailShakerSort {
    public static void main(String[] args) {
        CocktailShakerSort in = new CocktailShakerSort();
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Nilai Array Sebelum Diurutkan Adalah = ");
        System.out.print(Arrays.toString(bil));
        System.out.println(" ");

        in.cocktailSort(bil);
        System.out.print("Nilai Array Setelah Diurutkan Adalah = ");
        System.out.println(Arrays.toString(bil));
    }

    void cocktailSort(int [] bil) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= bil.length - 2; i++){
                if (bil[i] > bil[i + 1]) {
                    int temp = bil[i];
                    bil[i] = bil[i + 1];
                    bil[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = bil.length - 2; i >= 0; i--){
                if (bil[i] > bil[i + 1]) {
                    int temp = bil[i];
                    bil[i] = bil[i + 1];
                    bil[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}