package Conditional.Level1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        // Check even 

        if (number % 2 == 0 ) {

            System.out.println(number + " is even");
            
        }

        else {
                System.out.println(number + " is odd");

        }
    }
}
