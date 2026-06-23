// 5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good 
// Evening”, or “Good Night”. 

package Conditional.Level2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hour(0-23): ");
        int hours = sc.nextInt();

        if (hours>=5 && hours<12) {
            System.out.println("GOOD MORNING");
        }
        else if (hours>=12 && hours<17) {
            System.out.println("GOOD AFTERNOON");
        }
        else if (hours>=17 && hours<21) {
            System.out.println("GOOD EVENING");
        }
        else {
            System.out.println("GOOD NIGHT");
        }
    }
}
