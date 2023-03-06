package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse: ");
        int num = scanner.nextInt();
        int reverse = 0;
        int remainder;
        for ( ; num != 0; num= num / 10) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("reverse number is: " +reverse);
    }
}