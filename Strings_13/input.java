// How to take input in java

package Strings_13;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string content: ");

        String str = sc.nextLine();
        System.out.println("Value: " + str);

        String str2 = sc.nextLine();
        System.out.println("Value: " + str2);
    }
    
}
