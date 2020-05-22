package ch04;

public class ArrayG {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Array Kelipatan 5 Yang Sebelumnya Kelipatan 5 Adalah ");
        for (int x = 0; x < bil.length; x++) {
            if (bil [x] % 5 == 0) {
                if (bil [x - 1] % 5 == 0)
                    System.out.print(bil [x] + " ");
            }
        }
        System.out.println();
    }
}