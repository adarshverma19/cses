package cses.repetitions;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dnaString = scanner.next();
        char[] dna = dnaString.toCharArray();
        char prev = dna[0];
        int count = 0, max = 0;
        for (int i = 0; i < dna.length; i++) {
            if (dna[i] == prev) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
            prev = dna[i];
        }
        System.out.println(max);
        scanner.close();
    }
}
