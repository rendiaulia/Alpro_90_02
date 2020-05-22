package ch06;

public class InsertionSort {
    public static void main(String args[]) {
        int bil[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Urutan Array Dari Yang Terkecil ");
        InsertionSort in = new InsertionSort();
        in.sort(bil);
        printArray(bil);
    }
    private  void sort(int bil[]) {
        int i = bil.length;
        for (int x = 1; x < i; ++x) {
            int xy = bil[x];
            int y = x - 1;

            while (y >= 0 && bil[y] > xy) {
                bil[y + 1] = bil[y];
                y = y - 1;
            }
            bil[y + 1] = xy;
        }
    }
    private static void printArray(int bil[]) {
        int i = bil.length;
        for (int x = 0; x < i; ++x)
            System.out.print(bil[x] + " ");

        System.out.println();
    }
}
