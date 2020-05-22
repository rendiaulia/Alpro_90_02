package ch04;

public class ArrayC {
    public static void main(String[] args) {
            int[] bil ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        System.out.print("Angka Angka Ganjil Dalam Array Adalah ");
        for (int x = 0; x < bil.length; x++){
            if (bil [x] % 2!= 0){
                System.out.print(bil[x]+" ");
            }
        }
        System.out.println();
    }
}
