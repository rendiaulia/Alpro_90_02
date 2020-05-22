package ch04;

public class ArrayH {
    public static void main(String[]args){
        int [] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int jumlah=0;

        for(int x = 0 ; x < bil.length; x++){
            jumlah += bil[x];
        }
        System.out.println("Jumlah Seluruh Angka Adalah = " +jumlah);
    }
}
