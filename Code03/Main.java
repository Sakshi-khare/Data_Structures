// Ques : SIMPLE INTREST

package Code03;

import java.util.*;



public class Main {
    public static void main (String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Principal:");
    int P = sc.nextInt();

    System.out.println("Enter Rate:");
    int R = sc.nextInt();

    System.out.println("Enter Time:");
    int T = sc.nextInt();

    int Interest = (P*R*T) / 100;

    System.out.println("The Simple Interst is : " + Interest);
    
}
}
