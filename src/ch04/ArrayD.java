package ch04;

public class ArrayD {
    public static void main(String[] args) {
        int[]bil= {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        System.out.print("Array Yang Memiliki Kelipatan 3 Adalah ");
        for( int x = 0; x  < bil.length; x++){
            if (bil[x] % 3 == 0) {
                System.out.print(bil[x] + " ");
            }
        }
        System.out.println();
    }
}
