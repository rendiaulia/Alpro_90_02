package ch08;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class KnuthMorrisPratt {
    private final int[] failure;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Algoritma Knuth Morris Pratt");
        System.out.print("Masukkan Kata = ");
        String kata = in.nextLine();

        System.out.print("Masukkan Pola = ");
        String pola = in.nextLine();
        KnuthMorrisPratt kmp = new KnuthMorrisPratt(kata, pola);
    }

    public KnuthMorrisPratt(String kata, String pola) {
        failure = new int[pola.length()];
        fail(pola);
        int pos = posMatch(kata, pola);
        if (pos == -1)
            System.out.print("Tidak Ada");
        else
            System.out.print("Kata Yang Sama Pertama Ditemukan Posisi = "+ pos);
    }

    private void fail(String pola) {
        int n = pola.length();
        failure[0] = -1;
        for (int j = 1; j < n; j++){
            int i = failure[j - 1];
            while ((pola.charAt(j) != pola.charAt(i + 1)) && i >= 0)
                i = failure[i];
            if (pola.charAt(j) == pola.charAt(i + 1))
                failure[j] = i + 1;
            else
                failure[j] = -1;
        }
    }

    private int posMatch(String kata, String pola){
        int i = 0, j = 0;
        int lens = kata.length();
        int lenp = pola.length();
        while (i < lens && j < lenp) {
            if (kata.charAt(i) == pola.charAt(j)) {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = failure[j - 1] + 1;
        }
        return ((j == lenp) ? (i - lenp) : -1);
    }
}