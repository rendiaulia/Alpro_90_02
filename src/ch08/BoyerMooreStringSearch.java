package ch08;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;

public class BoyerMooreStringSearch {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.println("Algoritma Boyer Moore String Search ");
        System.out.print("Masukkan Kata = ");
        String kata = in.nextLine();

        System.out.print("Masukkan Pola = ");
        String pola = in.nextLine();
        BoyerMooreStringSearch ar = new BoyerMooreStringSearch();

        ar.findPattern(kata, pola);
    }

    public void findPattern(String x, String y) {
    char[] kata = x.toCharArray();
    char[] pola = y.toCharArray();
    int pos = indexOf(kata, pola);
    if (pos == -1)
        System.out.print("Tidak Ada");
    else
        System.out.print("Kata Yang Sama Pertama Ditemukan Posisi = "+ pos);
    }

    public int indexOf(char[] kata, char[] pola) {
        if (pola.length == 0)
            return 0;
        int charTable[] = makeCharTable(pola);
        int offsetTable[] = makeOffsetTable(pola);
        for (int i = pola.length - 1, j; i < kata.length;){
            for (j = pola.length - 1; pola[j] == kata[i]; --i, --j)
                if (j == 0)
                    return i;
                i += Math.max(offsetTable[pola.length - 1 - j], charTable[kata[i]]);
        }
        return -1;
    }

    private int[] makeCharTable(char[] pola) {
        final int ALPHABET_SIZE = 256;
        int[] table = new int[ALPHABET_SIZE];
        for (int i = 0; i < table.length; ++i)
            table[i] = pola.length;
        for (int i = 0; i < pola.length - 1; ++i)
            table[pola[i]] = pola.length - 1 - i;
        return table;
    }

    private static int[] makeOffsetTable(char[] pola) {
        int[] table = new int[pola.length];
        int lastPrefixPosition = pola.length;
        for (int i = pola.length - 1; i >= 0; --i){
            if (isPrefix(pola, i + 1))
                lastPrefixPosition = i + 1;
            table[pola.length - 1 - i] = lastPrefixPosition - i + pola.length - 1;
        }
        for (int i = 0; i < pola.length - 1; ++i){
            int slen = suffixLength(pola, i);
            table[slen] = pola.length - 1 - i + slen;
        }
        return table;
    }

    private static boolean isPrefix(char[] pola, int p) {
        for (int i = p, j = 0; i < pola.length; ++i, ++j)
            if (pola[i] != pola[j])
                return false;
        return true;
    }

    private static int suffixLength(char[] pola, int p) {
        int len = 0;
        for (int i = p, j = pola.length - 1; i >= 0 && pola[i] == pola[j]; --i, --j)
            len += 1;
        return len;
    }
}