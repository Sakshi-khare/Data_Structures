// Question : Check a number is odd or even

package Code04;

import java.util.*;

public class Number {

    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number:");
    int num =sc.nextInt();

    // Check no is odd or even

    if (num%2==0) {

        System.out.println("Number is even");
        
    }
    else{

         System.out.print("Number is odd");

    }
    
}
}