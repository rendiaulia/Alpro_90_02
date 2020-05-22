package ch07;

public class MergeSort {
    public static void main(String[]args) {
        int [] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Nilai Array Sebelum Diurutkan = ");
        for(int i = 0; i < bil.length; i++){
            System.out.print(bil[i]+" ");
        }
        System.out.println();

        mergeSort(bil,0,bil.length-1);
        System.out.println();
        System.out.print("Nilai Array Setelah Diurutkan = ");
        for(int i = 0; i < bil.length; i++)
        {
            System.out.print(bil[i]+" ");
        }
    }
    public static void mergeSort(int [] i , int x, int y) {
        int min = x;
        int max = y;

        if (min>=max){
            return;
        }
        int middle=(min+max)/2;
        mergeSort(i,min,middle);
        mergeSort(i,middle+1,max);
        int end_low=middle;
        int start_high=middle+1;
        while ((x<=end_low) && (start_high<=max)) {
            if (i[min]<i[start_high]) {
                min++;
            }
            else {
                int Temp=i[start_high];
                for (int k=start_high-1;k>=min;k--)
                {
                    i[k+1]=i[k];
                }
                i[min]=Temp;
                min++;
                end_low++;
                start_high++;
            }
        }
    }
}