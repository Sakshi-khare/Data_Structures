// �
// �
// Level 3: Math and Number Logic 
// 1. Take a 3-digit number and check if all digits are distinct.

package Conditional.Level3;

import java.util.Scanner;

public class DistictDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a 3 digit number:  ");
        int num = sc.nextInt();

        // Extract digits one by one 

        int last = num % 10;     // last digit 
        int middle = (num/10) % 10; // middle digit
        int first = num / 100;    // first digit

        // 

        if (first!= middle && middle!= last && last!=first) {
            System.out.println("All digits are distict");
        }
        else{
            System.out.println("Digits are not distinct");
        }
    }
}
