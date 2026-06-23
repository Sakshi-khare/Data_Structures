// 6. Check voting eligibility for a given age (18+).

package Conditional.Level2;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if (age<0 || age>120) {
            System.out.println("Invalid age");
        }

        else if (age >= 18) {
            System.out.println("Can Vote");
        }
        else  {
            System.out.println("Cannot vote");
        }
    }
    
}
