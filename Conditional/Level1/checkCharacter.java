// 10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special 
// character

package Conditional.Level1;

import java.util.Scanner;

public class checkCharacter {
     public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        // check Lowercase
        if (ch>='a'&& ch<='z') {
            System.out.println("Lowercase");
        }

        else if (ch>='A'&& ch<='Z') {
            System.out.println("Uppercase" );
        }

        else if (ch >= '0' && ch <='9'){
            System.out.println("Digits");
        }
        else{
            System.out.println("Special characters");
        }

     }
}
    

