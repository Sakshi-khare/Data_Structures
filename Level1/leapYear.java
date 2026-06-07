// 3. Check leap year

package Level1;

import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        // check leap or not

        if (year % 400 ==0) {
            System.out.println("Leap Year");
        }
        else if (year % 100 ==0) {
            System.out.println("Not leap year");
        }
        else if (year % 4 == 0) {
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
