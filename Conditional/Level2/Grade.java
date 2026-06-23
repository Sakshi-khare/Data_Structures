// 3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).

package Conditional.Level2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks(0-100): ");
        int marks = sc.nextInt();

        if (marks>=90) {
            System.out.println("Grade: A");
        }
        else if(marks >=75){
            System.out.println("Grade: B");
        }
        else if(marks >=65){
             System.out.println("Grade: C");
        }
        else if(marks >=50){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
    }
    
}