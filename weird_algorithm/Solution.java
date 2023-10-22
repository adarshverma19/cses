package cses.weird_algorithm;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        Long number = scanner.nextLong();
        while(number!=1){
            writer.print(number+" ");
            number = number%2==0?(number/2):(number*3+1);
        }
        writer.print(1);
        writer.close();
        scanner.close();
    }
}
