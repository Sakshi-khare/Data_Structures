// Level 1: Simple Conditions (Getting started) 

// 1. Take a number and print whether it’s positive, negative, or zero

package Conditional.Level1;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        // Check positive , negative or zero

        if (num > 0 ) {
            System.out.println("Positive");
        }
        else if (num < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
    
}
