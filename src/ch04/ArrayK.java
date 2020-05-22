package ch04;

public class ArrayK {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka Yang Lebih Setelahnya Lebih Besar ");
        for (int i = 0; i < bil.length-1; i++)
            if (bil[i + 1] > bil[i]) {
                System.out.print(" " + bil[i]);
            }
    }
}