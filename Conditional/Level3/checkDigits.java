// 4. Check whether a given integer is single-digit, double-digit, or multi-digit.

package Conditional.Level3;

import java.util.Scanner;

public class checkDigits {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int n = Math.abs(num); // Handle negative numbers

        if (n <= 9) {
            System.out.println("Single-digit number");
        } else if (n <= 99) {
            System.out.println("Double-digit number");
        } else {
            System.out.println("Multi-digit number");
        }

        sc.close();
}
}
