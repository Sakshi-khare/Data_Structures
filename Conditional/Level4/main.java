// 1. Take a character and check if it is a letter, a digit, or neither.

package Conditional.Level4;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is neither a letter nor a digit.");
        }
        
    }
}
