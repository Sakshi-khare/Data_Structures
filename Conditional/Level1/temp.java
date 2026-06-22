// 7. Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions. 

package Conditional.Level1;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature");
         int temperature = sc.nextInt();

         if (temperature>=30) {
            System.out.println("Hot");

         }
         else if (temperature<=29 && temperature>=20) {
            System.out.println("Warm");
            
         }
         else{
            System.out.println("Cold");
         }

    }
    
}
