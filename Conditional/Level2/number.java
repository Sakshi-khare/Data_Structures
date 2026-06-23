// 4. Check if one of two given numbers is a multiple of the other

package Conditional.Level2;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Cannot check(division by zero)");
        }

          if (a%b==0 || b%a==0) {
            System.out.println("Multiple");
          }
          else{
            System.out.println("Not a multiple");
          }
    }
}
