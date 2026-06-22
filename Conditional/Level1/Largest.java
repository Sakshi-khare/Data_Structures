// 6. Take two numbers and print the larger one. 

package Conditional.Level1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a: ");
       int a = sc.nextInt();

       System.out.println("Enter b: ");
       int b = sc.nextInt();

       // Compare 2 numbers

       if (a>b) {

        System.out.println("a is greater ");

       } 

       else if (b>a) {

        System.out.println("b is greater ");
        
       }
       else {

           System.out.println("both are equal ");        
       }
    }
}
