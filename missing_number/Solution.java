package cses.missing_number;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long seriesSum = n * (n + 1) / 2;
        n -= 1;
        long sum = 0l;
        while (n-- > 0) {
            sum += scanner.nextInt();
        }
        long answer = seriesSum - sum;
        System.out.println(answer);
        scanner.close();
    }
}