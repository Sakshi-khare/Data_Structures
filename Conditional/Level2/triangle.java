
// �
// Level 2: Nested If & Multiple Conditions 

//  1.Take three sides and check if they form a valid triangle. 

// Logic : if three sides form a valid triangle is based on the triangle inequality theorem. 
// The theorem says that for three sides to form a triangle, 
// the sum of any two sides must be greater than the third side.

package Conditional.Level2;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a: ");
        int a = sc.nextInt();

        System.out.println("enter b: ");
        int b = sc.nextInt();

        System.out.println("enter c: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Not a valid triangle");
        }
    }
    
}
