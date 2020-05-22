package ch06;

public class SelectionSort {
    public static void main(String args[]) {
        SelectionSort in = new SelectionSort();
        int bil[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        in.sort(bil);
        System.out.println("Urutan Array Dari Yang Terkecil ");
        in.printArray(bil);
    }
    private void sort(int bil[]) {
        int i = bil.length;
        for (int x = 0; x < i-1; x++){

            int min_idx = x;
            for (int y = x+1; y < i ; y++)
                if (bil[y] < bil[min_idx])
                    min_idx = y;
            int temp = bil[min_idx];
            bil[min_idx] = bil[x];
            bil[x] = temp;
        }
    }
    private void printArray(int bil[]) {
        int i = bil.length;
        for (int x = 0; x < i; ++x)
            System.out.print(bil[x]+" ");
        System.out.println();
    }
}