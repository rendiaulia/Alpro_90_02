package ch05;

import java.util.Scanner;

public class Kadane {
    public int kandaneForMaxSubArray(int[] bil) {
        int makssementara = 0;
        int makstetap = 0;
        for (int x = 0; x < bil.length; x++) {
            makssementara += bil[x];
            if (makssementara < 0) {
                makssementara = 0;
            }
            if (makstetap < makssementara) {
                makstetap = makssementara;
            }
        }
        return makstetap;
    }

   public static void main(String args[]) {
            Scanner in=new Scanner(System.in);
            System.out.print("Masukkan Berapa Kali Input: ");
            int array = in.nextInt();
            int []bil=new int[array];
            int min,max;
            for(int i = 0 ; i < array ;i++){
                System.out.print("Masukkan angka ke-"+i+" : ");
                bil[i]= in.nextInt();
            }
            min=bil[0];
            max=bil[0];

        Kadane maxSum = new Kadane();
        System.out.println("Nilai Maksimum Array Adalah = " + maxSum.kandaneForMaxSubArray(bil));
    }
}
