// 2. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or 
// scalene. 

package Conditional.Level2;

import java.util.Scanner;

public class typesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a: ");
        int a = sc.nextInt();

        System.out.println("enter b: ");
        int b = sc.nextInt();

         System.out.println("enter c: ");
        int c = sc.nextInt();

        // Valid Triangle

        if (a+b>c && b+c>a && a+c>b) {
            
            // Equilateral triangle => nested loop

            if (a==b && b==c) {
                System.out.println("Equilateral triangle");
            }

            // isoceles triangle 

            else if (a==b || b==c || c==a) {
                System.out.println("Isoceles triangle");
            }
            else{
                System.out.println("Scalene triangle");
            }
        }
    }
    
}
