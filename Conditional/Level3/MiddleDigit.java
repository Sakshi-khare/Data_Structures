// 2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or 
// neither. 

package Conditional.Level3;

import java.util.Scanner;

public class MiddleDigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("enter a 3 digit number:  ");
        int num = sc.nextInt();

        // Extract digits one by one 

        int last = num % 10;     // last digit 
        int middle = (num/10) % 10; // middle digit
        int first = num / 100;   // first

        if (middle>first && middle>last) {
            System.out.println("Middle digit is the largest");
        }
        else if (middle<first && middle <last) {
            System.out.println("Middle digit is the smallest");
        }
        else{
            System.out.println("It is neither largest nor smallest");
        }
    }
    
}
