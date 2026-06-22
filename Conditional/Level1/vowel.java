// 9. Take a character and check if it’s a vowel or consonant.


package Conditional.Level1;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        // check Vowel oe consonants

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
             ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowels");
             }
             else{
                System.out.println("Consonants");
             }   

            }        
}
