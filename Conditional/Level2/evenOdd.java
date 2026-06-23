// 7. Take two numbers and determine whether both are even, both are odd, or one is 
// even and one is odd.

package Conditional.Level2;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        // Both are even 

        if (a%2==0 && b%2==0) {
            System.out.println("Both are even");
        }

        // Both are odd

        else if (a%2!=0 && b%2!=0) {
            System.out.println("Both are odd");
        }
        else{
            System.out.println("one is even and another is odd");
        }
    }
}
