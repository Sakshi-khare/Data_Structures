// 3. Check if a number is divisible by both 3 and 5. 

package Conditional.Level1;

import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       System.out.println("Enter number: ");
        int number = sc . nextInt();

        if (number%3==0 && number%5==0) {
            System.out.println("Number is divisible by both 3 and 5");
        }

        else if (number % 3 == 0) {

           System.out.println("Divisible by 3 only");
       } 

         else if (number % 5 == 0) {

            System.out.println("Divisible by 5 only");

       } 
         else {

            System.out.println("Not divisible by 3 or 5");
        }
        
    }
    
}
