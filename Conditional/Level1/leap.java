// 4. Check if a given year is a leap year. 

package Conditional.Level1;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         System.out.println("Leap Year");
         } 
        else {

           System.out.println("Not a Leap Year");

         }
      }
    
     }










// 🧠 Easy Trick to Remember:

// “Every 4th year is leap,
// every 100th is not,
// but every 400th is leap again.”