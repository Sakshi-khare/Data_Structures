// 8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

package Conditional.Level2;

import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter character: ");
        char character = sc.next().charAt(0);

        if (character >= 'a' && character <='m' ) {
            System.out.println("Between a and m");
        }
        else if (character >='n' && character <='z') {
            System.out.println("Between n and z");
        }
        else{
            System.out.println("Not a Lowercase character");
        }
    }
}
