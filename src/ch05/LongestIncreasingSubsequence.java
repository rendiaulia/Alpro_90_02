package ch05;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    static int Lis (int [] bil, int i) {
        int [] Lis = new int [i];
        int x, y, max = 0;

        for (x = 0; x < i ; x++)
            Lis [x] = 1;

        for (x = 1; x < i ; x++)
            for (y = 0; y < x; y++)
                if (bil [x] > bil [y] && Lis [x] < Lis [y] +1 )
                    Lis [x] = Lis [y] + 1;

        for (x = 0; x < i ; x++)
            if (max < Lis [x])
                max= Lis [x];

        return max;
    }

    public static void main (String [] args ) {
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan Berapa Kali Input: ");
        int array = in.nextInt();
        int [] bil=new int[array];
        int min,max;
        for(int y = 0 ; y < array ; y++){
            System.out.print("Masukkan Angka Ke-"+y+" : ");
            bil[y]= in.nextInt();
        }
        min=bil[0];
        max=bil[0];

        int i = bil.length;
        System.out.println();
        System.out.println ("Panjang LIS = " + Lis (bil, i));
    }
}
