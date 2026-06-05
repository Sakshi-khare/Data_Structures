// 2. Make a program that takes the radius of a circle as input, 
// calculates its radius and area and prints it as output to the user.

package Practice;
import java .util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      System.out.println("enter radius:");
        int radius= sc.nextInt();
    

        double Pi = 3.14;
        // area of circle = pi*r*r

       double Area = Pi*radius*radius;

       System.out.println("The area of a circle:"+Area);
    }
    
}
