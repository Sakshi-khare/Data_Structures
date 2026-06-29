// 3. Take a 4-digit number and check if the first and last digits are equal. 

package Conditional.Level3;

import java.util.Scanner;

public class EqualDigits {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("enter a 4 digit number:  ");
        int num = sc.nextInt();

        // Extract digits one by one 

        int last = num % 10;     // last digit 
        int first = num / 1000;

        if (first == last && last == first) {
            System.out.println("First and last digits are equal");
        }
        else{
            System.out.println("NOt equal");
        }
    }
}
