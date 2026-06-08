// 8. Write a function that takes in the radius as input and returns the 
// circumference of a circle. 

package Practice;
import java.util.*;

public class q8 {

    public static double findCircumference(double radius){
       
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        System.out.println("enter radius: ");
        double radius=sc.nextDouble();
        double result=findCircumference(radius);
        System.out.println(result);
    }
    
}
